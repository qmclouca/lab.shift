package com.bortoluzzi.prova.shift.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.Patient;

@RestController
@RequestMapping(value = "/patients")
public class PatientResources {
	@GetMapping
	public ResponseEntity<List<Patient>> findAll() {
		List<Patient> list = new ArrayList<>();
		list.add(new Patient(1L, "Gustavo Guimarães", "Masculino", "Av. das Palmeiras, 760; São Paulo/SP; Bairro Daniela; CEP 88053-010", "22/06/1986"));
		list.add(new Patient(2L, "Silvio Amandio", "Masculino", "Av. das Costureiras, 1254; Florianópolis/SC; Bairro Centro; CEP 88020-001", "07/11/1968"));
		return ResponseEntity.ok().body(list);
	}

}
