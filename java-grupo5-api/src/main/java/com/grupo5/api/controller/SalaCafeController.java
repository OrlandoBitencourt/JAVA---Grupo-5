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

import com.grupo5.api.model.SalaCafeModel;
import com.grupo5.api.repository.SalaCafeRepository;

@RestController
@RequestMapping("/sala-cafe")
public class SalaCafeController {
	
	@Autowired
	private SalaCafeRepository salaCafeRepository;
	
	@GetMapping
	public List<SalaCafeModel> listar() {
		return salaCafeRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SalaCafeModel adicionar(@RequestBody SalaCafeModel salaCafeModel) {
		return salaCafeRepository.save(salaCafeModel);
	}
}
