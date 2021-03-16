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

import com.grupo5.api.model.EtapaModel;
import com.grupo5.api.repository.EtapaRepository;

/**
 * CONTROLLER: EtapaController
 * 
 * Endpoint: /etapas
 * 
 * Metodos: 
 * 	GET: listar(), 
 * 	POST: adicionar(MODEL)
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@RestController
@RequestMapping("/etapas")
public class EtapaController {
	
	@Autowired
	private EtapaRepository etapaRepository;
	
	@GetMapping
	public List<EtapaModel> listar() {
		return etapaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public EtapaModel adicionar(@RequestBody EtapaModel etapaModel) {
		return etapaRepository.save(etapaModel);
	}
}
