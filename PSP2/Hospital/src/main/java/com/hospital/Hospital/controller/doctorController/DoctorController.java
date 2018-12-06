package com.hospital.Hospital.controller.doctorController;

import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors/{id}")
    public Doctor getDoctorById(@PathVariable long id) {
        return doctorService.getDoctorById(id);
    }

    @PostMapping("/createdoctor")
    @ResponseStatus(HttpStatus.CREATED)
    public Doctor createDoctor(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return doctorService.createDoctor(firstName, lastName);
    }

    @DeleteMapping("deletedoctor/{id}")
    public void deleteDoctor(@PathVariable long id) {

        doctorService.deleteDoctor(id);
    }

    @PutMapping("updatedoctor/{id}")
    public Doctor updateDoctor(@PathVariable long id, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("canOperate") boolean canOperate) {
        return doctorService.updateDoctor(id, firstName, lastName, canOperate);
    }

    @GetMapping("/getalldoctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
}
