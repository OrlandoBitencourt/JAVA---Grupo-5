package com.grupo5.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

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
public class EventoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="evento_id")
	private Integer idEvento;
	
	@Column(name="evento_nome")
	private String nomeEvento;
	
	@Column(name="evento_inscricoes")
	private int inscricoesEvento;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private PessoaModel pessoa;

}
