package com.example.patient1;

import com.example.patient1.entities.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.patient1.repositories.PatientRepository;

import java.util.Date;

@SpringBootApplication
public class Patient1Application {

    public static void main(String[] args) {
        SpringApplication.run(Patient1Application.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(
                    new Patient(null, "Yosef", new Date(), false, 17));

            patientRepository.save(
                    new Patient(null, "Adam", new Date(), false, 7));

            patientRepository.save(
                    new Patient(null, "Hamid", new Date(), false, 15));

            patientRepository.save(
                    new Patient(null, "Ahmad", new Date(), true, 10));


            patientRepository.findAll().forEach(p-> System.out.println(p.getNom()));
        };


    }
}

