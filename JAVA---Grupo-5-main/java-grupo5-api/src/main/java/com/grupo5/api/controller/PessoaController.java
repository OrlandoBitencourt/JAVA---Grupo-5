package com.grupo5.api.controller;

import java.util.List;

import com.grupo5.api.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.repository.PessoaRepository;

/**
 * CONTROLLER: PessoaController
 * 
 * Endpoint: /pessoas
 * 
 * Metodos: 
 * 	GET: listar(), 
 * 	POST: adicionar(MODEL)
 * 
 * @author Gabriela, Pedro, 
 * Matheus, Orlando, Rudolfo
 *
 */

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public List<PessoaModel> listar() {
		return pessoaService.index();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PessoaModel adicionar(@RequestBody PessoaModel pessoaModel) {
		return (PessoaModel) pessoaService.store(pessoaModel);
	}

}
