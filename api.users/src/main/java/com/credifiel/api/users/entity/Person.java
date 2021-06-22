package com.credifiel.api.users.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_person")
	private Integer idPerson;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Apellido")
	private String apellido;
	
	@Column(name = "Telefono")
	private String telefono;
	
	

	public Person() {
		super();
	}



	public Person(Integer idPerson, String nombre, String apellido, String telefono) {
		super();
		this.idPerson = idPerson;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}



	public Integer getIdPerson() {
		return idPerson;
	}



	public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	@Override
	public String toString() {
		return "Usuario [idPerson=" + idPerson + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + "]";
	}
	
	




}
