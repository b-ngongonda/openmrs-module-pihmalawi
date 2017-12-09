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
package org.openmrs.module.pihmalawi.reporting.reports;

import org.openmrs.module.pihmalawi.PihMalawiConstants;
import org.openmrs.module.pihmalawi.metadata.HivMetadata;
import org.openmrs.module.pihmalawi.reporting.definition.dataset.definition.SqlFileIndicatorDataSetDefinition;
import org.openmrs.module.reporting.ReportingConstants;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.report.ReportDesign;
import org.openmrs.module.reporting.report.definition.ReportDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IC3IndicatorReport extends ApzuReportManager {

    @Autowired
    HivMetadata metadata;

    public static final String SQL_DATA_SET_RESOURCE = "org/openmrs/module/pihmalawi/reporting/datasets/sql/ic3-indicators.sql";
    public static final String EXCEL_REPORT_DESIGN_UUID = "c5c4ca8a-9e89-11e7-a379-0242ac110001";

	@Override
	public String getUuid() {
		return "cd513bc3-9e89-11e7-a379-0242ac110001";
	}

	@Override
	public String getName() {
		return "IC3 Indicator Report";
	}

    @Override
    public String getDescription() {
        return "IC3 Indicator, revision December 2017";
    }

    @Override
    public List<Parameter> getParameters() {
        List<Parameter> l = new ArrayList<Parameter>();
        l.add(ReportingConstants.START_DATE_PARAMETER);
        l.add(ReportingConstants.END_DATE_PARAMETER);
        return l;
    }

    /**
     * @see ApzuReportManager#constructReportDefinition()
     */
    @Override
    public ReportDefinition constructReportDefinition() {

        ReportDefinition rd = new ReportDefinition();
        rd.setUuid(getUuid());
        rd.setName(getName());
        rd.setDescription(getDescription());
        rd.setParameters(getParameters());

        SqlFileIndicatorDataSetDefinition dsd = new SqlFileIndicatorDataSetDefinition();
        dsd.setParameters(getParameters());
        dsd.setConnectionPropertyFile(PihMalawiConstants.OPENMRS_WAREHOUSE_CONNECTION_PROPERTIES_FILE_NAME);
        dsd.setSqlResource(SQL_DATA_SET_RESOURCE);
        dsd.setIndicatorNameColumn("indicator");
        dsd.setIndicatorDescriptionColumn("description");
        dsd.setIndicatorValueColumn("indicator_value");

        rd.addDataSetDefinition("ic3IndicatorReport", Mapped.mapStraightThrough(dsd));

        return rd;
    }

    @Override
    public List<ReportDesign> constructReportDesigns(ReportDefinition reportDefinition) {
        List<ReportDesign> l = new ArrayList<ReportDesign>();
        ReportDesign design = createExcelTemplateDesign(EXCEL_REPORT_DESIGN_UUID, reportDefinition, "IC3IndicatorReport.xls");
        design.addPropertyValue("upperOrLowerNeno", getUpperOrLowerNeno());
        l.add(design);
        return l;
    }

    private String getUpperOrLowerNeno() {
        String tag = metadata.getCurrentSystemLocationTag();
        return tag.replace("_", " ");
    }
}