package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto;

import java.util.Date;
import java.util.Set;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Pelicula;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Socio;

public class AlquilerResponseDto {
	private Date fecha_alquiler;
	private Socio socio;
	private Set<Pelicula> peliculas;
	private Long id;
	
	public Date getFecha_alquiler() {
		return fecha_alquiler;
	}
	public void setFecha_alquiler(Date fecha_alquiler) {
		this.fecha_alquiler = fecha_alquiler;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
