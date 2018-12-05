package com.hospital.Hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HospitalApplication {


	public static void main(String[] args) {
		//SpringApplication.run(HospitalApplication.class, args);
		ConfigurableApplicationContext cx =	SpringApplication.run(HospitalApplication.class, args);
	}
}
