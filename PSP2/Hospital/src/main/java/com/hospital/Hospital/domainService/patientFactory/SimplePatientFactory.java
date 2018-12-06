package com.hospital.Hospital.domainService.patientFactory;

import com.hospital.Hospital.domain.patient.Patient;
import com.hospital.Hospital.domain.patient.SimplePatient;

public class SimplePatientFactory implements PatientFactory {

    @Override
    public Patient createPatient(String firstName, String lastName, int age, int priority, boolean isHealthy) {
        return new SimplePatient(firstName, lastName, age, priority, isHealthy);
    }
}
