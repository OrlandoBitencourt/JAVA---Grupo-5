package main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class SalaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sala_id")
	private int idSala;
	
	@Column(name="sala_nome")
	private String nomeSala;
	
	@Column(name="sala_lotacao")
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
