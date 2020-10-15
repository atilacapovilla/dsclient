package com.atila.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atila.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Jose da Silva", "13345678901", 1500.00, Instant.now(), 2));
		list.add(new Client(2L, "Joao de Souza", "11122233301", 1000.00, Instant.now(), 3));
		return ResponseEntity.ok().body(list);
	}

}
