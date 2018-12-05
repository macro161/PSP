package com.hospital.Hospital.facadeService.doctorServiceImp;

import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.domainService.doctorFactory.DoctorFactory;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import com.hospital.Hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImp implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    DoctorFactory doctorFactory;


    @Override
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).get();
    }
}