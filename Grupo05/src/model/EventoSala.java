package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
* Classe EventoSala.
* 
* Atributos: idEventoSala, idEvento e idSala.
* 
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

@Entity
@Table(name="evento_sala")
public class EventoSala {
	
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEventoSala;
	
	@Column
	private int idEvento;
	
	@Column
	private int idSala;

	public int getIdEventoSala() {
		return idEventoSala;
	}

	public void setIdEventoSala(int idEventoSala) {
		this.idEventoSala = idEventoSala;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	
	
}
