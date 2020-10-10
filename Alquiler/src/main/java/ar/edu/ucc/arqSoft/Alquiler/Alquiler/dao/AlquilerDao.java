package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao;

import java.util.Date;
import java.util.List;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Alquiler;
import ar.edu.ucc.arqSoft.Alquiler.Common.dao.GenericDao;

public interface AlquilerDao extends GenericDao<Alquiler, Long> {
	
	public List<Alquiler> findByFecha(Date fecha_alquiler);

}
