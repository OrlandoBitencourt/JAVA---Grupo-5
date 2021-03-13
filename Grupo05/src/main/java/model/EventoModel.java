package main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Classe Evento.
* 
* Atributos: idEvento, nomeEvento, inscricoesEvento
* 
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

@Entity
@Table(name="evento")
public class EventoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvento;
	
	@Column
	private String nomeEvento;
	
	@Column
	private int inscricoesEvento;
	

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public int getInscricoesEvento() {
		return inscricoesEvento;
	}

	public void setInscricoesEvento(int inscricoesEvento) {
		this.inscricoesEvento = inscricoesEvento;
	}

	
	
}
