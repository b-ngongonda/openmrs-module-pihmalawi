/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.pihmalawi.alert;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.module.pihmalawi.common.JsonObject;
import org.openmrs.module.reporting.common.DateUtil;
import org.openmrs.module.reporting.common.ObjectUtil;

import javax.script.ScriptEngine;
import java.util.*;

/**
 * Tests the AlertEngine
 */
public class AlertEngineTest {

    AlertEngine engine = new AlertEngine();

    @Test
    public void shouldTestFunctionsAndConstants() throws Exception {

        test("yearsBetween", 2000, 3, 1, 1980, 2, 1, 20);
        test("yearsBetween", 2000, 3, 1, 1980, 3, 1, 20);
        test("yearsBetween", 2000, 3, 1, 1980, 3, 2, 19);
        test("yearsBetween", 2000, 3, 1, 1980, 2, 28, 20);
        test("yearsBetween", 2000, 1, 1, 1999, 12, 31, 0);

        test("monthsBetween", 2005, 3, 5, 2000, 2, 5, 61);
        test("monthsBetween", 2005, 3, 5, 2000, 12, 6, 50);
        test("monthsBetween", 2005, 3, 5, 2000, 10, 4, 53);

        test("daysBetween", 2020, 3, 1, 2020, 2, 1, 29);
        test("daysBetween", 2021, 3, 1, 2021, 2, 1, 28);
        test("daysBetween", 2005, 1, 31, 2004, 10, 24, 99);

        ScriptEngine scriptEngine = engine.createScriptEngine(ObjectUtil.toMap("hello", "world"));

        Assert.assertEquals(Boolean.TRUE, scriptEngine.eval("missing()"));
        Assert.assertEquals(Boolean.TRUE, scriptEngine.eval("missing(null)"));
        Assert.assertEquals(Boolean.TRUE, scriptEngine.eval("missing(\"\")"));
        Assert.assertEquals(Boolean.TRUE, scriptEngine.eval("missing('')"));
        Assert.assertEquals(Boolean.FALSE, scriptEngine.eval("missing('hello')"));
        Assert.assertEquals(Boolean.FALSE, scriptEngine.eval("missing(hello)"));
        Assert.assertEquals(Boolean.TRUE, scriptEngine.eval("has([1, 2, 3], 1)"));
        Assert.assertEquals(Boolean.FALSE, scriptEngine.eval("has([1, 2, 3], 4)"));

        Assert.assertNotNull(scriptEngine.eval("active_art"));
    }

    @Test
    public void shouldTestHasAnyFunction() throws Exception {
        Map<String, Object> variables = new HashMap<String, Object>();

        List<String> symptomsList = Arrays.asList("656f10da-977f-11e1-8993-905e29aff6c1", "654a56be-977f-11e1-8993-905e29aff6c1");

        String[] tb_symptoms = new String[] {"fever", "nightSweats", "cough"};
        List<String> tbSymptomsList = Arrays.asList("656f10da-977f-11e1-8993-905e29aff6c1", "654a56be-977f-11e1-8993-905e29aff6c1");

        variables.put("current_symptoms", symptomsList); //nightSweats, weightLoss

        ScriptEngine scriptEngine = engine.createScriptEngine(variables);
        Object res = scriptEngine.eval( "hasAny(current_symptoms, " +
                "['656f10da-977f-11e1-8993-905e29aff6c1', '654a56be-977f-11e1-8993-905e29aff6c1'])");

        Assert.assertEquals(true, res);

    }

