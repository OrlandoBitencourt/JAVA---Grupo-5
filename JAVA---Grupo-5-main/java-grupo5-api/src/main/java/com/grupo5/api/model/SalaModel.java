package com.grupo5.api.model;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * MODEL: SalaModel
 * 
 * Atributos: idSala, nomeSala, lotacaoSala
 * 
 * Getter e setter adicionado automaticamente pelo lombok (@Data)
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@Data
@Entity
@Table(name = "sala")
public class SalaModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sala_id")
	private Integer idSala;
	
	@Column(name="sala_nome")
	private String nomeSala;
	
	@Column(name="sala_lotacao")
	private int lotacaoSala;

	@ManyToMany
	private List<PessoaModel> pessoas;

	private SalaModel(){}

	public void setPessoa(PessoaModel sala) {
		this.pessoas.add(sala);
	}

	public void romevePessoas(PessoaModel pessoa) {
		this.pessoas.remove(pessoa);
	}
}
