package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
* Classe Sala.
* 
* Atributos: id, nome e lotacao.
* 
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

@Entity
@Table(name="sala")
public class Sala {

	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSala;
	
	@Column
	private String nomeSala;
	
	@Column
	private int lotacaoSala;

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public int getLotacaoSala() {
		return lotacaoSala;
	}

	public void setLotacaoSala(int lotacaoSala) {
		this.lotacaoSala = lotacaoSala;
	}
	
	
}
