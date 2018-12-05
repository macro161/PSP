package com.hospital.Hospital.facadeService.doctorServiceImp;

import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.domainService.doctorFactory.DoctorFactory;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import com.hospital.Hospital.repository.doctorRepository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImp implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    DoctorFactory doctorFactory;


    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.getAllDoctors();
    }

    @Override
    public Doctor getDoctorById(long id) {
        return doctorRepository.getDoctorById(id);
    }

    @Override
    public Doctor createDoctor(String firstName, String lastName) {
        Doctor doctor = doctorFactory.createDoctor(firstName,lastName);
        doctorRepository.createDoctor(doctor);
        return doctor;
    }

    @Override
    public void deleteDoctor(long id) {
        doctorRepository.deleteDoctor(id);
    }

    @Override
    public Doctor updateDoctor(long id, String firstName, String lastName, boolean canOperate) {
        return doctorRepository.updateDoctor(id,firstName,lastName,canOperate);
    }


}
