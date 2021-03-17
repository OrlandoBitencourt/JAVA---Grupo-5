package com.grupo5.api.controller;

import java.util.List;

import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.services.EventoService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.grupo5.api.model.EventoModel;
import com.grupo5.api.repository.EventoRepository;

/**
 * CONTROLLER: EventoController
 * 
 * Endpoint: /evento
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
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	private EventoService eventoService;
	
	@GetMapping
	public List<EventoModel> listar() {
		return eventoService.index();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public EventoModel adicionar(@RequestBody EventoModel eventoModel) {
		return (EventoModel) eventoService.store(eventoModel);
	}

	@PutMapping(path = "/{eventoID}/{pessoaID}")
	public PessoaModel inscreverPessoaNoEvento(@PathVariable(name = "eventoID") Integer idEvento, @PathVariable(name = "pessoaID") Integer idPessoa){
		try {

			return (PessoaModel) eventoService.vincularPessoaEvento(idEvento, idPessoa);

		} catch (Exception e){
			System.out.println(e);
			return null;
		}
	}
}
