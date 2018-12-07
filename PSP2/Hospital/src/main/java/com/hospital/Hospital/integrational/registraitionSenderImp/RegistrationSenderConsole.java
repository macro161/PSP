package com.hospital.Hospital.integrational.registraitionSenderImp;

import com.hospital.Hospital.integrational.registrationListener.RegistrationListener;
import com.hospital.Hospital.integrational.registrationSender.RegistrationSender;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegistrationSenderConsole implements RegistrationSender {

    @Autowired
    List<RegistrationListener> registrationListeners;

    @Override
    public void registerPatiant(long patientId, String firstName) {
        System.out.println("Patient " + firstName + " with id: " + patientId + " was registered");
        registrationListeners.forEach(listener -> listener.patientWasRegistered(patientId,firstName));
    }
}
