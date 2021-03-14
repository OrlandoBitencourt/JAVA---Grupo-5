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

import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
	public List<PessoaModel> listar() {
		return pessoaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PessoaModel adicionar(@RequestBody PessoaModel pessoaModel) {
		return pessoaRepository.save(pessoaModel);
	}
}
