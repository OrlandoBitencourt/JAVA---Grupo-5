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

import com.grupo5.api.model.SalaModel;
import com.grupo5.api.repository.SalaRepository;

@RestController
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	private SalaRepository salaRepository;
	
	@GetMapping
	public List<SalaModel> listar() {
		return salaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SalaModel adicionar(@RequestBody SalaModel salaModel) {
		return salaRepository.save(salaModel);
	}
}
