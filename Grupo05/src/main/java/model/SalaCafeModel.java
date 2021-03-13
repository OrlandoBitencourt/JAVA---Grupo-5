package main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Classe SalaCafe.
* 
* Atributos: id, nome e lotacao.
* 
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

@Entity
@Table(name="sala_cafe")
public class SalaCafeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sala_cafe_id")
	private int idSalaCafe;
	
	@Column(name="sala_cafe_nome")
	private String nomeSalaCafe;
	
	@Column(name="sala_cafe_lotacao")
	private int lotacaoSalaCafe;

	public int getIdSalaCafe() {
		return idSalaCafe;
	}

	public void setIdSalaCafe(int idSalaCafe) {
		this.idSalaCafe = idSalaCafe;
	}

	public String getNomeSalaCafe() {
		return nomeSalaCafe;
	}

	public void setNomeSalaCafe(String nomeSalaCafe) {
		this.nomeSalaCafe = nomeSalaCafe;
	}

	public int getLotacaoSalaCafe() {
		return lotacaoSalaCafe;
	}

	public void setLotacaoSalaCafe(int lotacaoSalaCafe) {
		this.lotacaoSalaCafe = lotacaoSalaCafe;
	}

	
	
}
