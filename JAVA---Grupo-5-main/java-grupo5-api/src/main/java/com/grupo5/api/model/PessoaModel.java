package com.grupo5.api.model;


import java.util.List;

import javax.persistence.*;


import lombok.Data;

/**
 * MODEL: PessoaModel
 * 
 * Atributos: idPessoa, nomePessoa, sobrenomePessoa, evento
 * 
 * evento: FK ligação um para muitos com EventoModel
 * 
 * Getter e setter adicionado automaticamente pelo lombok (@Data)
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@Entity
@Data
@Table(name = "pessoas")
public class PessoaModel{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pessoa_id")
	private int idPessoa;
	
	@Column(name="pessoa_nome")
	private String nomePessoa;
	
	@Column(name="pessoa_sobrenome")
	private String sobrenomePessoa;

}


