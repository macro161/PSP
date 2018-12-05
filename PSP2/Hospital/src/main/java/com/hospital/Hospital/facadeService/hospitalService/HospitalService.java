package com.hospital.Hospital.facadeService.hospitalService;

import com.hospital.Hospital.domain.patient.Patient;

public interface HospitalService {
    Patient treatPatient(Patient patient);

    Patient prescribeDrugs(Patient patient);

    int calculateMortality(Patient patient);
}
