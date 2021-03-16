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

import com.grupo5.api.model.EtapaCafeModel;
import com.grupo5.api.repository.EtapaCafeRepository;

/**
 * CONTROLLER: EtapaCafeController
 * 
 * Endpoint: /etapa-cafe
 * 
 * Metodos: 
 * 	GET: listar(), 
 * 	POST: adicionar(MODEL)
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@RestController
@RequestMapping("/etapa-cafe")
public class EtapaCafeController {
	
	@Autowired
	private EtapaCafeRepository etapaCafeRepository;
	
	@GetMapping
	public List<EtapaCafeModel> listar() {
		return etapaCafeRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public EtapaCafeModel adicionar(@RequestBody EtapaCafeModel etapaCafeModel) {
		return etapaCafeRepository.save(etapaCafeModel);
	}
}
