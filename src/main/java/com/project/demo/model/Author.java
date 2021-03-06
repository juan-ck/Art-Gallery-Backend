package com.project.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	
	//Variables statement
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "author")
	private List<Artwork> artwork;
	
	//Constructor
	public Author() {
		super();
	}
	
	public Author(String name, List<Artwork> artwork) {
		super();
		this.name = name;
		this.artwork = artwork;
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
	public List<Artwork> getStock() {
		return artwork;
	}
	public void setStock(List<Artwork> artwork) {
		this.artwork = artwork;
	}
}
