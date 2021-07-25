package com.bortoluzzi.prova.shift.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.DTO.CollectionPostDTO;
import com.bortoluzzi.prova.shift.DTO.DoctorDTO;
import com.bortoluzzi.prova.shift.services.DoctorService;

@RestController
@RequestMapping(value = "/doctors" )
public class DoctorResources {
	
	@Autowired
	private DoctorService service;
	
	@GetMapping
	public ResponseEntity<List<DoctorDTO>> findAll() {
		List<DoctorDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<DoctorDTO> findById(@PathVariable Long id) {
		DoctorDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);		
	}
}
