package com.bortoluzzi.prova.shift.DTO;

import java.io.Serializable;
import java.time.Instant;

import com.bortoluzzi.prova.shift.entities.CollectionPost;
import com.bortoluzzi.prova.shift.entities.Doctor;
import com.bortoluzzi.prova.shift.entities.Patient;
import com.bortoluzzi.prova.shift.entities.ServiceOrder;

public class ServiceOrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant date;
	private Patient patient;
	private String healthInsurance;
	private CollectionPost collectionPost;
	private Doctor doctor;
	
	public ServiceOrderDTO() {
		
	}

	public ServiceOrderDTO(Long id, Instant date, Patient patient, String healthInsurance,
			CollectionPost collectionPost, Doctor doctor) {
		super();
		this.id = id;
		this.date = date;
		this.patient = patient;
		this.healthInsurance = healthInsurance;
		this.collectionPost = collectionPost;
		this.doctor = doctor;
	}
	
	public ServiceOrderDTO(ServiceOrder entity) {
		this.id = entity.getId();
		this.date = entity.getDate();
		this.patient = entity.getPatient();
		this.healthInsurance = entity.getHealthInsurance();
		this.collectionPost = entity.getCollectionPost();
		this.doctor = entity.getDoctor();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getHealthInsurance() {
		return healthInsurance;
	}

	public void setHealthInsurance(String healthInsurance) {
		this.healthInsurance = healthInsurance;
	}

	public CollectionPost getCollectionPost() {
		return collectionPost;
	}

	public void setCollectionPost(CollectionPost collectionPost) {
		this.collectionPost = collectionPost;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ServiceOrderDTO other = (ServiceOrderDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
