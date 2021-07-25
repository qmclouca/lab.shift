package com.bortoluzzi.prova.shift.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.entities.ServiceOrder;
import com.bortoluzzi.prova.shift.repositories.ServiceOrderRepository;

@Service 
public class ServiceOrderService {
	
	@Autowired
	private ServiceOrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<ServiceOrder> findAll() {
		return repository.findAll();
	}
}
