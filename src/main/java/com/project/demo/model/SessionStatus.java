package com.project.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "session_status")
public class SessionStatus {

	//Variables statement
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
		
	//Constructor
	public SessionStatus() {
		super();
	}
	public SessionStatus(String name) {
		super();
		this.name = name;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}		
}
