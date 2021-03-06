package ar.edu.ucc.arqSoft.Alquiler.Alquiler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.AlquilerRequestDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.AlquilerResponseDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.service.AlquilerService;

@Controller
@RequestMapping("/alquiler")
public class AlquilerController {
	
	@Autowired
    private AlquilerService alquilerService;
	
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody AlquilerResponseDto saveAlquiler(@RequestBody AlquilerRequestDto request)
    {
        return alquilerService.insertAlquiler(request);
    }

}
