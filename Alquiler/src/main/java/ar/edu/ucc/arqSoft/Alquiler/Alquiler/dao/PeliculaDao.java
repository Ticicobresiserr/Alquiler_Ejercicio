package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao;

import java.util.List;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Pelicula;
import ar.edu.ucc.arqSoft.Alquiler.Common.dao.GenericDao;

public interface PeliculaDao extends GenericDao<Pelicula, Long> {
	
	public List<Pelicula> findByName(String titulo);

}
