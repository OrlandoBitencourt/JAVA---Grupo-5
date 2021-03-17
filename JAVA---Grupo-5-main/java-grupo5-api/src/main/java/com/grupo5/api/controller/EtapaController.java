package com.grupo5.api.controller;

import java.util.List;

import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.services.EtapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.grupo5.api.model.EtapaModel;
import com.grupo5.api.repository.EtapaRepository;

/**
 * CONTROLLER: EtapaController
 * 
 * 
 * @author Gabriela, Pedro, 
 * Matheus, Orlando, Rudolfo
 *
 */

@RestController
@RequestMapping("/etapas")
public class EtapaController {
	
	@Autowired
	private EtapaService etapaService;
	
	@GetMapping
	public List<EtapaModel> listar() {
		return etapaService.index();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public EtapaModel adicionar(@RequestBody EtapaModel etapaModel) {
		return (EtapaModel) etapaService.store(etapaModel);
	}

	@PutMapping(path = "/{salaId}/{etapaId}")
	public PessoaModel inscreverSalaNaEtapa(@PathVariable(name = "salaId") Integer idSala, @PathVariable(name = "etapaId") Integer idEtapa){
		try {

			return (PessoaModel) etapaService.vincularSalaEtapa(idSala, idEtapa);

		} catch (Exception e){
			System.out.println(e);
			return null;
		}
	}


	@PutMapping(path = "/cafe/{salaCafeId}/{etapaId}")
	public PessoaModel inscreverSalaCafeNaEtapa(@PathVariable(name = "salaCafeId") Integer idSalaCafe, @PathVariable(name = "etapaId") Integer idEtapa){
		try {

			return (PessoaModel) etapaService.vincularSalaCafeEtapa(idSalaCafe, idEtapa);

		} catch (Exception e){
			System.out.println(e);
			return null;
		}
	}
}
