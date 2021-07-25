package com.bortoluzzi.prova.shift.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.Exam;

@RestController
@RequestMapping(value = "/exams" )
public class ExamResource {
	
	@GetMapping
	public ResponseEntity<List<Exam>> findAll() {
		List<Exam> list = new ArrayList<>();
		list.add(new Exam(1L, "Colesterol LDL", 30.50));
		list.add(new Exam(2L, "Hemoglobina", 19.63));
		return ResponseEntity.ok().body(list);
	}
}
