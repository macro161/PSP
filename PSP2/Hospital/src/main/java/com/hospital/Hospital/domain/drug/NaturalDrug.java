package com.hospital.Hospital.domain.drug;

import java.util.Random;

public class NaturalDrug extends Drug {
    public NaturalDrug(String name, int halflife, int price) {
        setName(name);
        setHalfLife(halflife);
        setPrice(price);
        Random r = new Random();
        setId(r.nextLong());
    }
}
