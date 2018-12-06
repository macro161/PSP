package com.hospital.Hospital.repository.drugRepository;

import com.hospital.Hospital.domain.drug.Drug;

import java.util.List;

public interface DrugRepository {
    Drug getDrugById(long id);

    boolean createDrug(Drug drug);

    List<Drug> getAllDrugs();

    void deleteDrug(long id);

    Drug updateDrug(long id, String name, int halflife, int price);
}
