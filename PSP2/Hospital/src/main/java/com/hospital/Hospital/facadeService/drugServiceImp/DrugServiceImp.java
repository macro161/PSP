package com.hospital.Hospital.facadeService.drugServiceImp;

import com.hospital.Hospital.domain.drug.Drug;
import com.hospital.Hospital.domainService.drugFactory.DrugFactory;
import com.hospital.Hospital.facadeService.drugService.DrugService;
import com.hospital.Hospital.repository.drugRepository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImp implements DrugService {

    @Autowired
    DrugFactory drugFactory;

    @Autowired
    DrugRepository drugRepository;


    @Override
    public List<Drug> getAllDrugs() {
        return drugRepository.getAllDrugs();
    }
}
