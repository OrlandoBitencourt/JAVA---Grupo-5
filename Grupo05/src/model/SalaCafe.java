package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class SalaCafe {

	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSalaCafe;
	
	@Column
	private String nomeSalaCafe;
	
	@Column
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
