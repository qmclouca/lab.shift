package com.bortoluzzi.prova.shift.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.DTO.ServiceOrderDTO;
import com.bortoluzzi.prova.shift.entities.ServiceOrder;
import com.bortoluzzi.prova.shift.repositories.ServiceOrderRepository;
import com.bortoluzzi.prova.shift.services.exceptions.EntityNotFoundException;

@Service 
public class ServiceOrderService {
	
	@Autowired
	private ServiceOrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<ServiceOrderDTO> findAll() {
		List<ServiceOrder> list = repository.findAll();
		return list.stream().map(x -> new ServiceOrderDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ServiceOrderDTO findById(Long id) {
		Optional<ServiceOrder> obj = repository.findById(id);
		ServiceOrder entity =  obj.orElseThrow(()-> new EntityNotFoundException("Item procurado não está cadastrado!"));
		return new ServiceOrderDTO(entity);
	}
}
