package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao;

import java.util.Date;
import java.util.List;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Alquiler;
import ar.edu.ucc.arqSoft.Alquiler.Common.dao.GenericDaoImp;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

@Repository
public class  AlquilerDaoImp extends GenericDaoImp<Alquiler, Long> implements AlquilerDao{
	
	@Override
	public List<Alquiler> findByFecha(Date fecha_alquiler) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Alquiler> criteria = builder.createQuery(Alquiler.class);
        Root<Alquiler> entity = criteria.from(Alquiler.class);

        criteria.select(entity).where(builder.equal(entity.get("fecha_alquiler"), fecha_alquiler));
        return em.createQuery(criteria).getResultList();
	}

}
