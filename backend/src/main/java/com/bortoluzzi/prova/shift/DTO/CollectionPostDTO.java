package com.bortoluzzi.prova.shift.DTO;

import java.io.Serializable;

import com.bortoluzzi.prova.shift.entities.CollectionPost;

public class CollectionPostDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String description;
	private String address;
	
	public CollectionPostDTO() {
	}

	public CollectionPostDTO(Long id, String description, String address) {
		this.id = id;
		this.description = description;
		this.address = address;
	}
	
	public CollectionPostDTO(CollectionPost entity) {
		this.id = entity.getId();
		this.description = entity.getDescription();
		this.address = entity.getAddress();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
