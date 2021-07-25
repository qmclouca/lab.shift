package com.bortoluzzi.prova.shift.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.entities.ExamServiceOrder;
import com.bortoluzzi.prova.shift.repositories.ExamServiceOrderRepository;

@Service 
public class ExamServiceOrderService {
	
	@Autowired
	private ExamServiceOrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<ExamServiceOrder> findAll() {
		return repository.findAll();
	}

}
