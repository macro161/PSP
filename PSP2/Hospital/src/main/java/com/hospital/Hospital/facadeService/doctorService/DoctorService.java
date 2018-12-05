package com.hospital.Hospital.facadeService.doctorService;

import com.hospital.Hospital.domain.doctor.Doctor;

import java.util.List;

public interface DoctorService {
   // #TODO this
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(long id);
    Doctor createDoctor(String firstName, String lastName);
    void deleteDoctor(long id);
    Doctor updateDoctor(long id, String firstName, String lastName, boolean canOperate);
}
