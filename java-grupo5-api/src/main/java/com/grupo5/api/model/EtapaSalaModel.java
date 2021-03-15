package com.grupo5.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * MODEL: EtapaSalaModel
 * 
 * Atributos: idEtapaSala, etapaModelEtapa_id, salaModelSala_id
 * 
 * etapaModelEtapa_id: Fk ligação muitos para um com EtapaModel
 * 
 * salaModelSala_id: Fk ligação muitos para um com SalaModel
 * 
 * Getter e setter adicionado automaticamente pelo lombok (@Data)
 *  
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@Data
@Entity
@Table(name = "etapa_sala")
public class EtapaSalaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="etapa_sala_id")
	private int idEtapaSala;
	
	@ManyToOne
	@JoinColumn(name = "idEtapa", referencedColumnName = "etapa_id")
	private EtapaModel etapaModelEtapa_id;
	
	@ManyToOne
	@JoinColumn(name = "idSala", referencedColumnName = "sala_id")
	private SalaModel salaModelSala_id;
}
