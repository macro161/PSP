package com.hospital.Hospital.domainService.doctorFactory;

import com.hospital.Hospital.domain.doctor.Doctor;
import org.springframework.stereotype.Service;

@Service
public class NormalDoctorfactory implements DoctorFactory {
    @Override
    public Doctor createDoctor(String name) {
        return new Doctor(name);
    }
}
