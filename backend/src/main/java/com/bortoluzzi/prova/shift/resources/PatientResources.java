package com.bortoluzzi.prova.shift.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.Patient;
import com.bortoluzzi.prova.shift.services.PatientService;

@RestController
@RequestMapping(value = "/patients")
public class PatientResources {
	
	@Autowired
	private PatientService service;
	
	@GetMapping
	public ResponseEntity<List<Patient>> findAll() {
		List<Patient> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
