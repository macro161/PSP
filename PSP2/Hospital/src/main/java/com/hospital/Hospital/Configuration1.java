package com.hospital.Hospital;

import com.hospital.Hospital.domainService.doctorFactory.DoctorFactory;
import com.hospital.Hospital.domainService.doctorFactory.NormalDoctorfactory;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import com.hospital.Hospital.facadeService.doctorServiceImp.DoctorServiceImp;
import com.hospital.Hospital.repository.DoctorRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {
    @Bean
    public DoctorService doctorService(){
        return new DoctorServiceImp();
    }

    @Bean
    public DoctorFactory doctorFactory(){
        return new NormalDoctorfactory();
    }


}
