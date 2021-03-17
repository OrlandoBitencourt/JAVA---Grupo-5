package com.grupo5.api.model;

import lombok.Data;

import javax.persistence.*;


import java.io.Serializable;
import java.util.List;

/**
 * MODEL: EventoModel
 * 
 * Atributos: idEvento, nomeEvento, inscricoesEvento, pessoa
 * 
 * pessoa: Fk ligação muitos para um com PessoaModel
 * 
 * Getter e setter adicionado automaticamente pelo lombok (@Data)
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@Data
@Entity
@Table(name = "evento")
public class EventoModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="evento_id")
	private Integer idEvento;
	
	@Column(name="evento_nome")
	private String nomeEvento;
	
	@Column(name="evento_inscricoes")
	private int inscricoesEvento;
	
	@ManyToMany
	private List<PessoaModel> pessoas;

	public EventoModel(){}

	public EventoModel(Integer idEvento, String nomeEvento, int inscricoesEvento) {
		this.idEvento = idEvento;
		this.nomeEvento = nomeEvento;
		this.inscricoesEvento = inscricoesEvento;
	}


	public void setPessoa(PessoaModel pessoa){
		this.pessoas.add(pessoa);
	}
}
