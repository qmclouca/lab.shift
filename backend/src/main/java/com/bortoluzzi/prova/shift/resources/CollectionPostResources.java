package com.bortoluzzi.prova.shift.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.DTO.CollectionPostDTO;
import com.bortoluzzi.prova.shift.services.CollectionPostService;

@RestController
@RequestMapping(value = "/collectionposts")
public class CollectionPostResources {
	
	@Autowired
	private CollectionPostService service;
	
	@GetMapping
	public ResponseEntity<List<CollectionPostDTO>> findAll() {
		List<CollectionPostDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CollectionPostDTO> findById(@PathVariable Long id) {
		CollectionPostDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);		
	}
}
