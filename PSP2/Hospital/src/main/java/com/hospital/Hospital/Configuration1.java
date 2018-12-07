package com.hospital.Hospital;

import com.hospital.Hospital.domainService.doctorFactory.DoctorFactory;
import com.hospital.Hospital.domainService.doctorFactory.NormalDoctorfactory;
import com.hospital.Hospital.domainService.drugFactory.DrugFactory;
import com.hospital.Hospital.domainService.drugFactory.NaturalDrugFactory;
import com.hospital.Hospital.domainService.hospitalService.HospitalService;
import com.hospital.Hospital.domainService.hospitalServiceImp.PrivateHospitalService;
import com.hospital.Hospital.domainService.hospitalServiceImp.PublicHospitalService;
import com.hospital.Hospital.domainService.patientFactory.PatientFactory;
import com.hospital.Hospital.domainService.patientFactory.SimplePatientFactory;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import com.hospital.Hospital.facadeService.doctorServiceImp.DoctorServiceImp;
import com.hospital.Hospital.facadeService.drugService.DrugService;
import com.hospital.Hospital.facadeService.drugServiceImp.DrugServiceImp;
import com.hospital.Hospital.facadeService.patientService.PatientService;
import com.hospital.Hospital.facadeService.patientServiceImp.PatientServiceImp;
import com.hospital.Hospital.integrational.registraitionSenderImp.RegistrationSenderConsole;
import com.hospital.Hospital.integrational.registrationListener.RegistrationListener;
import com.hospital.Hospital.integrational.registrationSender.RegistrationSender;
import com.hospital.Hospital.repository.DrugRepositoryImp.DrugRepositoryImp;
import com.hospital.Hospital.repository.PatientRepository.PatientRepository;
import com.hospital.Hospital.repository.PatientRepositoryImp.PatientRepositoryImp;
import com.hospital.Hospital.repository.doctorRepository.DoctorRepository;
import com.hospital.Hospital.repository.doctorRepositoryImp.DoctorRepositoryImp;
import com.hospital.Hospital.repository.drugRepository.DrugRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Configuration1 {
    @Bean
    DoctorService doctorService() {
        return new DoctorServiceImp();
    }

    @Bean
    DoctorFactory doctorFactory() {
        return new NormalDoctorfactory();
    }

    @Bean
    DoctorRepository doctorRepository() {
        return new DoctorRepositoryImp();
    }

    @Bean
    DrugService drugService() {
        return new DrugServiceImp();
    }

    @Bean
    DrugFactory drugFactory() {
        return new NaturalDrugFactory();
    }

    @Bean
    DrugRepository drugRepository() {
        return new DrugRepositoryImp();
    }

    @Bean
    PatientService patientService() {
        return new PatientServiceImp();
    }

    @Bean
    PatientFactory patientFactory() {
        return new SimplePatientFactory();
    }

    @Bean
    PatientRepository patientRepository() {
        return new PatientRepositoryImp();
    }

    @Bean
    HospitalService hospitalService1(){
        return new PublicHospitalService();
    }

    @Bean
    HospitalService hospitalService2(){
        return new PrivateHospitalService();
    }

    @Bean
    RegistrationSender registrationSender(){
        return new RegistrationSenderConsole();
    }

    @Bean
    List<RegistrationListener> registrationListeners(){
        List<RegistrationListener> listeners = new ArrayList<>();
        listeners.add(new PatientRepositoryImp());
        return listeners;
    }
}
