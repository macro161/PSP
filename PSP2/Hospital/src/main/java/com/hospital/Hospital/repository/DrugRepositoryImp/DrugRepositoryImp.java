package com.hospital.Hospital.repository.DrugRepositoryImp;

import com.hospital.Hospital.domain.drug.ChemicalDrug;
import com.hospital.Hospital.domain.drug.Drug;
import com.hospital.Hospital.domain.drug.NaturalDrug;
import com.hospital.Hospital.repository.drugRepository.DrugRepository;

import java.util.ArrayList;
import java.util.List;

public class DrugRepositoryImp implements DrugRepository {


    ChemicalDrug d1 = new ChemicalDrug("Xanax", 10, 20);
    ChemicalDrug d2 = new ChemicalDrug("Ibuprofen", 5, 10);
    ChemicalDrug d3 = new ChemicalDrug("Morphien", 15, 30);
    NaturalDrug nd1 = new NaturalDrug("Herbal extract", 1, 5);
    NaturalDrug nd2 = new NaturalDrug("Snake oil", 3, 20);
    NaturalDrug nd3 = new NaturalDrug("Flower tea", 2, 3);

    List<Drug> drugs = new ArrayList<Drug>() {{
        add(d1);
        add(d2);
        add(d3);
        add(nd1);
        add(nd2);
        add(nd3);
    }};

    @Override
    public Drug getDrugById(long id) {
        return drugs.stream().filter(drug -> drug.getId() == id).findFirst().orElse(null);
    }

    @Override
    public boolean createDrug(Drug drug) {
        return drugs.add(drug);
    }

    @Override
    public List<Drug> getAllDrugs() {
        return drugs;
    }

    @Override
    public void deleteDrug(long id) {
        drugs.remove(getDrugById(id));
    }

    @Override
    public Drug updateDrug(long id, String name, int halflife, int price) {
        getDrugById(id).setName(name);
        getDrugById(id).setHalfLife(halflife);
        getDrugById(id).setPrice(price);
        return getDrugById(id);
    }
}
