package com.grupo5.api.model;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

/**
 * MODEL: EtapaModel
 * 
 * Atributos: idEtapa, numeroEtapa, inicioEtapa, finalEtapa,
 * inicioCafeEtapa, finalCafeEtapa, eventoModelEvento_id.
 * 
 * eventoModelEvento_id: FK ligação muitos para um com EventoModel
 * 
 * Getter e setter adicionado automaticamente pelo lombok (@Data)
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@Data
@Entity
@Table(name = "etapas")
public class EtapaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="etapa_id")
	private Integer idEtapa;
	
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
	
	@ManyToOne
	@JoinColumn(name = "idEvento", referencedColumnName = "evento_id")
	private EventoModel eventoModelEvento_id;

	@ManyToMany
	private List<SalaModel> salas;

	public EtapaModel(){}

	public void setSala(SalaModel sala){
		this.salas.add(sala);
	}

	@ManyToMany
	private List<SalaCafeModel> salasCafe;

	public void setSalaCafe(SalaCafeModel salaCafeModels){
		this.salasCafe.add(salaCafeModels);
	}

//	public EventoModel(Integer idEtapa, int numeroEtapa, String inicioEtapa, String finalEtapa, String inicioCafeEtapa, String finalCafeEtapa) {
//		this.idEtapa = idEtapa;
//		this.numeroEtapa = numeroEtapa;
//		this.inicioEtapa = inicioEtapa;
//		this.finalEtapa = finalEtapa;
//		this.inicioCafeEtapa = inicioCafeEtapa;
//		this.finalCafeEtapa = finalCafeEtapa;
//	}

//	@ManyToOne
//	@JoinColumn(name = "idEvento", referencedColumnName = "evento_id")
//	private EventoModel eventoModelEvento_id;
}
