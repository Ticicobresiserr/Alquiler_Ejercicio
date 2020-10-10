package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao;

import java.util.List;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Socio;
import ar.edu.ucc.arqSoft.Alquiler.Common.dao.GenericDao;

public interface SocioDao extends GenericDao<Socio, Long> {
	
	public List<Socio> findByDNI(Long dni);

}
