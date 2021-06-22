package com.credifiel.api.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.credifiel.api.users.entity.Person;
import com.credifiel.api.users.service.PersonService;

@RestController
@RequestMapping("/api/v1/person")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@GetMapping
	public ResponseEntity<Page<Person>> getUsers(
			@RequestParam( required = false, value = "page", defaultValue = "0") int page,
			@RequestParam( required = false, value = "size", defaultValue = "10") int size,
			@RequestParam( required = false, value = "orders", defaultValue = "apellido") String order,
			@RequestParam( required = false, value = "asc", defaultValue = "true") boolean asc
			){
		return new ResponseEntity<Page<Person>>(
				service.getUsers(page, size, order, asc),
				HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Integer> addUser(@RequestBody Person usuario) {
		return new ResponseEntity<>(service.addUser(usuario), HttpStatus.CREATED); 
	}
	
}
