package main.java.controller;

import main.java.model.PessoaModel;
import main.java.view.PessoaView;

public class PessoaController {
	
	private PessoaModel model;
	private PessoaView view;
	
	public PessoaController(PessoaModel model, PessoaView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getNomePessoa() {
		return getNomePessoa();
	}
	public void setNome(String nomePessoa) {
		this.model.setNomePessoa(nomePessoa);
	}
	public String getSobrenomePessoa() {
		return getSobrenomePessoa();
	}
	public void setSobrenomePessoa(String sobrenomePessoa) {
		this.model.setSobrenomePessoa(sobrenomePessoa);
	}
	
	public void atualizar() {
		view.consultarPessoa(model.getNomePessoa(), model.getSobrenomePessoa());
	}
}
