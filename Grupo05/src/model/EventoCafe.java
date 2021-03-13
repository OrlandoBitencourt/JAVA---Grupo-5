package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
* Classe EventoCafe.
* 
* Atributos: idEventoCafe, idEvento e idCafe.
* 
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

@Entity
@Table(name="evento_cafe")
public class EventoCafe {

	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEventoCafe;
	
	@Column
	private int idEvento;
	
	@Column
	private int idCafe;

	public int getIdEventoCafe() {
		return idEventoCafe;
	}

	public void setIdEventoCafe(int idEventoCafe) {
		this.idEventoCafe = idEventoCafe;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public int getIdCafe() {
		return idCafe;
	}

	public void setIdCafe(int idCafe) {
		this.idCafe = idCafe;
	}
	
	
}
