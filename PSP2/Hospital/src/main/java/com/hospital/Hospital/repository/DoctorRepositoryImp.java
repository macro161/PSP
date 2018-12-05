package com.hospital.Hospital.repository;

import com.hospital.Hospital.domain.doctor.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImp implements DoctorRepository {

    List<Doctor> doctors  = new ArrayList<>();

    @Override
    public Doctor getDoctorById(long id) {
        return doctors.stream().filter(doctor -> doctor.getId() == id).findFirst().orElse(null);
    }
}
