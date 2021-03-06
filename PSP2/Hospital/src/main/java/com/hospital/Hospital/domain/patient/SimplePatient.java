package com.hospital.Hospital.domain.patient;

import java.util.Random;

public class SimplePatient extends Patient {
    public SimplePatient(String firstName, String lastName, int age, int priority, boolean isHealthy) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPriority(priority);
        setHealthy(isHealthy);
        Random r = new Random();
        setId(Math.abs(r.nextLong()));
    }
}

