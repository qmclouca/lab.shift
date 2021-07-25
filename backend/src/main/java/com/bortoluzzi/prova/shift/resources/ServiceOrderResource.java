package com.bortoluzzi.prova.shift.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.DTO.ServiceOrderDTO;
import com.bortoluzzi.prova.shift.services.ServiceOrderService;

@RestController
@RequestMapping(value = "/serviceorders" )
public class ServiceOrderResource {
	
	@Autowired
	private ServiceOrderService service;
	
	@GetMapping
	public ResponseEntity<List<ServiceOrderDTO>> findAll() {
		List<ServiceOrderDTO> list = new ArrayList<>();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ServiceOrderDTO> findById(@PathVariable Long id) {
		ServiceOrderDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);		
	}
}
