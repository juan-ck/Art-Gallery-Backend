package com.project.demo.dto;

import javax.validation.constraints.NotBlank;

public class OperacionDto {

	@NotBlank
    private String nombre;
	
	public OperacionDto() {
    }

    public OperacionDto(@NotBlank String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
