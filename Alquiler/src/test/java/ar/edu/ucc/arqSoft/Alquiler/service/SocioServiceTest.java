package ar.edu.ucc.arqSoft.Alquiler.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.SocioRequestDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.SocioResponseDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.service.SocioService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml", "classpath:/spring/applicationContext.xml" })
public class SocioServiceTest {
	
	@Autowired
	private SocioService socioService;
	
	@Test
	public void testInsert() {
		SocioRequestDto request = new SocioRequestDto();
		
		request.setApellido("Cobresi");
		request.setEmail("tici.cobresi21@gmail.com");
		request.setDni("42358387");
		request.setNombre("Ticiana");
		
		SocioResponseDto response =socioService.insertSocio(request);
		
		//pero porque tendria que hacer un equals
		
		//Assert.assertEquals("Catamarca",response.getName());
		Assert.assertEquals(2, response.getId().longValue());
		return;
	}
}