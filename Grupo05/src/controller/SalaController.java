package controller;

import model.SalaModel;
import view.SalaView;

public class SalaController {
	
	private SalaModel model;
	private SalaView view;
	
	public SalaController(SalaModel model, SalaView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getNomeSala() {
		return getNomeSala();
	}
	public void setNomeSala(String nomeSala) {
		this.model.setNomeSala(nomeSala);
	}
	public int getLotacaoSala() {
		return getLotacaoSala();
	}
	public void setLotacaoSala(int lotacaoSala) {
		this.model.setLotacaoSala(lotacaoSala);
	}
	
	public void atualizar() {
		view.consultarSala(model.getNomeSala(), model.getLotacaoSala());
	}
}
