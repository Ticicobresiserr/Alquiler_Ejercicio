package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Pelicula;
import ar.edu.ucc.arqSoft.Alquiler.Common.dao.GenericDaoImp;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

@Repository
public class PeliculaDaoImp extends GenericDaoImp<Pelicula, Long> implements PeliculaDao{
	
	@Override
	public List<Pelicula> findByName(String titulo) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Pelicula> criteria = builder.createQuery(Pelicula.class);
        Root<Pelicula> entity = criteria.from(Pelicula.class);

        criteria.select(entity).where(builder.equal(entity.get("titulo"), titulo));
        return em.createQuery(criteria).getResultList();
	}

}
