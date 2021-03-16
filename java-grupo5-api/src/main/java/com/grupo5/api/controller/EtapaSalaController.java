package com.grupo5.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.grupo5.api.model.EtapaSalaModel;
import com.grupo5.api.repository.EtapaSalaRepository;

/**
 * CONTROLLER: EtapaSalaController
 * 
 * Endpoint: /etapa-salas
 * 
 * Metodos: 
 * 	GET: listar(), 
 * 	POST: adicionar(MODEL)
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@RestController
@RequestMapping("/etapa-salas")
public class EtapaSalaController {
	
	@Autowired
	private EtapaSalaRepository etapaSalaRepository;
	
	@GetMapping
	public List<EtapaSalaModel> listar() {
		return etapaSalaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public EtapaSalaModel adicionar(@RequestBody EtapaSalaModel etapaSalaModel) {
		return etapaSalaRepository.save(etapaSalaModel);
	}
}
