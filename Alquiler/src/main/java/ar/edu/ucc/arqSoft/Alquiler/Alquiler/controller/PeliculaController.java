package ar.edu.ucc.arqSoft.Alquiler.Alquiler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.arqSoft.Alquiler.Alquiler.dto.PeliculaResponseDto;
import ar.edu.ucc.arqSoft.Alquiler.Alquiler.service.PeliculaService;

@Controller
@RequestMapping("/pelicula")
public class PeliculaController {
	
	@Autowired
    private PeliculaService peliculaService;

    @RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<PeliculaResponseDto> getAllPeliculas()
    {
        return peliculaService.getAllPeliculas();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PeliculaResponseDto lookupPeliculaById(@PathVariable("id") Long id)
    {
        return peliculaService.getPeliculaById(id);
    }
    
}
