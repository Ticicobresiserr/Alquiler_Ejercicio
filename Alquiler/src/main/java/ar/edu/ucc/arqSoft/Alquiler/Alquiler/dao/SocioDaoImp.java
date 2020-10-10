package ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Socio;
import ar.edu.ucc.arqSoft.Alquiler.Common.dao.GenericDaoImp;

@Repository
public class SocioDaoImp extends GenericDaoImp<Socio, Long> implements SocioDao{
		
		@Override
		public List<Socio> findByDNI(Long dni) {
			CriteriaBuilder builder = em.getCriteriaBuilder();
	        CriteriaQuery<Socio> criteria = builder.createQuery(Socio.class);
	        Root<Socio> entity = criteria.from(Socio.class);

	        criteria.select(entity).where(builder.equal(entity.get("dni"), dni));
	        return em.createQuery(criteria).getResultList();
		}

}
