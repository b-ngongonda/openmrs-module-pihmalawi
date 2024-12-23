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

import org.openmrs.Location;
import org.openmrs.module.pihmalawi.PihMalawiConstants;
import org.openmrs.module.pihmalawi.metadata.HivMetadata;
import org.openmrs.module.pihmalawi.metadata.LocationTags;
import org.openmrs.module.pihmalawi.reporting.definition.dataset.definition.SqlFileDataSetDefinition;
import org.openmrs.module.pihmalawi.reporting.definition.renderer.TraceReportRenderer;
import org.openmrs.module.reporting.ReportingConstants;
import org.openmrs.module.reporting.dataset.definition.MultiParameterDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.report.ReportDesign;
import org.openmrs.module.reporting.report.definition.ReportDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class IC3TraceReport extends ApzuReportManager {

    public static final String SQL_DATA_SET_RESOURCE = "org/openmrs/module/pihmalawi/reporting/datasets/sql/trace-data.sql";
    public static final String LOCATION_NAME_PARAM = "location";
    public static final String MIN_WKS_PARAM = "minWeeks";
    public static final Parameter MAX_WKS_PARAM = new Parameter("maxWeeks", "Late max number of weeks", Integer.class);
    public static final Parameter LAB_WEEKS_PARAMETER = new Parameter("labWeeks", "Weeks of lab results to include", Integer.class);

	@Autowired
	private HivMetadata hivMetadata;

	@Override
	public String getUuid() {
		return "00ac1e0f-7d67-4566-b88f-2f4f06537ffa";
	}

	@Override
	public String getName() {
		return "IC3 - TRACE Report";
	}

    @Override
    public String getDescription() {
        return "TRACE Report, revision March 2017";
    }

    @Override
    public List<Parameter> getParameters() {
        List<Parameter> l = new ArrayList<Parameter>();
        l.add(ReportingConstants.END_DATE_PARAMETER);
        l.add(MAX_WKS_PARAM);
        l.add(LAB_WEEKS_PARAMETER);
        return l;
    }

	public String getReportDesignUuid() {
		return "12d1c2e0-687f-4abe-b93f-674af5ada06f";
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

        for (Location location : hivMetadata.getHivStaticSystemLocations()) {
            add2WeekDataSet(rd, location);
        }
        add6WeekDataSet(rd, hivMetadata.getHivStaticSystemLocations());

        return rd;
    }

    public void add2WeekDataSet(ReportDefinition rd, Location location) {
        String dsName = location.getName() + " - 2 weeks";
        MultiParameterDataSetDefinition multiParamDsd = new MultiParameterDataSetDefinition();
        multiParamDsd.addParameter(ReportingConstants.END_DATE_PARAMETER);
        multiParamDsd.addParameter(MAX_WKS_PARAM);
        multiParamDsd.addParameter(LAB_WEEKS_PARAMETER);
        multiParamDsd.setBaseDefinition(getBaseDsd());
        Map<String, Object> mappings = Mapped.straightThroughMappings(rd);
        mappings.put(LOCATION_NAME_PARAM, location.getName());
        mappings.put(MIN_WKS_PARAM, 2);
        //mappings.put(MAX_WKS_PARAM, 6);
        multiParamDsd.addIteration(mappings);
        rd.addDataSetDefinition(dsName, Mapped.mapStraightThrough(multiParamDsd));
    }

    public void add6WeekDataSet(ReportDefinition rd, List<Location> locations) {
        String dsName = "6 weeks";
        MultiParameterDataSetDefinition multiParamDsd = new MultiParameterDataSetDefinition();
        multiParamDsd.addParameter(ReportingConstants.END_DATE_PARAMETER);
        multiParamDsd.addParameter(MAX_WKS_PARAM);
        multiParamDsd.addParameter(LAB_WEEKS_PARAMETER);
        multiParamDsd.setBaseDefinition(getBaseDsd());
        for (Location location : locations) {
            Map<String, Object> mappings = Mapped.straightThroughMappings(rd);
            mappings.put(LOCATION_NAME_PARAM, location.getName());
            mappings.put(MIN_WKS_PARAM, 6);
            //mappings.put(MAX_WKS_PARAM, 12);
            multiParamDsd.addIteration(mappings);
        }
        rd.addDataSetDefinition(dsName, Mapped.mapStraightThrough(multiParamDsd));
    }

    public SqlFileDataSetDefinition getBaseDsd() {
        SqlFileDataSetDefinition dsd = new SqlFileDataSetDefinition();
        dsd.setConnectionPropertyFile(PihMalawiConstants.OPENMRS_WAREHOUSE_CONNECTION_PROPERTIES_FILE_NAME);
        dsd.setSqlResource(SQL_DATA_SET_RESOURCE);
        dsd.addParameter(ReportingConstants.END_DATE_PARAMETER);
        dsd.addParameter(MAX_WKS_PARAM);
        dsd.addParameter(LAB_WEEKS_PARAMETER);
        dsd.addParameter(new Parameter(LOCATION_NAME_PARAM, LOCATION_NAME_PARAM, String.class));
        dsd.addParameter(new Parameter(MIN_WKS_PARAM, MIN_WKS_PARAM, Integer.class));
        //dsd.addParameter(new Parameter(MAX_WKS_PARAM, MAX_WKS_PARAM, Integer.class));
        return dsd;
    }

    @Override
    public List<ReportDesign> constructReportDesigns(ReportDefinition reportDefinition) {
        List<ReportDesign> l = new ArrayList<ReportDesign>();
        ReportDesign design = new ReportDesign();
        design.setUuid(getReportDesignUuid());
        design.setName("Excel");
        design.setReportDefinition(reportDefinition);
        design.setRendererType(TraceReportRenderer.class);
        l.add(design);
        return l;
    }
}
