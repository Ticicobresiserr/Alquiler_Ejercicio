package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto;

import java.util.Set;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Alquiler;

public class SocioRequestDto {
	
	private String nombre;
	private String apellido;
	private Long dni;
	private String email;
	private Set<Alquiler> alquileres;
	
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
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Alquiler> getAlquileres() {
		return alquileres;
	}
	public void setAlquileres(Set<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
	
}
