package ar.edu.ucc.arqSoft.Alquiler.Alquiler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.SocioRequestDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.SocioResponseDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.service.SocioService;

public class SocioController {
	
	@Autowired
    private SocioService socioService;
	
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody SocioResponseDto saveSatate(@RequestBody SocioRequestDto request)
    {
        return socioService.insertSocio(request);
    }

}
