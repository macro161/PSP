package com.example.demo.bootstrap;

import com.example.demo.domain.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Customer c1 = new Customer();
        c1.setFirstName("Matas");
        c1.setLastName("Savickis");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Justas");
        c2.setLastName("Tvarijonas");
        customerRepository.save(c2);

        System.out.println(customerRepository.count());

    }
}
