package ar.edu.ucc.arqSoft.Alquiler.Alquiler.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao.PeliculaDao;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.PeliculaResponseDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Pelicula;
import ar.edu.ucc.arqSoft.Alquiler.Common.dto.ModelDtoConverter;

@Service
@Transactional
public class PeliculaService {
	
	@Autowired
	private PeliculaDao peliculaDao;
	
	//probar forma manual sin el convertoDto

	public PeliculaResponseDto getPeliculaById(Long id) {
		Pelicula pelicula = peliculaDao.load(id);
				
		PeliculaResponseDto response = (PeliculaResponseDto) new ModelDtoConverter().convertToDto(pelicula, new PeliculaResponseDto());	
		return response;
	}

	
	public List<PeliculaResponseDto> getAllPeliculas() {
		List<Pelicula> peliculas = peliculaDao.getAll();
		
		List<PeliculaResponseDto> response = new ArrayList<PeliculaResponseDto>();
		 
		for (Pelicula pelicula : peliculas) {
			response.add((PeliculaResponseDto) new ModelDtoConverter().convertToDto(pelicula, new PeliculaResponseDto()));
		}
		
		return response;
	}
	
}
