package com.hospital.Hospital.domain.drug;

import java.util.Random;

public class ChemicalDrug extends Drug {
    public ChemicalDrug(String name, int halflife, int price) {
        setName(name);
        setHalfLife(halflife);
        setPrice(price);
        Random r = new Random();
        setId(Math.abs(r.nextLong()));    }
}
