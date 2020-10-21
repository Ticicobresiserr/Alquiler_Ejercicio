package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto;

import java.util.Date;
import ar.edu.ucc.arqSoft.Alquiler.Common.dto.DtoEntity;

public class AlquilerResponseDto implements DtoEntity {

	private Long id;
	private Date fecha_alquiler;
	private String apellido;
	private String titulo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFecha_alquiler() {
		return fecha_alquiler;
	}
	public void setFecha_alquiler(Date fecha_alquiler) {
		this.fecha_alquiler = fecha_alquiler;
	}
	
	
	
	
}
