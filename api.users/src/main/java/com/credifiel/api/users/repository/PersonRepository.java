package com.credifiel.api.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credifiel.api.users.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
