package com.hospital.Hospital.bootstrap;


import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.repository.DoctorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final DoctorRepository doctorRepository;

    public BootStrapData(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Doctor c1 = new Doctor("Matas");
        c1.setFirstName("Matas");
        c1.setLastName("Savickis");
        doctorRepository.save(c1);

        System.out.println(doctorRepository.count());

    }
}
