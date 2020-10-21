package ar.edu.ucc.arqSoft.Alquiler.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao.AlquilerDao;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Alquiler;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional
public class AlquilerDaoTest {
	
private static final Logger logger = LogManager.getLogger(AlquilerDaoTest.class);
	

	@Autowired
	private AlquilerDao alquilerDao;


	@Test
	public void testRegister() {

		logger.info("Test de Registro de Alquiler");
		
		Alquiler alquiler = new Alquiler();

		alquilerDao.insert(alquiler);
		//assertEquals(expected, actual) y return true if: expected.equals( actual ) returns true.
		Assert.assertEquals(2, alquiler.getId().longValue());
		return;
	}

}
