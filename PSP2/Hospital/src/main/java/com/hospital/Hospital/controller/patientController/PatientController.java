package com.hospital.Hospital.controller.patientController;

import com.hospital.Hospital.domain.patient.Patient;
import com.hospital.Hospital.facadeService.patientService.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/getallpatients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/getmosrtality/{id}")
    public int getMortality(@PathVariable long id){
        return patientService.getPatientMortality(id);
    }

    @PostMapping("/registerpatient")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient registerPatient(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("age") int age, @RequestParam("priority") int priority) {
        return patientService.registerPatient(firstName, lastName, age,priority);
    }



}
