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
	
	@JoinColumn(name = "idEtapa", referencedColumnName = "etapa_id")
	@ManyToOne
	private EtapaModel etapaModelEtapa_id;
	
	@JoinColumn(name = "idSala", referencedColumnName = "sala_id")
	@ManyToOne
	private SalaModel salaModelSala_id;
}
