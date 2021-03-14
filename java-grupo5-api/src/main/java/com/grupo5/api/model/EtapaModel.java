package com.grupo5.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
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
	
	@JoinColumn(name = "idEvento", referencedColumnName = "evento_id")
	@ManyToOne
	private EventoModel eventoModelEvento_id;
}
