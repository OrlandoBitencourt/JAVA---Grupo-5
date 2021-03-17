package com.grupo5.api.model;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

/**
 * MODEL: SalaCafeModel
 * 
 * Atributos: idSalaCafe, nomeSalaCafe, lotacaoSalaCafe
 * 
 * Getter e setter adicionado automaticamente pelo lombok (@Data)
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


	@ManyToMany
	private List<PessoaModel> pessoas;

	private SalaCafeModel(){}

	public void setPessoa(PessoaModel salaCafe) {
		this.pessoas.add(salaCafe);
	}
}
