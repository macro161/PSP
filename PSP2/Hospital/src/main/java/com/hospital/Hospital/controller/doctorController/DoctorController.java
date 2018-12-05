package com.hospital.Hospital.controller.doctorController;

import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable long id){
        return doctorService.getDoctorById(id);
    }
}
