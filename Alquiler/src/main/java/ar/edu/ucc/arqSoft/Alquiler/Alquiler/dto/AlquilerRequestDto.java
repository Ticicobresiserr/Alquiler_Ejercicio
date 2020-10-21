package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto;

import ar.edu.ucc.arqSoft.Alquiler.Common.dto.DtoEntity;

public class AlquilerRequestDto implements DtoEntity {
	
	private Long socioid;
	private Long peliculaid;
	
	public Long getSocioid() {
		return socioid;
	}
	public void setSocioid(Long socioid) {
		this.socioid = socioid;
	}
	public Long getPeliculaid() {
		return peliculaid;
	}
	public void setPeliculaid(Long peliculaid) {
		this.peliculaid = peliculaid;
	}
	
	
}
