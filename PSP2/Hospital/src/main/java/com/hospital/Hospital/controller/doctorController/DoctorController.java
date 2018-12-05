package com.hospital.Hospital.controller.doctorController;

import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors/{id}")
    public Doctor getDoctorById(@PathVariable long id){
        return doctorService.getDoctorById(id);
    }

    @PostMapping("/createdoctor")
    @ResponseStatus(HttpStatus.CREATED)
    public Doctor createDoctor (@RequestParam("doctorName") String doctorName){
        return doctorService.createDoctor(doctorName);
    }

    @DeleteMapping("deletedoctor/{id}")
    public void deleteDoctor(@PathVariable long id){
        doctorService.deleteDoctor(id);
    }
}
