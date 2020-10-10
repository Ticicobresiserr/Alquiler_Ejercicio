package ar.edu.ucc.arqSoft.Alquiler.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dao.PeliculaDao;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.model.Pelicula;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
@Transactional
public class PeliculaDaoTest  {

	private static final Logger logger = LogManager.getLogger(PeliculaDaoTest.class);
	
	@Autowired
	private PeliculaDao peliculaDao;

	@Test
	public void testFindById() {
		logger.info("Test de busqueda de Pelicula por ID");
		Pelicula pelicula = peliculaDao.load((long) 1);
		
		//assertEquals(expected, actual) y return true if: expected.equals( actual ) returns true.
		Assert.assertEquals("Nemo", pelicula.getTitulo());
		return;
	}

	@Test
	public void testfindByName() {

		logger.info("Test de busqueda de Pelicula por Nombre");
		List<Pelicula> peliculas= peliculaDao.findByName("Nemo");
		Assert.assertEquals(1, peliculas.size());
		return;
	}
	
	@Test
	public void testGetAll() {

		logger.info("Test de busqueda de todos los peliculas");
			List<Pelicula> peliculas= peliculaDao.getAll();
			Assert.assertNotNull(peliculas);
			return;
		}
}

