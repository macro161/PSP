package com.hospital.Hospital.facadeService.patientService;

import com.hospital.Hospital.domain.patient.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    int getPatientMortality(long id);

    Patient registerPatient(String firstName, String lastName, int age, int priority);
}
