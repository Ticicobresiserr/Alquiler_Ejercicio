package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto;

import ar.edu.ucc.arqSoft.Alquiler.Common.dto.DtoEntity;

public class SocioRequestDto implements DtoEntity{
	
	private String nombre;
	private String apellido;
	private String dni;
	
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	
}
