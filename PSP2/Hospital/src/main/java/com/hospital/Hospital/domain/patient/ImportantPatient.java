package com.hospital.Hospital.domain.patient;

import com.hospital.Hospital.domain.drug.Drug;

import java.util.List;

public class ImportantPatient extends Patient {
    public ImportantPatient(String firstName, String lastName, int age, int priority, boolean isHealthy) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPriority(priority);
        setHealthy(isHealthy);
    }
}
