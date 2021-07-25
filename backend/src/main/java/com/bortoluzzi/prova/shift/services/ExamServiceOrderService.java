package com.bortoluzzi.prova.shift.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.DTO.ExamServiceOrderDTO;
import com.bortoluzzi.prova.shift.entities.ExamServiceOrder;
import com.bortoluzzi.prova.shift.repositories.ExamServiceOrderRepository;
import com.bortoluzzi.prova.shift.services.exceptions.EntityNotFoundException;

@Service 
public class ExamServiceOrderService {
	
	@Autowired
	private ExamServiceOrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<ExamServiceOrderDTO> findAll() {
		List<ExamServiceOrder> list = repository.findAll();
		return list.stream().map(x -> new ExamServiceOrderDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ExamServiceOrderDTO findById(Long id) {
		Optional<ExamServiceOrder> obj = repository.findById(id);
		ExamServiceOrder entity =  obj.orElseThrow(()-> new EntityNotFoundException("Item procurado não está cadastrado!"));
		return new ExamServiceOrderDTO(entity);
	}
	
	@Transactional
	public ExamServiceOrderDTO insert(ExamServiceOrderDTO dto) {
		ExamServiceOrder entity = new ExamServiceOrder();
		entity.setServiceOrder(dto.getServiceOrder());
		entity.setExam(dto.getExam());
		entity.setPrice(dto.getPrice());
		entity = repository.save(entity);
		return new ExamServiceOrderDTO(entity);
	}

}
