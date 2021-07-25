package com.bortoluzzi.prova.shift.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.ExamServiceOrder;
import com.bortoluzzi.prova.shift.services.ExamServiceOrderService;

@RestController
@RequestMapping(value = "/examserviceorders" )
public class ExamServiceOrderResource {
	
	@Autowired
	private ExamServiceOrderService service;
	
	@GetMapping
	public ResponseEntity<List<ExamServiceOrder>> findAll() {
		List<ExamServiceOrder> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
