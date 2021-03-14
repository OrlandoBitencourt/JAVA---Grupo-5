package com.grupo5.api.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.grupo5.api.model.PessoaEventoModel;
import com.grupo5.api.repository.PessoaEventoRepository;

/**
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@RestController
@RequestMapping("/pessoa-evento")
public class PessoaEventoController {
	

	@Autowired
	private PessoaEventoRepository pessoaEventoRepository;
	
	@GetMapping
	public List<PessoaEventoModel> listar() {
		return pessoaEventoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PessoaEventoModel adicionar(@RequestBody PessoaEventoModel pessoaEventoModel) {
		return pessoaEventoRepository.save(pessoaEventoModel);
	}
}
