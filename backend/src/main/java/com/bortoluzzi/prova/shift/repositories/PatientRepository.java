package com.bortoluzzi.prova.shift.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bortoluzzi.prova.shift.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
