package com.credifiel.api.users.service;

import org.springframework.data.domain.Page;

import com.credifiel.api.users.entity.Person;

public interface PersonService {

	public Page<Person>getUsers(int page, int size, String field, boolean asc);
	
	public Integer addUser(Person user);
		
	
}
