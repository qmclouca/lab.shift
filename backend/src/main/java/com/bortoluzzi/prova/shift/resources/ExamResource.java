package com.bortoluzzi.prova.shift.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.DTO.CollectionPostDTO;
import com.bortoluzzi.prova.shift.DTO.ExamDTO;
import com.bortoluzzi.prova.shift.services.ExamService;

@RestController
@RequestMapping(value = "/exams" )
public class ExamResource {
	
	@Autowired
	private ExamService service;
	
	@GetMapping
	public ResponseEntity<List<ExamDTO>> findAll() {
		List<ExamDTO> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ExamDTO> findById(@PathVariable Long id) {
		ExamDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);		
	}
}
