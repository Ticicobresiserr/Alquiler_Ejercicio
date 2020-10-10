package ar.edu.ucc.arqSoft.Alquiler.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.AlquilerRequestDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.AlquilerResponseDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.service.AlquilerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class AlquilerServiceTest {
	
	@Autowired
	private AlquilerService alquilerService;
	
	@Test
	public void testInsert() {
		AlquilerRequestDto request = new AlquilerRequestDto();
		request.setFecha_alquiler(new java.util.Date(System.currentTimeMillis()));
		
		AlquilerResponseDto response = alquilerService.insertAlquiler(request);
		
		//aca estaria filtrando para insertar cuando un state  nombre es catamarca?
		//assertEquals(expected, actual) y return true if: expected.equals( actual ) returns true.
		
		//Assert.assertEquals("Catamarca",response.getName());
		Assert.assertEquals(2, response.getId().longValue());
		return;
	}
}
