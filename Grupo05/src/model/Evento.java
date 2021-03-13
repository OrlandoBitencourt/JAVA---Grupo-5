package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
* Classe Evento.
* 
* Atributos: idEvento, nomeEvento, inscricoesEvento, 
* inicioEvento, finalEvento e etapaEvento.
* 
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

@Entity
@Table(name="evento")
public class Evento {
	
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvento;
	
	@Column
	private String nomeEvento;
	
	@Column
	private int inscricoesEvento;
	
	@Column
	private String inicioEvento;
	
	@Column
	private String finalEvento;
	
	@Column
	private int etapaEvento;

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

	public String getInicioEvento() {
		return inicioEvento;
	}

	public void setInicioEvento(String inicioEvento) {
		this.inicioEvento = inicioEvento;
	}

	public String getFinalEvento() {
		return finalEvento;
	}

	public void setFinalEvento(String finalEvento) {
		this.finalEvento = finalEvento;
	}

	public int getEtapaEvento() {
		return etapaEvento;
	}

	public void setEtapaEvento(int etapaEvento) {
		this.etapaEvento = etapaEvento;
	}
	
	
}