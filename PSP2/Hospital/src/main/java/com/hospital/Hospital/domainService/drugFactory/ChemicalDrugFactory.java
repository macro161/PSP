package com.hospital.Hospital.domainService.drugFactory;

import com.hospital.Hospital.domain.drug.ChemicalDrug;
import com.hospital.Hospital.domain.drug.Drug;

public class ChemicalDrugFactory implements DrugFactory {
    @Override
    public Drug createDrug(String name, int halflife, int price) {
        return new ChemicalDrug(name,halflife * 2, price / 2);
    }
}
