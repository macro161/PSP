package com.hospital.Hospital;

import com.hospital.Hospital.domainService.doctorFactory.DoctorFactory;
import com.hospital.Hospital.domainService.doctorFactory.SurgeonDoctorFactory;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import com.hospital.Hospital.facadeService.doctorServiceImp.DoctorServiceImp;
import com.hospital.Hospital.repository.doctorRepository.DoctorRepository;
import com.hospital.Hospital.repository.doctorRepositoryImp.DoctorRepositoryImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration2 {
    @Bean
    DoctorService doctorService(){
        return new DoctorServiceImp();
    }

    @Bean
    DoctorFactory doctorFactory(){
        return new SurgeonDoctorFactory();
    }

    @Bean
    DoctorRepository doctorRepository(){ return new DoctorRepositoryImp();}



}