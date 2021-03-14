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


@Entity
@Data
@Table(name = "pessoas_evento")
public class PessoaEventoModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pessoa_evento_id")
	private Integer idPessoaEvento;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private PessoaModel pessoa;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "evento_id")
	private EventoModel evento;


}