    @Test
    public void shouldReturnEligibleForBloodGlucoseScreeningNotEnrolled() throws Exception {
        //today
        Date effectiveDate = DateUtil.getStartOfDay(new Date());

        // and 1 year and 1 day ago
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        cal.add(Calendar.DATE, -1);


        JsonObject patientData = new JsonObject();
        patientData.put("today", effectiveDate);
        patientData.put("location", "0d417e38-5ab4-11e0-870c-9f6107fee88e"); //Ligowe HC
        patientData.put("age_years", "55");
        patientData.put("art_number", "LGWE-0143");

        patientData.put("last_bmi", "22.65");
        patientData.put("last_blood_sugar_result_date", cal.getTime());
        patientData.put("family_history_diabetes", null);
        // cough, hypertension
        List<HashMap<String, String>> chronic_care_diagnoses = Arrays.asList(new HashMap<String, String>() {{
            put("date", "1265086800000");
            put("value", "65460a32-977f-11e1-8993-905e29aff6c1");
        }}, new HashMap<String, String>() {{
            put("date", "1265086800000");
            put("value", "654abfc8-977f-11e1-8993-905e29aff6c1");
        }});
        patientData.put("chronic_care_diagnoses", chronic_care_diagnoses);

        List<AlertDefinition> alertDefinitions = new ArrayList<AlertDefinition>();
        AlertDefinition alert = new AlertDefinition();
        alert.setName("eligible-for-blood-glucose-screening-not-enrolled");
        alert.setCategories(Arrays.asList("blood-glucose", "screening-eligibility"));
        alert.setConditions(Arrays.asList("missing(chronic_care_diagnoses) || (!missing(chronic_care_diagnoses) && !hasChronicCareDiagnosis(chronic_care_diagnoses, [diabetes, diabetes_type_1, diabetes_type_2]))",
                "missing(last_blood_sugar_result_date) || (!missing(last_blood_sugar_result_date) && yearsBetween(today, last_blood_sugar_result_date) >= 1)",
                "(age_years > 30) || (age_years > 18 && last_bmi > 25) || (!missing(chronic_care_diagnoses) && hasChronicCareDiagnosis(chronic_care_diagnoses, [hypertension])) || (family_history_diabetes == true)"));
        alert.setAlert("Enroll if confirmed by clinician meets criteria");
        alert.setAction("Action: Eligible for blood sugar test");
        alert.setEnabled(true);
        alertDefinitions.add(alert);

        List<AlertDefinition> evaluateMatchingAlerts = engine.evaluateMatchingAlerts(alertDefinitions, patientData);
        Assert.assertEquals(evaluateMatchingAlerts != null && evaluateMatchingAlerts.size() > 0, true);
        Assert.assertEquals(((AlertDefinition)evaluateMatchingAlerts.get(0)).getName().compareTo("eligible-for-blood-glucose-screening-not-enrolled"), 0);
    }

    @Test
    public void shouldTestChronicCareDiagnoses() throws Exception {

        Map<String, Object> variables = new HashMap<String, Object>();
        //diabetes, hypertension
        List<HashMap<String, String>> hashMapList = Arrays.asList(new HashMap<String, String>() {{
            put("date", "1265086800000");
            put("value", "6567426a-977f-11e1-8993-905e29aff6c1");
        }}, new HashMap<String, String>() {{
            put("date", "1265086800000");
            put("value", "654abfc8-977f-11e1-8993-905e29aff6c1");
        }});
        variables.put("chronic_care_diagnoses", hashMapList);
        ScriptEngine scriptEngine = engine.createScriptEngine(variables);

        Object res = scriptEngine.eval( "hasChronicCareDiagnosis(chronic_care_diagnoses, " +
                "['6567426a-977f-11e1-8993-905e29aff6c1', '65714206-977f-11e1-8993-905e29aff6c1'])"); //diabetes, diabetes_type_1

        Assert.assertEquals(true, res);

    }

    protected void test(String function, int y1, int m1, int d1, int y2, int m2, int d2, double expected) throws Exception {
        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("t1", DateUtil.getDateTime(y1, m1, d1).getTime());
        variables.put("t2", DateUtil.getDateTime(y2, m2, d2).getTime());
        Object res = engine.createScriptEngine(variables).eval(function + "(t1, t2)");
        Assert.assertEquals(expected, res);
    }

    @Test
    public void shouldTestLoadingAlerts() throws Exception {
        List<AlertDefinition> alertDefinitions = engine.getAlertDefinitions();
        Assert.assertTrue(alertDefinitions.size() > 0);
    }
}
