package com.hospital.Hospital.repository.PatientRepository;

import com.hospital.Hospital.domain.drug.Drug;
import com.hospital.Hospital.domain.patient.Patient;
import com.hospital.Hospital.integrational.registrationListener.RegistrationListener;

import java.util.List;

public interface PatientRepository extends RegistrationListener {
    Patient getPatientById(long id);

    boolean createPatient(Patient patient);

    List<Patient> getAllPatients();

    void deletePatient(long id);

    Patient updatePatient(long id, String firstName, String lastName, int age, int priority, List<Drug> prescribedDrugs, boolean isHealthy);
}
