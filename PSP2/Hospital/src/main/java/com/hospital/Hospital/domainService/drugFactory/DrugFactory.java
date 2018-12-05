package com.hospital.Hospital.domainService.drugFactory;

import com.hospital.Hospital.domain.drug.Drug;

public interface DrugFactory {
    Drug createDrug(String name, int halflife, int price);
}
