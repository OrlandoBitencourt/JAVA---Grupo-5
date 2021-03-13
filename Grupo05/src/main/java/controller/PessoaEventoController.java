package main.java.controller;

import main.java.model.PessoaEventoModel;
import main.java.view.PessoaEventoView;

public class PessoaEventoController {
	private PessoaEventoModel model;
	private PessoaEventoView view;
	
	public PessoaEventoController(PessoaEventoModel model, PessoaEventoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getIdPessoaEvento() {
		return getIdPessoaEvento();
	}

	public void setIdPessoaEvento(int idPessoaEvento) {
		this.model.setIdPessoaEvento(idPessoaEvento);
	}

	public int getIdPessoa() {
		return getIdPessoa();
	}

	public void setIdPessoa(int idPessoa) {
		this.model.setIdPessoa(idPessoa);
	}

	public int getIdEvento() {
		return getIdEvento();
	}

	public void setIdEvento(int idEvento) {
		this.model.setIdEvento(idEvento);
	}
	
	public void atualizar() {
		view.consultarPessoaEvento(model.getIdPessoaEvento(), model.getIdPessoa(), model.getIdEvento());
	}
}
