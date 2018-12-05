package com.hospital.Hospital.repository.PatientRepositoryImp;

import com.hospital.Hospital.domain.drug.ChemicalDrug;
import com.hospital.Hospital.domain.drug.Drug;
import com.hospital.Hospital.domain.patient.Patient;
import com.hospital.Hospital.domain.patient.SimplePatient;
import com.hospital.Hospital.repository.PatientRepository.PatientRepository;

import java.util.ArrayList;
import java.util.List;

public class PatientRepositoryImp implements PatientRepository {

    SimplePatient p1 = new SimplePatient("Tomas","Tomaitis", 40, 50, false);
    SimplePatient p2 = new SimplePatient("Jonas","Jonaitis", 35, 80, false);
    SimplePatient p3 = new SimplePatient("Petras","Petraitis", 21, 10, true);

    List<Patient> patients = new ArrayList<Patient>(){{add(p1);add(p2);add(p3);}};

    @Override
    public Patient getPatientById(long id) {
        return null;
    }

    @Override
    public boolean createPatient(Patient patient) {
        return false;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patients;
    }

    @Override
    public void deletePatient(long id) {

    }

    @Override
    public Patient updatePatient(long id, String firstName, String lastName, int age, int priority, List<Drug> prescribedDrugs, boolean isHealthy) {
        return null;
    }
}
