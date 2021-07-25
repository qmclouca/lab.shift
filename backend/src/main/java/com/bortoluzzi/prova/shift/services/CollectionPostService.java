package com.bortoluzzi.prova.shift.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bortoluzzi.prova.shift.DTO.CollectionPostDTO;
import com.bortoluzzi.prova.shift.entities.CollectionPost;
import com.bortoluzzi.prova.shift.repositories.CollectionPostRepository;
import com.bortoluzzi.prova.shift.services.exceptions.EntityNotFoundException;

@Service 
public class CollectionPostService {
	
	@Autowired
	private CollectionPostRepository repository;
	
	@Transactional(readOnly = true)
	public List<CollectionPostDTO> findAll() {
		List<CollectionPost> list = repository.findAll();
		return list.stream().map(x -> new CollectionPostDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public CollectionPostDTO findById(Long id) {
		Optional<CollectionPost> obj = repository.findById(id);
		CollectionPost entity = obj.orElseThrow(()-> new EntityNotFoundException("Item procurado não está cadastrado!"));
		return new CollectionPostDTO(entity);
	}
}
