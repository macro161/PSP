package com.hospital.Hospital;

import com.hospital.Hospital.domainService.doctorFactory.DoctorFactory;
import com.hospital.Hospital.domainService.doctorFactory.SurgeonDoctorFactory;
import com.hospital.Hospital.domainService.drugFactory.ChemicalDrugFactory;
import com.hospital.Hospital.domainService.drugFactory.DrugFactory;
import com.hospital.Hospital.domainService.drugFactory.NaturalDrugFactory;
import com.hospital.Hospital.facadeService.doctorService.DoctorService;
import com.hospital.Hospital.facadeService.doctorServiceImp.DoctorServiceImp;
import com.hospital.Hospital.facadeService.drugService.DrugService;
import com.hospital.Hospital.facadeService.drugServiceImp.DrugServiceImp;
import com.hospital.Hospital.repository.DrugRepositoryImp.DrugRepositoryImp;
import com.hospital.Hospital.repository.doctorRepository.DoctorRepository;
import com.hospital.Hospital.repository.doctorRepositoryImp.DoctorRepositoryImp;
import com.hospital.Hospital.repository.drugRepository.DrugRepository;
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

    @Bean
    DrugService drugService() { return  new DrugServiceImp(); }

    @Bean
    DrugFactory drugFactory() { return new ChemicalDrugFactory();}

    @Bean
    DrugRepository drugRepository() {return new DrugRepositoryImp();}


}