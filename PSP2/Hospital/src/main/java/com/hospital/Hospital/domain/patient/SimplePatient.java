package com.hospital.Hospital.domain.patient;

import com.hospital.Hospital.domain.drug.Drug;

import java.util.List;

    public class SimplePatient extends Patient {
        public SimplePatient(String firstName, String lastName, int age, int priority, boolean isHealthy) {
            setFirstName(firstName);
            setLastName(lastName);
            setAge(age);
            setPriority(priority);
            setHealthy(isHealthy);
        }
    }

