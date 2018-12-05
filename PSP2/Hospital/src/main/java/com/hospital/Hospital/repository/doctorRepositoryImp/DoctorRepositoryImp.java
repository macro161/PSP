package com.hospital.Hospital.repository.doctorRepositoryImp;

import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.repository.doctorRepository.DoctorRepository;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImp implements DoctorRepository {

    List<Doctor> doctors  = new ArrayList<>();

    @Override
    public Doctor getDoctorById(long id) {
        return doctors.stream().filter(doctor -> doctor.getId() == id).findFirst().orElse(null);
    }

    @Override
    public boolean createDoctor(Doctor doctor) {
        return doctors.add(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    @Override
    public void deleteDoctor(long id) {
        doctors.remove(getDoctorById(id));
    }

    @Override
    public Doctor updateDoctor(long id, String firstName, String lastName, boolean canOperate) {
        getDoctorById(id).setFirstName(firstName);
        getDoctorById(id).setLastName(lastName);
        getDoctorById(id).setCanOperate(canOperate);
        return getDoctorById(id);
    }
}
