package com.hospital.Hospital.domainService.doctorFactory;

import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.domain.doctor.NormalDoctor;
import org.springframework.stereotype.Service;

@Service
public class NormalDoctorfactory implements DoctorFactory {
    @Override
    public Doctor createDoctor(String firstName, String lastName) {
        return new NormalDoctor(firstName, lastName, false);
    }
}
