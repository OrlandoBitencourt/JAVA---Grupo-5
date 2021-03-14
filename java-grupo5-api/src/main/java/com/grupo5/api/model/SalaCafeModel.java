package com.grupo5.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@Data
@Entity
@Table(name = "sala_cafe")
public class SalaCafeModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sala_cafe_id")
	private int idSalaCafe;
	
	@Column(name="sala_cafe_nome", nullable = false)
	private String nomeSalaCafe;
	
	@Column(name="sala_cafe_lotacao", nullable = false)
	private int lotacaoSalaCafe;

}
