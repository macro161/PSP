package com.hospital.Hospital.repository.doctorRepository;

import com.hospital.Hospital.domain.doctor.Doctor;


import java.util.List;

public interface DoctorRepository {
    Doctor getDoctorById(long id);
    boolean createDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();
    void deleteDoctor(long id);
    Doctor updateDoctor(long id, String firstName, String LastName, boolean canOperate);
}
