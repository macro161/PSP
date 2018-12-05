package com.hospital.Hospital.repository;

import com.hospital.Hospital.domain.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface DoctorRepository {
    Doctor getDoctorById(long id);
}
