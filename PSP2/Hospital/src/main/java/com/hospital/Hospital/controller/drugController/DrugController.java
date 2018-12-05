package com.hospital.Hospital.controller.drugController;

import com.hospital.Hospital.domain.drug.Drug;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import com.hospital.Hospital.facadeService.drugService.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrugController {

    @Autowired
    private DrugService drugService;


    @GetMapping("/getalldrugs")
    public List<Drug> getAllDrugs(){ return drugService.getAllDrugs();}
}
