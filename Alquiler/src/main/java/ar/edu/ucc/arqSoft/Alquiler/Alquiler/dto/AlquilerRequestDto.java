package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto;

import java.util.Date;
import java.util.Set;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Pelicula;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Socio;
import ar.edu.ucc.arqSoft.Alquiler.Common.dto.DtoEntity;

public class AlquilerRequestDto implements DtoEntity {
	
	private Date fecha_alquiler;
	private Socio socio;
	private Set<Pelicula> peliculas;
	
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

}
