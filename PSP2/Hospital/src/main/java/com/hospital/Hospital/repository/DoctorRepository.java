package com.hospital.Hospital.repository;

import com.hospital.Hospital.domain.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
