package com.hospital.Hospital.domain.doctor;

import java.util.Random;

public class SurgeonDoctor extends Doctor {
    public SurgeonDoctor(String firstName, String lastName, boolean canOperate) {
        setFirstName(firstName);
        setLastName(lastName);
        setCanOperate(canOperate);
        Random r = new Random();
        setId(Math.abs(r.nextLong()));
    }
}
