package com.bortoluzzi.prova.shift.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.DTO.DoctorDTO;
import com.bortoluzzi.prova.shift.entities.Doctor;
import com.bortoluzzi.prova.shift.repositories.DoctorRepository;
import com.bortoluzzi.prova.shift.services.exceptions.EntityNotFoundException;

@Service 
public class DoctorService {
	
	@Autowired
	private DoctorRepository repository;
	
	@Transactional(readOnly = true)
	public List<DoctorDTO> findAll() {
		List<Doctor> list = repository.findAll();
		return list.stream().map(x -> new DoctorDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public DoctorDTO findById(Long id) {
		Optional<Doctor> obj = repository.findById(id);
		Doctor entity = obj.orElseThrow(()-> new EntityNotFoundException("Item procurado não está cadastrado!"));
		return new DoctorDTO(entity);
	}
	
	@Transactional
	public DoctorDTO insert(DoctorDTO dto) {
		Doctor entity = new Doctor();
		entity.setName(dto.getName());
		entity.setSpeciality(dto.getSpeciality());
		entity = repository.save(entity);
		return new DoctorDTO(entity);
	}
}
