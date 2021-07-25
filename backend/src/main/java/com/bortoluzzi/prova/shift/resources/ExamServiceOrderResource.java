package com.bortoluzzi.prova.shift.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.DTO.CollectionPostDTO;
import com.bortoluzzi.prova.shift.DTO.ExamServiceOrderDTO;
import com.bortoluzzi.prova.shift.entities.ExamServiceOrder;
import com.bortoluzzi.prova.shift.services.ExamServiceOrderService;

@RestController
@RequestMapping(value = "/examserviceorders" )
public class ExamServiceOrderResource {
	
	@Autowired
	private ExamServiceOrderService service;
	
	@GetMapping
	public ResponseEntity<List<ExamServiceOrderDTO>> findAll() {
		List<ExamServiceOrderDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ExamServiceOrderDTO> findById(@PathVariable Long id) {
		ExamServiceOrderDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);		
	}
}
