package com.hospital.Hospital.domainService.patientFactory;

import com.hospital.Hospital.domain.patient.Patient;

public interface PatientFactory {
    Patient createPatient(String firstName, String lastName, int age, int priority, boolean isHealthy);
}
