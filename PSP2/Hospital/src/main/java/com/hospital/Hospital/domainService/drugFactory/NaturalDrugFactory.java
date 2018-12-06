package com.hospital.Hospital.domainService.drugFactory;

import com.hospital.Hospital.domain.drug.Drug;
import com.hospital.Hospital.domain.drug.NaturalDrug;

public class NaturalDrugFactory implements DrugFactory {
    @Override
    public Drug createDrug(String name, int halflife, int price) {
        return new NaturalDrug(name, halflife / 2, price * 3);
    }
}
