package com.bortoluzzi.prova.shift.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.entities.Patient;
import com.bortoluzzi.prova.shift.repositories.PatientRepository;

@Service 
public class PatientService {
	
	@Autowired
	private PatientRepository repository;
	
	@Transactional(readOnly = true)
	public List<Patient> findAll() {
		return repository.findAll();
	}

}
