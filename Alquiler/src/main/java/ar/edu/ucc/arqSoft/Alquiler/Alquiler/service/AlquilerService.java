package ar.edu.ucc.arqSoft.Alquiler.Alquiler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao.AlquilerDao;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.AlquilerRequestDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.AlquilerResponseDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Alquiler;
import ar.edu.ucc.arqSoft.Alquiler.Common.dto.ModelDtoConverter;

@Service
@Transactional
public class AlquilerService {
	
	@Autowired
	private AlquilerDao alquilerDao;

	
	public AlquilerResponseDto insertAlquiler(AlquilerRequestDto request) {
		
		Alquiler alquiler = (Alquiler) new ModelDtoConverter().convertToEntity(new Alquiler(), request);
		
		alquilerDao.insert(alquiler);
		
		AlquilerResponseDto response = (AlquilerResponseDto) new ModelDtoConverter().convertToDto(alquiler, new AlquilerResponseDto());	
		
		return response;
	}

}
