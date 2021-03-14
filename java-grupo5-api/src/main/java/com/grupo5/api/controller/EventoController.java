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

import com.grupo5.api.model.EventoModel;
import com.grupo5.api.repository.EventoRepository;

/**
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@RestController
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping
	public List<EventoModel> listar() {
		return eventoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public EventoModel adicionar(@RequestBody EventoModel eventoModel) {
		return eventoRepository.save(eventoModel);
	}
}
