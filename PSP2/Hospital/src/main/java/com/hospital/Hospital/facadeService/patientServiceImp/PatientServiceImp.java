package com.hospital.Hospital.facadeService.patientServiceImp;

import com.hospital.Hospital.domain.patient.Patient;
import com.hospital.Hospital.domainService.patientFactory.PatientFactory;
import com.hospital.Hospital.facadeService.patientService.PatientService;
import com.hospital.Hospital.repository.PatientRepository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImp implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    PatientFactory patientFactory;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.getAllPatients();
    }
}
