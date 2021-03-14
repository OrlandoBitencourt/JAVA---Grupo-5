package com.grupo5.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sala")
public class SalaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sala_id")
	private Integer idSala;
	
	@Column(name="sala_nome")
	private String nomeSala;
	
	@Column(name="sala_lotacao")
	private int lotacaoSala;
}
