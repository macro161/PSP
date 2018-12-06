package com.hospital.Hospital.repository.doctorRepositoryImp;

import com.hospital.Hospital.domain.doctor.Doctor;
import com.hospital.Hospital.domain.doctor.NormalDoctor;
import com.hospital.Hospital.domain.doctor.SurgeonDoctor;
import com.hospital.Hospital.repository.doctorRepository.DoctorRepository;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImp implements DoctorRepository {

    NormalDoctor nd1 = new NormalDoctor("Matas", "Savickis", false);
    NormalDoctor nd2 = new NormalDoctor("Greta", "Pyrantaite", false);
    NormalDoctor nd3 = new NormalDoctor("Andrius", "Bentkus", false);
    SurgeonDoctor sd1 = new SurgeonDoctor("Justas", "Tvarijonas", true);
    SurgeonDoctor sd2 = new SurgeonDoctor("Rytautas", "Kvasinskas", true);
    SurgeonDoctor sd3 = new SurgeonDoctor("Tomas", "Kiziela", true);


    List<Doctor> doctors = new ArrayList<Doctor>() {{
        add(nd1);
        add(nd2);
        add(nd3);
        add(sd1);
        add(sd2);
        add(sd3);
    }};


    @Override
    public Doctor getDoctorById(long id) {
        return doctors.stream().filter(doctor -> doctor.getId() == id).findFirst().orElse(null);
    }

    @Override
    public boolean createDoctor(Doctor doctor) {
        return doctors.add(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    @Override
    public void deleteDoctor(long id) {
        doctors.remove(getDoctorById(id));
    }

    @Override
    public Doctor updateDoctor(long id, String firstName, String lastName, boolean canOperate) {
        getDoctorById(id).setFirstName(firstName);
        getDoctorById(id).setLastName(lastName);
        getDoctorById(id).setCanOperate(canOperate);
        return getDoctorById(id);
    }
}
