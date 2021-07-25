package com.bortoluzzi.prova.shift.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.DTO.ExamDTO;
import com.bortoluzzi.prova.shift.entities.Exam;
import com.bortoluzzi.prova.shift.repositories.ExamRepository;
import com.bortoluzzi.prova.shift.services.exceptions.EntityNotFoundException;

@Service 
public class ExamService {
	
	@Autowired
	private ExamRepository repository;
	
	@Transactional(readOnly = true)
	public List<ExamDTO> findAll() {
		List<Exam> list = repository.findAll();
		return list.stream().map(x -> new ExamDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ExamDTO findById(Long id) {
		Optional<Exam> obj = repository.findById(id);
		Exam entity =  obj.orElseThrow(()-> new EntityNotFoundException("Item procurado não está cadastrado!"));
		return new ExamDTO(entity);
	}
	
	@Transactional
	public ExamDTO insert(ExamDTO dto) {
		Exam entity = new Exam();
		entity.setDescription(dto.getDescription());
		entity.setPrice(dto.getPrice());
		entity = repository.save(entity);
		return new ExamDTO(entity);
	}

}
