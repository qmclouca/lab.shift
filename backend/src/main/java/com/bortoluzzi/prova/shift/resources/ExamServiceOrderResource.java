package com.bortoluzzi.prova.shift.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.ExamServiceOrder;

@RestController
@RequestMapping(value = "/examserviceorders" )
public class ExamServiceOrderResource {
	
	@GetMapping
	public ResponseEntity<List<ExamServiceOrder>> findAll() {
		List<ExamServiceOrder> list = new ArrayList<>();
		return ResponseEntity.ok().body(list);
	}
}
