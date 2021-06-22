package com.credifiel.api.users.service.impl;

import java.sql.Date;
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.credifiel.api.users.entity.Person;
import com.credifiel.api.users.repository.PersonRepository;
import com.credifiel.api.users.service.PersonService;



@Service
public class PersonServiceImpl implements PersonService{
	
	Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);
	
	@Autowired
	private PersonRepository repository; 

	@Override
	public Page<Person> getUsers(int page, int size, String orders, boolean asc) {
		if(asc) {
			return this.repository.findAll(PageRequest.of(page, size, Sort.by(orders)));
		}else {
			return this.repository.findAll(PageRequest.of(page, size, Sort.by(orders).descending()));
		}
			
	}

	@Override
	public Integer addUser(Person user) {
		logger.info(user.toString());
		return this.repository.save(user).getIdPerson();
	}
	
	
	
	

}
