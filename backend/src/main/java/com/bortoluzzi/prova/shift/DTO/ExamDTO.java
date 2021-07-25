package com.bortoluzzi.prova.shift.DTO;

import java.io.Serializable;

import com.bortoluzzi.prova.shift.entities.Exam;

public class ExamDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String description;
	private Double price;
	
	public ExamDTO() {
		
	}

	public ExamDTO(Long id, String description, Double price) {
		this.id = id;
		this.description = description;
		this.price = price;
	}
	
	public ExamDTO(Exam entity) {
		this.id = entity.getId();
		this.description = entity.getDescription();
		this.price = entity.getPrice();		
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExamDTO other = (ExamDTO) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	
}
