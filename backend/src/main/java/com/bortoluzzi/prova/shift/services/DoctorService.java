package com.bortoluzzi.prova.shift.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.entities.Doctor;
import com.bortoluzzi.prova.shift.repositories.DoctorRepository;

@Service 
public class DoctorService {
	
	@Autowired
	private DoctorRepository repository;
	
	@Transactional(readOnly = true)
	public List<Doctor> findAll() {
		return repository.findAll();
	}
}
