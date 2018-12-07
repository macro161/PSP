package com.hospital.Hospital.domainService.hospitalServiceImp;

import com.hospital.Hospital.domain.patient.Patient;
import com.hospital.Hospital.domainService.hospitalService.HospitalService;

public class PrivateHospitalService implements HospitalService {
    @Override
    public Patient treatPatient(Patient patient) {
        System.out.println("Private hospital");
         patient.setHealthy(true);
         patient.setPriority(100);
         return patient;

    }

    @Override
    public int calculateMortality(Patient patient) {

        System.out.println("Private hospital");

        int mortality = 0;

        if(!patient.isHealthy()){
            mortality += 20;
        }

        mortality += patient.getAge()*10;

        return mortality;
    }
}
