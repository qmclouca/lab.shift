package com.bortoluzzi.prova.shift.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.Doctor;

@RestController
@RequestMapping(value = "/doctors" )
public class DoctorResources {
	
	@GetMapping
	public ResponseEntity<List<Doctor>> findAll() {
		List<Doctor> list = new ArrayList<>();
		list.add(new Doctor(1L, "Rodolfo Lucas Bortoluzzi", "Ortopedia"));
		list.add(new Doctor(2L, "Patrícia Pereira Bortoluzzi", "Pediatra"));
		return ResponseEntity.ok().body(list);
	}
}
