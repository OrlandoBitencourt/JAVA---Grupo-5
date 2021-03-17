package com.grupo5.api.controller;

import java.util.List;

import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.services.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.grupo5.api.model.SalaModel;
import com.grupo5.api.repository.SalaRepository;

/**
 * CONTROLLER: SalaController
 * 
 * Endpoint: /sala
 * 			 /sala/pessoas/{salaID}/{pessoaID}
 * 
 * Metodos: 
 * 	GET: listar(), 
 * 	POST: adicionar
 * 	PUT: adicionar pessoa a sala
 * 
 * @author Gabriela, Pedro, 
 * Matheus, Orlando, Rudolfo
 *
 */

@RestController
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	private SalaService salaService;
	
	@GetMapping
	public List<SalaModel> listar() {
		return salaService.index();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SalaModel adicionar(@RequestBody SalaModel salaModel) {
		return (SalaModel) salaService.store(salaModel);
	}

	@PutMapping(path = "pessoas/{salaID}/{pessoaID}")
	public SalaModel pessoaEntraSala(@PathVariable(name = "salaID") Integer idSala, @PathVariable(name = "pessoaID") Integer idPessoa) {
		return (SalaModel) salaService.vincularPessoaSala(idSala, idPessoa);
	}
}
