package com.bortoluzzi.prova.shift.DTO;

import java.io.Serializable;

import com.bortoluzzi.prova.shift.entities.Patient;

public class PatientDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String sex;
	private String address;
	private String birthdate;

	public PatientDTO() {
		
	}

	public PatientDTO(Long id, String name, String sex, String address, String birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.birthdate = birthdate;
	}
	
	public PatientDTO(Patient entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.sex = entity.getSex();
		this.address = entity.getAddress();
		this.birthdate = entity.getBirthDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
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
		PatientDTO other = (PatientDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
