package com.bortoluzzi.prova.shift.DTO;

import java.io.Serializable;

import com.bortoluzzi.prova.shift.entities.Exam;
import com.bortoluzzi.prova.shift.entities.ExamServiceOrder;
import com.bortoluzzi.prova.shift.entities.ServiceOrder;

public class ExamServiceOrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id; 
	private ServiceOrder serviceOrder;
	private Exam exam;
	private Double price;
	
	public ExamServiceOrderDTO() {
		
	}

	public ExamServiceOrderDTO(Long id, ServiceOrder serviceOrder, Exam exam, Double price) {
		super();
		this.id = id;
		this.serviceOrder = serviceOrder;
		this.exam = exam;
		this.price = price;
	}
	
	public ExamServiceOrderDTO(ExamServiceOrder entity) {
		this.id = entity.getId();
		this.serviceOrder = entity.getServiceOrder();
		this.exam = entity.getExam();
		this.price = entity.getPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ServiceOrder getServiceOrder() {
		return serviceOrder;
	}

	public void setServiceOrder(ServiceOrder serviceOrder) {
		this.serviceOrder = serviceOrder;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
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
		ExamServiceOrderDTO other = (ExamServiceOrderDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
