package com.example.patient1.repositories;

import com.example.patient1.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {



}
