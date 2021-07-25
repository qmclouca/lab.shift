package com.bortoluzzi.prova.shift.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.CollectionPost;
import com.bortoluzzi.prova.shift.services.CollectionPostService;

@RestController
@RequestMapping(value = "/collectionposts")
public class CollectionPostResources {
	
	@Autowired
	private CollectionPostService service;
	
	@GetMapping
	public ResponseEntity<List<CollectionPost>> findAll() {
		List<CollectionPost> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}