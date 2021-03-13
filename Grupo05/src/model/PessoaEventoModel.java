package model;

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
	private int idPessoaEvento;
	
	@Column
	private int idPessoa;
	
	@Column
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
