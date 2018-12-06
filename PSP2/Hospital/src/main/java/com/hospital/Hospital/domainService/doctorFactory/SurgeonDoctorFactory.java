package com.hospital.Hospital.domainService.doctorFactory;

import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.domain.doctor.SurgeonDoctor;
import org.springframework.stereotype.Service;

@Service
public class SurgeonDoctorFactory implements DoctorFactory {
    @Override
    public Doctor createDoctor(String firstName, String lastName) {
        return new SurgeonDoctor(firstName, lastName, true);
    }
}
