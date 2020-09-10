package org.openmrs.module.pihmalawi.patient.impl;

import org.openmrs.PatientIdentifier;
import org.openmrs.api.APIException;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pihmalawi.db.ExtendedPatientDAO;
import org.openmrs.module.pihmalawi.patient.ExtendedPatientService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
/**
 *  Class implements patient GET operations for patients captured from medic mobile
 */
@Component
public class ExtendedPatientServiceImpl extends BaseOpenmrsService implements ExtendedPatientService {

    private ExtendedPatientDAO extendedPatientDAO;
    public ExtendedPatientDAO getExtendedPatientDAO() {
        return extendedPatientDAO;
    }

    public void setExtendedPatientDAO(ExtendedPatientDAO extendedPatientDAO) {
        this.extendedPatientDAO = extendedPatientDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public PatientIdentifier getPatientIdentifierByYendaNafeUuid(String uuid) throws APIException {
        return extendedPatientDAO.getPatientIdentifierByYendaNafeUuid(uuid);
    }
}
