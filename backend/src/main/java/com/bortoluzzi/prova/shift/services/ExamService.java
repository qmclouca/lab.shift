package com.bortoluzzi.prova.shift.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.entities.Exam;
import com.bortoluzzi.prova.shift.repositories.ExamRepository;

@Service 
public class ExamService {
	
	@Autowired
	private ExamRepository repository;
	
	@Transactional(readOnly = true)
	public List<Exam> findAll() {
		return repository.findAll();
	}

}
