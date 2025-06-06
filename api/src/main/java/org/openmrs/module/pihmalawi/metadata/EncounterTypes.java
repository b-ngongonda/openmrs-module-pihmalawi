/**
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

package org.openmrs.module.pihmalawi.metadata;

import org.openmrs.module.metadatadeploy.descriptor.EncounterTypeDescriptor;

/**
 * Constants for all defined encounter types
 */
public class EncounterTypes {

    // TODO: Add the others currently defined in here, and to the bundle

    public static EncounterTypeDescriptor ADMINISTRATION = new EncounterTypeDescriptor() {
        public String uuid() { return "664b9280-977f-11e1-8993-905e29aff6c1"; }
        public String name() { return "ADMINISTRATION"; }
        public String description() { return "An administration encounter"; }
    };

    public static EncounterTypeDescriptor HTN_DIABETES_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "664b9442-977f-11e1-8993-905e29aff6c1"; }
        public String name() { return "DIABETES HYPERTENSION INITIAL VISIT"; }
        public String description() { return "Diabetes hypertension initial visit"; }
    };

    public static EncounterTypeDescriptor HTN_DIABETES_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "66079de4-a8df-11e5-bf7f-feff819cdc9f"; }
        public String name() { return "DIABETES HYPERTENSION FOLLOWUP"; }
        public String description() { return "Visit rows on the Hypertension and Diabetes card"; }
    };

    public static EncounterTypeDescriptor HTN_DIABETES_TESTS = new EncounterTypeDescriptor() {
        public String uuid() { return "6607a082-a8df-11e5-bf7f-feff819cdc9f"; }
        public String name() { return "DIABETES HYPERTENSION LAB TESTS"; }
        public String description() { return "Lab tests for Hypertension and Diabetes patients"; }
    };

    public static EncounterTypeDescriptor HTN_DIABETES_ANNUAL_TESTS = new EncounterTypeDescriptor() {
        public String uuid() { return "76f2759c-d729-11e6-8072-dce9fc320581"; }
        public String name() { return "ANNUAL DIABETES HYPERTENSION LAB TESTS"; }
        public String description() { return "Annual Lab tests for Hypertension and Diabetes patients"; }
    };

    public static EncounterTypeDescriptor HTN_DIABETES_HOSPITALIZATIONS = new EncounterTypeDescriptor() {
        public String uuid() { return "6607a186-a8df-11e5-bf7f-feff819cdc9f"; }
        public String name() { return "DIABETES HYPERTENSION HOSPITALIZATIONS"; }
        public String description() { return "Hospitalizations for Hypertension and Diabetes patients"; }
    };

	public static EncounterTypeDescriptor ASTHMA_INITIAL = new EncounterTypeDescriptor() {
		public String uuid() { return "a95dc43f-925c-11e5-a1de-e82aea237783"; }
		public String name() { return "ASTHMA_INITIAL"; }
		public String description() { return "Top section of the Asthma Mastercard"; }
	};

    public static EncounterTypeDescriptor ASTHMA_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "f4596df5-925c-11e5-a1de-e82aea237783"; }
        public String name() { return "ASTHMA_FOLLOWUP"; }
        public String description() { return "Visit rows in the Asthma Mastercard"; }
    };

    public static EncounterTypeDescriptor ASTHMA_HOSPITALIZATION = new EncounterTypeDescriptor() {
        public String uuid() { return "2478C35B-9A71-4BD5-86B6-E8CCE594E934"; }
        public String name() { return "ASTHMA HOSPITALIZATION"; }
        public String description() { return "Hospitalization for Lung Disease"; }
    };    

    public static EncounterTypeDescriptor ASTHMA_PEAKFLOW = new EncounterTypeDescriptor() {
        public String uuid() { return "46028b88-c538-11e5-9912-ba0be0483c18"; }
        public String name() { return "ASTHMA PEAK FLOW"; }
        public String description() { return "Peak flow / Spirometry for Lung Disease"; }
    };

    public static EncounterTypeDescriptor EPILEPSY_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "D8CBF1B9-EC74-4858-8764-2350E2A9925B"; }
        public String name() { return "EPILEPSY_INITIAL"; }
        public String description() { return "Top section of the Epilepsy Mastercard"; }
    };

    public static EncounterTypeDescriptor EPILEPSY_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "1EEDD2F6-EF28-4409-8E8C-F4FEC0746E72"; }
        public String name() { return "EPILEPSY_FOLLOWUP"; }
        public String description() { return "Visit rows in the Epilepsy Mastercard"; }
    };

    public static EncounterTypeDescriptor MENTAL_HEALTH_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "3F94849C-F245-4593-BCC8-879EAEA29168"; }
        public String name() { return "MENTAL_HEALTH_INITIAL"; }
        public String description() { return "Top section of the Mental Health Mastercard"; }
    };

    public static EncounterTypeDescriptor MENTAL_HEALTH_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "D51F45F8-0EEA-4231-A7E9-C45D57F1CBA1"; }
        public String name() { return "MENTAL_HEALTH_FOLLOWUP"; }
        public String description() { return "Visit rows in the Mental Health Mastercard"; }
    };

    public static EncounterTypeDescriptor CHRONIC_CARE_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "664bb6de-977f-11e1-8993-905e29aff6c1"; }
        public String name() { return "CHRONIC_CARE_INITIAL"; }
        public String description() { return "Top section of the Chronic Care Mastercard"; }
    };  

    public static EncounterTypeDescriptor CHRONIC_CARE_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "664bb896-977f-11e1-8993-905e29aff6c1"; }
        public String name() { return "CHRONIC_CARE_FOLLOWUP"; }
        public String description() { return "Visit rows in the Chronic Care Mastercard"; }
    };  

    public static EncounterTypeDescriptor ART_ANNUAL_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "ebaa2ad8-baaa-11e6-91a8-5622a9e78e10"; }
        public String name() { return "ANNUAL ART SCREENING"; }
        public String description() { return "Annual ART Screening"; }
    };

    public static EncounterTypeDescriptor ART_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "664b8574-977f-11e1-8993-905e29aff6c1"; }
        public String name() { return "ART_INITIAL"; }
        public String description() { return "Initial HIV clinic registration encounter"; }
    };

    public static EncounterTypeDescriptor ART_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "664b8650-977f-11e1-8993-905e29aff6c1"; }
        public String name() { return "ART_FOLLOWUP"; }
        public String description() { return "Followup visit for ART patient"; }
    };

    public static EncounterTypeDescriptor PALLIATIVE_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "e0822140-955d-11e7-abc4-cec278b6b50a"; }
        public String name() { return "PALLIATIVE_INITIAL"; }
        public String description() { return "Initial Palliative care encounter"; }
    };

    public static EncounterTypeDescriptor PALLIATIVE_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "e082235c-955d-11e7-abc4-cec278b6b50a"; }
        public String name() { return "PALLIATIVE_FOLLOWUP"; }
        public String description() { return "Followup visit for Palliative care patient"; }
    };

    public static EncounterTypeDescriptor CHF_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "cb337ef3-f5cb-4e10-af8d-8d717a3a139f"; }
        public String name() { return "CHF_INITIAL"; }
        public String description() { return "Initial Chronic Heart Disease encounter"; }
    };

    public static EncounterTypeDescriptor CHF_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "1f6ad830-6e94-4819-b1fd-8c4146e77280"; }
        public String name() { return "CHF_FOLLOWUP"; }
        public String description() { return "Followup visit for Chronic Heart Disease patient"; }
    };

    public static EncounterTypeDescriptor CHF_ANNUAL_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "dbab9217-29ec-477d-8d11-161cd4fd2b34"; }
        public String name() { return "CHF_ANNUAL_SCREENING"; }
        public String description() { return "Annual screening for Chronic Heart Disease"; }
    };

    public static EncounterTypeDescriptor CHF_QUARTERLY_HIV_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "df5389a8-7715-462b-a41e-e8b1946c8c60"; }
        public String name() { return "CHF_QUARTERLY_HIV_SCREENING"; }
        public String description() { return "Quarterly HIV screening for Chronic Heart Disease"; }
    };

    public static EncounterTypeDescriptor CHF_HOSPITALIZATIONS = new EncounterTypeDescriptor() {
        public String uuid() { return "0d3f097f-206c-4c31-9fcb-2ba61145b69f"; }
        public String name() { return "CHF_HOSPITALIZATIONS"; }
        public String description() { return "Hospitalizations for Chronic Heart Disease patients"; }
    };

    public static EncounterTypeDescriptor CHF_ECHOCARDIOGRAM = new EncounterTypeDescriptor() {
        public String uuid() { return "0B6FB2FD-7AA3-4D90-BE33-52096ABD66DB"; }
        public String name() { return "CHF_ECHOCARDIOGRAM"; }
        public String description() { return "Echocardiogram(ultrasound) imaging encounter"; }
    };

    public static EncounterTypeDescriptor CHF_ELECTROCARDIOGRAPHIC = new EncounterTypeDescriptor() {
        public String uuid() { return "D4350F89-A421-486F-92EB-4AB713DF122B"; }
        public String name() { return "CHF_ELECTROCARDIOGRAPHIC"; }
        public String description() { return "Electrocardiographic(EKG) imaging encounter"; }
    };

    public static EncounterTypeDescriptor CHF_CHEST_XRAY = new EncounterTypeDescriptor() {
        public String uuid() { return "833CD694-7A98-4659-A487-AE25FD445D32"; }
        public String name() { return "CHF_CHEST_XRAY"; }
        public String description() { return "Chest X-ray(CXR) imaging encounter"; }
    };

    public static EncounterTypeDescriptor CKD_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "0a3621e2-974e-11e8-9eb6-529269fb1459"; }
        public String name() { return "CKD_INITIAL"; }
        public String description() { return "Initial Chronic Kidney Disease encounter"; }
    };

    public static EncounterTypeDescriptor CKD_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "1ebe2272-974e-11e8-9eb6-529269fb1459"; }
        public String name() { return "CKD_FOLLOWUP"; }
        public String description() { return "Followup visit for Chronic Kidney Disease patient"; }
    };

    public static EncounterTypeDescriptor CKD_ANNUAL_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "ec0a17ba-9751-11e8-9eb6-529269fb1459"; }
        public String name() { return "CKD_ANNUAL_SCREENING"; }
        public String description() { return "Annual screening for Chronic Kidney Disease"; }
    };

    public static EncounterTypeDescriptor CKD_QUARTERLY_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "ec0a2232-9751-11e8-9eb6-529269fb1459"; }
        public String name() { return "CKD_QUARTERLY_SCREENING"; }
        public String description() { return "Quarterly screening for Chronic Kidney Disease"; }
    };

    public static EncounterTypeDescriptor CKD_HOSPITALIZATIONS = new EncounterTypeDescriptor() {
        public String uuid() { return "ec0a2f2a-9751-11e8-9eb6-529269fb1459"; }
        public String name() { return "CKD_HOSPITALIZATIONS"; }
        public String description() { return "Hospitalizations for Chronic Kidney Disease patients"; }
    };

    public static EncounterTypeDescriptor CKD_IMAGING = new EncounterTypeDescriptor() {
        public String uuid() { return "c4948e2c-9adf-11e8-9eb6-529269fb1459"; }
        public String name() { return "CKD_IMAGING"; }
        public String description() { return "Imaging for Chronic Kidney Disease patients"; }
    };

    //Advanced NCD
    public static EncounterTypeDescriptor NCD_OTHER_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "b562295c-e335-11e8-9f32-f2801f1b9fd1"; }
        public String name() { return "NCD_OTHER_INITIAL"; }
        public String description() { return "Initial encounter for NCD Other condition clinic"; }
    };

    public static EncounterTypeDescriptor NCD_OTHER_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "b5622bf0-e335-11e8-9f32-f2801f1b9fd1"; }
        public String name() { return "NCD_OTHER_FOLLOWUP"; }
        public String description() { return "Follow up encounter for NCD Other condition clinic"; }
    };

    public static EncounterTypeDescriptor NCD_OTHER_QUARTERLY_LABS = new EncounterTypeDescriptor() {
        public String uuid() { return "b5622d4e-e335-11e8-9f32-f2801f1b9fd1"; }
        public String name() { return "NCD_OTHER_QUARTERLY_LABS"; }
        public String description() { return "Every 3 months screening for NCD Other condition clinic"; }
    };

    public static EncounterTypeDescriptor NCD_OTHER_ANNUAL_LABS = new EncounterTypeDescriptor() {
        public String uuid() { return "b5623082-e335-11e8-9f32-f2801f1b9fd1"; }
        public String name() { return "NCD_OTHER_ANNUAL_LABS"; }
        public String description() { return "Annual screening for NCD Other condition clinic"; }
    };

    public static EncounterTypeDescriptor NCD_OTHER_HOSPITAL = new EncounterTypeDescriptor() {
        public String uuid() { return "b56231e0-e335-11e8-9f32-f2801f1b9fd1"; }
        public String name() { return "NCD_OTHER_HOSPITAL"; }
        public String description() { return "Hospitalization for NCD Other condition clinic"; }
    };

    // IC3 Screening POC system
    public static EncounterTypeDescriptor CHECK_IN = new EncounterTypeDescriptor() {
        public String uuid() { return "55a0d3ea-a4d7-4e88-8f01-5aceb2d3c61b"; }
        public String name() { return "Check-in"; }
        public String description() { return "Check-in encounter"; }
    };
    public static EncounterTypeDescriptor BLOOD_PRESSURE_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "0C36F6FB-660E-485F-AF04-249579C9EAC9"; }
        public String name() { return "Blood pressure screening"; }
        public String description() { return "Blood pressure screening encounter"; }
    };
    public static EncounterTypeDescriptor LAB_STATION_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "6D29EEC4-6FEE-497C-9352-CA8081543FD6"; }
        public String name() { return "IC3 Lab station results"; }
        public String description() { return "Lab station results encounter"; }
    };
    public static EncounterTypeDescriptor BLOOD_SUGAR_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "D8D67095-0AAC-4B61-87B3-A2B32B7E1FEE"; }
        public String name() { return "Blood sugar screening"; }
        public String description() { return "Blood sugar test screening encounter"; }
    };
    public static EncounterTypeDescriptor NUTRITION_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "6265F6BC-EBC0-4181-91F3-28B70BBFDB61"; }
        public String name() { return "Nutrition screening"; }
        public String description() { return "Nutrition screening encounter"; }
    };
    public static EncounterTypeDescriptor NURSE_EVALUATION = new EncounterTypeDescriptor() {
        public String uuid() { return "1e2f8be8-8ae3-41f1-b908-84f168f26325"; }
        public String name() { return "Nurse evaluation"; }
        public String description() { return "Nurse evaluation encounter"; }
    };
    public static EncounterTypeDescriptor HTC_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "5B7238C1-23C6-4214-957F-7912A5BE87A9"; }
        public String name() { return "HTC Screening"; }
        public String description() { return "HTC screening test encounter"; }
    };
    public static EncounterTypeDescriptor CERVICAL_CANCER_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "AA2C2B86-1A59-49A3-905B-41D318E94FFE"; }
        public String name() { return "Cervical Cancer Screening"; }
        public String description() { return "Cervical cancer screening encounter"; }
    };
    public static EncounterTypeDescriptor VIRAL_LOAD_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "9959A261-2122-4AE1-A89D-1CA444B712EA"; }
        public String name() { return "Viral Load Screening"; }
        public String description() { return "Viral Load screening test encounter"; }
    };
    public static EncounterTypeDescriptor DNA_PCR_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "8383DE35-5145-4953-A018-34876B797F3E"; }
        public String name() { return "EID Screening"; }
        public String description() { return "EID screening test encounter"; }
    };
    public static EncounterTypeDescriptor ADHERENCE_COUNSELING = new EncounterTypeDescriptor() {
        public String uuid() { return "7D801495-3857-422F-BE2A-A4EEB3F36278"; }
        public String name() { return "Adherence Counseling"; }
        public String description() { return "Adherence counseling encounter"; }
    };
    public static EncounterTypeDescriptor TB_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "45F221B9-7254-4B15-811B-5B8C8912F245"; }
        public String name() { return "TB Screening"; }
        public String description() { return "IC3 TB Screening encounter type"; }
    };
    public static EncounterTypeDescriptor TB_TEST_RESULTS = new EncounterTypeDescriptor() {
        public String uuid() { return "C770232A-4847-42D9-8F70-B01B5BA0EED8"; }
        public String name() { return "TB Test Results"; }
        public String description() { return "TB test results encounter type"; }
    };
    public static EncounterTypeDescriptor IC3_CLINICIAN_PLAN = new EncounterTypeDescriptor() {
        public String uuid() { return "04E668BA-E24F-43FF-A135-A085EC3DBE40"; }
        public String name() { return "Clinical Plan"; }
        public String description() { return "Clinical plan encounter type"; }
    };

    public static EncounterTypeDescriptor TRACE_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "7EBBEBD8-CF07-489B-B88D-CEBA274C66D5"; }
        public String name() { return "TRACE_INITIAL"; }
        public String description() { return "Initial Trace encounter"; }
    };

    public static EncounterTypeDescriptor TRACE_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "563ACC45-E3CE-4930-8F34-4F41CB35017F"; }
        public String name() { return "TRACE_FOLLOWUP"; }
        public String description() { return "Followup trace encounter"; }
    };

    public static EncounterTypeDescriptor PDC_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "cb6be652-c5ee-447d-9d94-1100ffb26aa8"; }
        public String name() { return "PDC_INITIAL"; }
        public String description() { return "Initial PDC encounter"; }
    };

    public static EncounterTypeDescriptor PDC_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "789536a6-2c12-40a7-a05a-8400eb2fcbcf"; }
        public String name() { return "PDC_FOLLOWUP"; }
        public String description() { return "Followup PDC encounter"; }
    };

    public static EncounterTypeDescriptor PDC_TRISOMY21_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "6ed701a4-152f-11ec-82a8-0242ac130003"; }
        public String name() { return "PDC_TRISOMY21_INITIAL"; }
        public String description() { return "Trisomy21 PDC Encounter"; }
    };

    public static EncounterTypeDescriptor PDC_TRISOMY21_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "f770abb3-8470-4c63-a5c6-188ab384f8df"; }
        public String name() { return "PDC_TRISOMY21_FOLLOWUP"; }
        public String description() { return "Trisomy21 PDC Encounter - followup"; }
    };

    public static EncounterTypeDescriptor PDC_DEVELOPMENTAL_DELAY_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "3aa5f5fa-a0aa-49bc-b715-1c1dd68e72d4"; }
        public String name() { return "PDC_DEVELOPMENTAL_DELAY_INITIAL"; }
        public String description() { return "Developmental Delay  PDC Encounter - initial"; }
    };

    public static EncounterTypeDescriptor PDC_DEVELOPMENTAL_DELAY_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "64148b3f-f732-4809-9a23-8b8ebe11279a"; }
        public String name() { return "PDC_DEVELOPMENTAL_DELAY_FOLLOWUP"; }
        public String description() { return "Developmental Delay  PDC Encounter - followup"; }
    };

    public static EncounterTypeDescriptor PDC_CLEFT_CLIP_PALLET_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "dbfc3984-6466-4ce0-a53f-fa646d74c41f"; }
        public String name() { return "PDC_CLEFT_CLIP_PALLET_INITIAL"; }
        public String description() { return "Cleft Clip Pallet PDC Encounter"; }
    };

    public static EncounterTypeDescriptor PDC_CLEFT_CLIP_PALLET_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() {return "cfca0af9-86c9-4717-83b7-74e61f1a7bbf";}
        public String name() {return "PDC_CLEFT_CLIP_PALLET_FOLLOWUP";}
        public String description() {return "Cleft Clip Pallet PDC Encounter";}
    };
    public static EncounterTypeDescriptor PDC_OTHER_DIAGNOSIS_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "0a2f1f74-2400-4cfd-8a9e-d2141622c6d8"; }
        public String name() { return "PDC_OTHER_DIAGNOSIS_INITIAL"; }
        public String description() { return "PDC Other Diagnosis Encounter - initial"; }
    };
    public static EncounterTypeDescriptor PDC_OTHER_DIAGNOSIS_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "60bfcb32-486a-11ec-81d3-0242ac130003"; }
        public String name() { return "PDC_OTHER_DIAGNOSIS_FOLLOWUP"; }
        public String description() { return "PDC Other Diagnosis Encounter - visit"; }
    };
    public static EncounterTypeDescriptor PDC_HOSPITALIZATION_HISTORY = new EncounterTypeDescriptor() {
        public String uuid() { return "1b78a770-4d28-11ec-81d3-0242ac130003"; }
        public String name() { return "PDC_HOSPITALIZATION_HISTORY"; }
        public String description() { return "PDC Hospitalization History Encounter"; }
    };

    public static EncounterTypeDescriptor VISION_TEST = new EncounterTypeDescriptor() {
        public String uuid() { return "5595afb1-93fb-4620-bd6d-9f509acfddde"; }
        public String name() { return "VISION_TEST"; }
        public String description() { return "Vision test encounter"; }
    };
    public static EncounterTypeDescriptor HEARING_TEST = new EncounterTypeDescriptor() {
        public String uuid() { return "4dae2743-e48e-4232-bf4e-d6c7ed7fad81"; }
        public String name() { return "HEARING_TEST"; }
        public String description() { return "Hearing test encounter"; }
    };
    public static EncounterTypeDescriptor RADIOLOGY_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "5e46e6fa-1d33-44f7-88f5-38d4d8dbe0c2"; }
        public String name() { return "RADIOLOGY_SCREENING"; }
        public String description() { return "Radiology screening encounter"; }

    };
    public static EncounterTypeDescriptor PDC_COMPLICATIONS = new EncounterTypeDescriptor() {
        public String uuid() { return "98f13fb0-5024-11ec-bf63-0242ac130002"; }
        public String name() { return "PDC_COMPLICATIONS"; }
        public String description() { return "PDC Complications Encounter"; }
    };
    public static EncounterTypeDescriptor PDC_TRISOMY21_LAB_TESTS = new EncounterTypeDescriptor() {
        public String uuid() { return "B1DA5916-FAEF-4A8C-A799-949C0BC8D2C6"; }
        public String name() { return "PDC_TRISOMY21_LAB_TESTS"; }
        public String description() { return "PDC lab tests results"; }
    };
    public static EncounterTypeDescriptor PDC_HB_AND_OTHER_LAB_TESTS = new EncounterTypeDescriptor() {
        public String uuid() { return "366E8C89-2AD0-4FDC-A8FE-E39435B11331"; }
        public String name() { return "PDC_HB_AND_OTHER_LAB_TESTS"; }
        public String description() { return "PDC hb and other lab tests results"; }
    };
    public static EncounterTypeDescriptor HIE_AND_DEV_DELAY_LAB_TESTS = new EncounterTypeDescriptor() {
        public String uuid() { return "89CD6BA9-CB92-416C-BC7E-446764344AA1"; }
        public String name() { return "HIE_AND_DEV_DELAY_LAB_TESTS"; }
        public String description() { return "PDC HIE/Developmental Delay lab tests encounter"; }
    };

    public static EncounterTypeDescriptor ART_FOLLOWUP_UP_TESTING=new EncounterTypeDescriptor() {
        public String uuid() { return "4104867f-8f40-4273-bc42-a67958e599eb";}
        public String name() { return "ART_FOLLOWUP_UP_TESTING";
        }
        public String description() { return "ART Followup testing encounter";}
        };

    public static EncounterTypeDescriptor NUTRITION_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "F1EB0CA8-8E7C-49B5-A03C-B0B9C164181E"; }
        public String name() { return "NUTRITION_INITIAL"; }
        public String description() { return "Initial nutrition encounter"; }
    };

    public static EncounterTypeDescriptor NUTRITION_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "87EB5825-DFDD-4EE9-8EEC-CDBE72E76456"; }
        public String name() { return "NUTRITION_FOLLOWUP"; }
        public String description() { return "Followup nutrition encounter"; }
    };

    public static EncounterTypeDescriptor TEEN_CLUB_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "49085C00-9EA8-481D-A5C5-FB685822D5AB"; }
        public String name() { return "TEEN_CLUB_INITIAL"; }
        public String description() { return "Initial teen club encounter"; }
    };

    public static EncounterTypeDescriptor TEEN_CLUB_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "A8CF446D-0FA4-4D44-AF46-1811F73BE65A"; }
        public String name() { return "TEEN_CLUB_FOLLOWUP"; }
        public String description() { return "Followup teen club encounter"; }
    };

    public static EncounterTypeDescriptor TEEN_CLUB_INTAKE_SURVEY = new EncounterTypeDescriptor() {
        public String uuid() { return "76ae6337-13e7-4522-bbeb-9fcf68bedf87"; }
        public String name() { return "TEEN_CLUB_INTAKE_SURVEY"; }
        public String description() { return "Teen club intake survey encounter"; }
    };
    public static  EncounterTypeDescriptor NUTRITION_INFANT_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() {return "65def8b5-6714-443e-a59a-bc481e9fd842";}
        public String name() {return "NUTRITION_INFANT_INITIAL";}

        public String description() {return "initial Infant Nutrition encounter";}

    };

    public static  EncounterTypeDescriptor NUTRITION_INFANT_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() {return "cf05c255-f1c9-465f-abbd-de980403b4b6";}
        public String name() {return "NUTRITION_INFANT_FOLLOWUP";}

        public String description() {return "followup Infant Nutrition encounter";}

    };

    public static  EncounterTypeDescriptor NUTRITION_PREGNANT_TEENS_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() {return "d67b208d-e819-4888-9bb8-60dcb8ab2b1f";}
        public String name() {return "NUTRITION_PREGNANT_TEENS_INITIAL";}

        public String description() {return "initial Pregnant Teens Nutrition encounter";}

    };

    public static  EncounterTypeDescriptor NUTRITION_PREGNANT_TEENS_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() {return "d235e109-d4f7-4493-ba10-c75d9046f8bf";}
        public String name() {return "NUTRITION_PREGNANT_TEENS_FOLLOWUP";}

        public String description() {return "followup Pregnant Teens Nutrition encounter";}

    };


    public static  EncounterTypeDescriptor NUTRITION_ADULTS_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() {return "f4add6a6-0186-4617-b919-e5cdb933e25d";}
        public String name() {return "NUTRITION_ADULTS_INITIAL";}

        public String description() {return "initial Adults Nutrition encounter";}

    };

    public static  EncounterTypeDescriptor NUTRITION_ADULTS_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() {return "e1a92830-897c-42fe-91d4-73f61f38d1a7";}
        public String name() {return "NUTRITION_ADULTS_FOLLOWUP";}

        public String description() {return "followup Adults Nutrition encounter";}

    };

    public static  EncounterTypeDescriptor NUTRITION_PDC_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() {return "7ca19e74-5592-4e54-a899-575321803d9f";}
        public String name() {return "NUTRITION_PDC_INITIAL";}

        public String description() {return "initial PDC Nutrition encounter";}

    };

    public static  EncounterTypeDescriptor NUTRITION_PDC_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() {return "771cb90d-442c-4b84-bd25-dd9b6a82715a";}
        public String name() {return "NUTRITION_PDC_FOLLOWUP";}

        public String description() {return "followup PDC Nutrition encounter";}
    };

    public static EncounterTypeDescriptor SICKLE_CELL_DISEASE_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "56C2D952-DB11-4B47-B248-79C1B2A88E88"; }
        public String name() { return "SICKLE_CELL_DISEASE_INITIAL"; }
        public String description() { return "Initial sickle cell disease encounter"; }
    };

    public static EncounterTypeDescriptor SICKLE_CELL_DISEASE_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "D4073EB7-60B1-4586-B062-13FCE4CBC9E8"; }
        public String name() { return "SICKLE_CELL_DISEASE_FOLLOWUP"; }
        public String description() { return "Followup visit encounter for sickle cell disease"; }
    };

    public static EncounterTypeDescriptor SICKLE_CELL_QUARTERLY_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "119A7061-ABC7-4759-88BF-086ADC8EBB80"; }
        public String name() { return "SICKLE_CELL_QUARTERLY_SCREENING"; }
        public String description() { return "Quarterly screening for sickle cell disease"; }
    };

    public static EncounterTypeDescriptor SICKLE_CELL_ANNUAL_SCREENING = new EncounterTypeDescriptor() {
        public String uuid() { return "0C0CFAD6-0F92-4B19-8B6A-675005BE7F86"; }
        public String name() { return "SICKLE_CELL_ANNUAL_SCREENING"; }
        public String description() { return "Annual screening for sickle cell disease"; }
    };
    public static EncounterTypeDescriptor SICKLE_CELL_HOSPITALIZATIONS = new EncounterTypeDescriptor() {
        public String uuid() { return "AD864EB5-7042-4080-AE81-E0A4CF8CED43"; }
        public String name() { return "SICKLE_CELL_HOSPITALIZATIONS"; }
        public String description() { return "Hospitalizations for patients with sickle cell disease"; }
    };

    public static EncounterTypeDescriptor OLD_TB_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "664b89ca-977f-11e1-8993-905e29aff6c1"; }
        public String name() { return "OLD_TB_INITIAL"; }
        public String description() { return "Initial visit for TB Patient"; }
    };
    public static EncounterTypeDescriptor OLD_TB_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "664b8ab0-977f-11e1-8993-905e29aff6c1"; }
        public String name() { return "OLD_TB_FOLLOWUP"; }
        public String description() { return "Followup visit for TB Patient"; }
    };
    public static EncounterTypeDescriptor TB_INITIAL = new EncounterTypeDescriptor() {
        public String uuid() { return "853B7AF6-FFC6-452A-9178-6A48BBA752EF"; }
        public String name() { return "TB_INITIAL"; }
        public String description() { return "Initial visit encounter for TB Patient"; }
    };
    public static EncounterTypeDescriptor TB_FOLLOWUP = new EncounterTypeDescriptor() {
        public String uuid() { return "61545FD5-4EBC-4E01-B349-304195254A73"; }
        public String name() { return "TB_FOLLOWUP"; }
        public String description() { return "Followup visit encounter for TB Patient"; }
    };

    public static EncounterTypeDescriptor TB_TESTS = new EncounterTypeDescriptor() {
        public String uuid() { return "166b77b9-1e75-4c74-856d-3038c0ec645b";}
        public String name() { return "TB_TESTS";}
        public String description() { return "TB test results and HIV tests history";}

    };

    public static EncounterTypeDescriptor TB_POST_LUNG_DISEASE = new EncounterTypeDescriptor() {
        public String uuid() { return "6a23b67f-3171-4b08-9d3d-40bcf833a2e5";}
        public String name() { return "TB_POST_LUNG_DISEASE";}
        public String description() { return "TB post lung disease encounter";}

    };
}
