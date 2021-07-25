package com.bortoluzzi.prova.shift.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.Exam;
import com.bortoluzzi.prova.shift.services.ExamService;

@RestController
@RequestMapping(value = "/exams" )
public class ExamResource {
	
	@Autowired
	private ExamService service;
	
	@GetMapping
	public ResponseEntity<List<Exam>> findAll() {
		List<Exam> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
}
