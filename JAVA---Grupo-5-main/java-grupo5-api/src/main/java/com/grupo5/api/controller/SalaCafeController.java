package com.grupo5.api.controller;

import java.util.List;

import com.grupo5.api.model.SalaModel;
import com.grupo5.api.services.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.grupo5.api.model.SalaCafeModel;
import com.grupo5.api.repository.SalaCafeRepository;

/**
 * CONTROLLER: SalaCafeController
 * 
 * Endpoint: /sala-cafe
 * 			 /sala-cafe/pessoa/{salaCafeID}/{pessoaID}
 * 
 * Metodos: 
 * 	GET: listar(), 
 * 	POST: adicionar(MODEL)
 * 	PUT: adicionar pessoa a sala de cafe
 * 
 * @author Gabriela, Pedro, 
 * Matheus, Orlando, Rudolfo
 *
 */

@RestController
@RequestMapping("/sala-cafe")
public class SalaCafeController {
	
	@Autowired
	private CafeService cafeService;
	
	@GetMapping
	public List<SalaCafeModel> listar() {
		return cafeService.index();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SalaCafeModel adicionar(@RequestBody SalaCafeModel salaCafeModel) {
		return (SalaCafeModel) cafeService.store(salaCafeModel);
	}

	@PutMapping(path = "pessoa/{salaCafeID}/{pessoaID}")
	public SalaCafeModel pessoaEntraSalaCafe(@PathVariable(name = "salaCafeID") Integer idSalaCafe, @PathVariable(name = "pessoaID") Integer idPessoa) {
		return (SalaCafeModel) cafeService.vincularPessoaSalaCafe(idSalaCafe, idPessoa);
	}
}
