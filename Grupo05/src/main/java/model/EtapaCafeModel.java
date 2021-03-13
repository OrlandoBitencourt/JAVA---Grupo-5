package main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Classe EventoCafe.
* 
* Atributos: idEtapaCafe, idEtapa e idCafe.
* 
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

@Entity
@Table(name="etapa_cafe")
public class EtapaCafeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEtapaCafe;
	
	@Column
	private int idEtapa;
	
	@Column
	private int idCafe;

	public int getIdEtapaCafe() {
		return idEtapaCafe;
	}

	public void setIdEtapaCafe(int idEtapaCafe) {
		this.idEtapaCafe = idEtapaCafe;
	}

	public int getIdEtapa() {
		return idEtapa;
	}

	public void setIdEtapa(int idEtapa) {
		this.idEtapa = idEtapa;
	}

	public int getIdCafe() {
		return idCafe;
	}

	public void setIdCafe(int idCafe) {
		this.idCafe = idCafe;
	}
	
	
}
