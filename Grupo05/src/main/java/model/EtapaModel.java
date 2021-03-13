package main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Classe Etapa.
* 
* Atributos: idEtapa, numeroEtapa, inicioEtapa,
* finalEtapa, inicioCafeEtapa, finalCafeEtapa,
* idEvento.
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

@Entity
@Table(name="etapa")
public class EtapaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="etapa_id")
	private int idEtapa;
	
	@Column(name="etapa_numero")
	private int numeroEtapa;
	
	@Column(name="etapa_inicio")
	private String inicioEtapa;
	
	@Column(name="etapa_final")
	private String finalEtapa;
	
	@Column(name="etapa_cafe_inicio")
	private String inicioCafeEtapa;
	
	@Column(name="etapa_cafe_final")
	private String finalCafeEtapa;
	
	@Column(name="evento_id")
	private int idEvento;

	public int getIdEtapa() {
		return idEtapa;
	}

	public void setIdEtapa(int idEtapa) {
		this.idEtapa = idEtapa;
	}

	public int getNumeroEtapa() {
		return numeroEtapa;
	}

	public void setNumeroEtapa(int numeroEtapa) {
		this.numeroEtapa = numeroEtapa;
	}

	public String getInicioEtapa() {
		return inicioEtapa;
	}

	public void setInicioEtapa(String inicioEtapa) {
		this.inicioEtapa = inicioEtapa;
	}

	public String getFinalEtapa() {
		return finalEtapa;
	}

	public void setFinalEtapa(String finalEtapa) {
		this.finalEtapa = finalEtapa;
	}

	public String getInicioCafeEtapa() {
		return inicioCafeEtapa;
	}

	public void setInicioCafeEtapa(String inicioCafeEtapa) {
		this.inicioCafeEtapa = inicioCafeEtapa;
	}

	public String getFinalCafeEtapa() {
		return finalCafeEtapa;
	}

	public void setFinalCafeEtapa(String finalCafeEtapa) {
		this.finalCafeEtapa = finalCafeEtapa;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	
	
	
}
