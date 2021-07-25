package com.bortoluzzi.prova.shift.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.DTO.PatientDTO;
import com.bortoluzzi.prova.shift.entities.Patient;
import com.bortoluzzi.prova.shift.repositories.PatientRepository;
import com.bortoluzzi.prova.shift.services.exceptions.EntityNotFoundException;

@Service 
public class PatientService {
	
	@Autowired
	private PatientRepository repository;
	
	@Transactional(readOnly = true)
	public List<PatientDTO> findAll() {
		List<Patient> list = repository.findAll();
		return list.stream().map(x -> new PatientDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public PatientDTO findById(Long id) {
		Optional<Patient> obj = repository.findById(id);
		Patient entity =  obj.orElseThrow(()-> new EntityNotFoundException("Item procurado não está cadastrado!"));
		return new PatientDTO(entity);
	}

}
