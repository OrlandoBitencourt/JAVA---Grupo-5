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
@Table(name="pessoa_evento")
public class PessoaEventoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pessoa_evento_id")
	private int idPessoaEvento;
	
	@Column(name="pessoa_id")
	private int idPessoa;
	
	@Column(name="evento_id")
	private int idEvento;

	public int getIdPessoaEvento() {
		return idPessoaEvento;
	}

	public void setIdPessoaEvento(int idPessoaEvento) {
		this.idPessoaEvento = idPessoaEvento;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	
	
}
