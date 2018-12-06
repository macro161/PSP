package com.hospital.Hospital.domainService.patientFactory;

import com.hospital.Hospital.domain.patient.ImportantPatient;
import com.hospital.Hospital.domain.patient.Patient;

public class ImportantPatientFactory implements PatientFactory {
    @Override
    public Patient createPatient(String firstName, String lastName, int age, int priority, boolean isHealthy) {
        return new ImportantPatient(firstName, lastName, age, priority * 2, isHealthy);
    }
}
