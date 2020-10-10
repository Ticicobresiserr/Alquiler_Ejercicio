package ar.edu.ucc.arqSoft.Alquiler.Alquiler.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao.SocioDao;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.SocioRequestDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.SocioResponseDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Socio;
import ar.edu.ucc.arqSoft.Alquiler.Common.dto.ModelDtoConverter;

@Service
@Transactional
public class SocioService {
	
	@Autowired
	private SocioDao socioDao;

	
	public SocioResponseDto insertSocio(SocioRequestDto request) {
		
		Socio socio = (Socio) new ModelDtoConverter().convertToEntity(new Socio(), request);
		
		socioDao.insert(socio);
		
		SocioResponseDto response = (SocioResponseDto) new ModelDtoConverter().convertToDto(socio, new SocioResponseDto());	
		
		return response;
	}

}
