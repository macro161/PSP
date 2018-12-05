package com.hospital.Hospital.domain.doctor;

import java.util.Random;

public class NormalDoctor extends Doctor {
    public NormalDoctor(String firstName, String lastName, boolean canOperate) {
        setFirstName(firstName);
        setLastName(lastName);
        setCanOperate(canOperate);
        Random r = new Random();
        setId(r.nextLong());
    }
}