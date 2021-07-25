package com.bortoluzzi.prova.shift.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bortoluzzi.prova.shift.entities.CollectionPost;
import com.bortoluzzi.prova.shift.repositories.CollectionPostRepository;

@Service 
public class CollectionPostService {
	
	@Autowired
	private CollectionPostRepository repository;
	
	public List<CollectionPost> findAll() {
		return repository.findAll();
	}

}
