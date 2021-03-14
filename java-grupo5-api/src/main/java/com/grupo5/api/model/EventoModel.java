package com.grupo5.api.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


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
	
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private PessoaModel pessoa;

}
