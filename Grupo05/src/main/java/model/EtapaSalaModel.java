package main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Classe EventoSala.
* 
* Atributos: idEtapaSala, idEtapa e idSala.
* 
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

@Entity
@Table(name="etapa_sala")
public class EtapaSalaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEtapaSala;
	
	@Column
	private int idEtapa;
	
	@Column
	private int idSala;

	public int getIdEtapaSala() {
		return idEtapaSala;
	}

	public void setIdEtapaSala(int idEtapaSala) {
		this.idEtapaSala = idEtapaSala;
	}

	public int getIdEtapa() {
		return idEtapa;
	}

	public void setIdEtapa(int idEtapa) {
		this.idEtapa = idEtapa;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	
	
}
