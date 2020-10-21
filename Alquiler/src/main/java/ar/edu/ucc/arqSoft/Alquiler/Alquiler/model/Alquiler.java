package ar.edu.ucc.arqSoft.Alquiler.Alquiler.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import ar.edu.ucc.arqSoft.Alquiler.Common.model.GenericObject;

@Entity
@Table(name = "ALQUILER")
public class Alquiler extends GenericObject{
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="PELICULA_ID")
	private Pelicula pelicula;
	
	@NotNull
	@Column(name = "FECHA_ALQUILER")
	private Date fecha_alquiler;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="SOCIO_ID")
	private Socio socio;

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

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	

}
