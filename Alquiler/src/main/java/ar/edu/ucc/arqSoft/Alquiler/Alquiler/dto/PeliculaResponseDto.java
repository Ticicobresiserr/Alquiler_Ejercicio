package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto;

import java.util.Set;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Alquiler;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Genero;

public class PeliculaResponseDto {
	
	private String sinopsis;
	private String titulo;
	private Long año;
	private Genero genero;
	private Set<Alquiler> alquileres;
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Long getAño() {
		return año;
	}
	public void setAño(Long año) {
		this.año = año;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Set<Alquiler> getAlquileres() {
		return alquileres;
	}
	public void setAlquileres(Set<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
	

}