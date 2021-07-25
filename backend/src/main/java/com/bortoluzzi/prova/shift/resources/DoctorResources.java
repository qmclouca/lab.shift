package com.bortoluzzi.prova.shift.resources;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.Doctor;
import com.bortoluzzi.prova.shift.services.DoctorService;

@RestController
@RequestMapping(value = "/doctors" )
public class DoctorResources {
	
	@Autowired
	private DoctorService service;
	
	@GetMapping
	public ResponseEntity<List<Doctor>> findAll() {
		List<Doctor> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
