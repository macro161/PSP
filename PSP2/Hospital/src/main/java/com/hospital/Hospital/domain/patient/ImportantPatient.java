package com.hospital.Hospital.domain.patient;

import java.util.Random;

public class ImportantPatient extends Patient {
    public ImportantPatient(String firstName, String lastName, int age, int priority, boolean isHealthy) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPriority(priority);
        setHealthy(isHealthy);
        Random r = new Random();
        setId(Math.abs(r.nextLong()));
    }
}
