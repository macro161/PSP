package com.hospital.Hospital.domainService.hospitalServiceImp;

import com.hospital.Hospital.domain.patient.Patient;
import com.hospital.Hospital.domainService.hospitalService.HospitalService;

public class PublicHospitalService implements HospitalService {
    @Override
    public Patient treatPatient(Patient patient) {
        System.out.println("Public hospital");

        patient.setHealthy(true);

        return patient;
    }

    @Override
    public int calculateMortality(Patient patient) {
        System.out.println("Private hospital");

        return patient.getAge() * 5;
    }
}
