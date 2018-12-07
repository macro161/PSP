package com.hospital.Hospital.domainService.hospitalService;

import com.hospital.Hospital.domain.patient.Patient;

public interface HospitalService {

    Patient treatPatient(Patient patient);

    int calculateMortality(Patient patient);
}
