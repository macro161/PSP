package com.hospital.Hospital.domainService.doctorFactory;

import com.hospital.Hospital.domain.doctor.Doctor;

public interface DoctorFactory {
    Doctor createDoctor(String firstName, String lastName);
}
