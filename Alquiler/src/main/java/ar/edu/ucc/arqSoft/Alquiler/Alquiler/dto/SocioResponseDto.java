package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto;

import ar.edu.ucc.arqSoft.Alquiler.Common.dto.DtoEntity;

public class SocioResponseDto implements DtoEntity{
	
	private String nombre;
	private String apellido;
	private Long dni;
	private String email;
	
	private Long id;
	
	public String getNombre() {
		return nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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


}
