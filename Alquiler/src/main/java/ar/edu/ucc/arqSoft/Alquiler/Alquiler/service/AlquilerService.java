package ar.edu.ucc.arqSoft.Alquiler.Alquiler.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao.AlquilerDao;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao.PeliculaDao;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao.SocioDao;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.AlquilerRequestDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.AlquilerResponseDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Alquiler;

@Service
@Transactional
public class AlquilerService {
	
	@Autowired
	private AlquilerDao alquilerDao;

	@Autowired
	private PeliculaDao peliculaDao;
	
	@Autowired
	private SocioDao socioDao;
	
	//public AlquilerResponseDto insertAlquiler(AlquilerRequestDto request) {
		
	//	Alquiler alquiler = (Alquiler) new ModelDtoConverter().convertToEntity(new Alquiler(), request);
		
	//	alquilerDao.insert(alquiler);
		
	//	AlquilerResponseDto response = (AlquilerResponseDto) new ModelDtoConverter().convertToDto(alquiler, new AlquilerResponseDto());	
		
	//	return response;
	//}
	
	public AlquilerResponseDto insertAlquiler(AlquilerRequestDto request) {
		
		Alquiler alquiler = new Alquiler();
		
		alquiler.setFecha_alquiler(Calendar.getInstance().getTime());
		alquiler.setPelicula(peliculaDao.load(request.getPeliculaid()));
		alquiler.setSocio(socioDao.load(request.getSocioid()));
		
		alquilerDao.insert(alquiler);
		
		AlquilerResponseDto response = new AlquilerResponseDto();
		response.setApellido(alquiler.getSocio().getApellido());
		response.setTitulo(alquiler.getPelicula().getTitulo());
		response.setFecha_alquiler(alquiler.getFecha_alquiler());
		
		return response;
	}

}
