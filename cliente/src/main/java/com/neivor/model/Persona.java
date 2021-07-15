package com.neivor.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id = UUID.randomUUID();
	
	@Column
	private String nombre;
	
	@Column
	private String dni;
	
	@Column
	private String numeroDePropiedad;
	
	@Column
	private String totalAPagar;
	
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cliente;
	
	@Column
	private String deuda;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNumeroDePropiedad() {
		return numeroDePropiedad;
	}

	public void setNumeroDePropiedad(String numeroDePropiedad) {
		this.numeroDePropiedad = numeroDePropiedad;
	}

	public String getTotalAPagar() {
		return totalAPagar;
	}

	public void setTotalAPagar(String totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public String getDeuda() {
		return deuda;
	}

	public void setDeuda(String deuda) {
		this.deuda = deuda;
	}

	

	
}
