package com.hospital.Hospital.controller.patientController;

import com.hospital.Hospital.domain.patient.Patient;
import com.hospital.Hospital.facadeService.patientService.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/getallpatients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

}
