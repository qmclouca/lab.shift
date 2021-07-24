package com.bortoluzzi.prova.shift.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bortoluzzi.prova.shift.entities.CollectionPost;

@RestController
@RequestMapping(value = "/collectionposts")
public class CollectionPostResources {
	@GetMapping
	public ResponseEntity<List<CollectionPost>> findAll() {
		List<CollectionPost> list = new ArrayList<>();
		list.add(new CollectionPost(1L, "CAPS INFANTOJUVENIL II LAPA", "R. BERGSON, 52 - PQ DA LAPA - CEP: 05301-060"));
		list.add(new CollectionPost(2L, "Centro de Saúde Lagoa da Conceição", "R. João Pachêco da Costa, 255 - Lagoa da Conceição, Florianópolis - SC, 88062-100"));
		return ResponseEntity.ok().body(list);
	}

}
