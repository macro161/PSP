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
@RequestMapping(DoctorController.BASE_URL)
public class DoctorController {
    public static final String BASE_URL = "/api/v1/doctor";

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/{id}")
    public Doctor getCustomerById(@PathVariable Long id){
        return doctorService.getDoctorById(id);
    }
}
