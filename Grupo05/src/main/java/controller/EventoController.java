package main.java.controller;

import main.java.model.EventoModel;
import main.java.view.EventoView;

public class EventoController {
	
	private EventoModel model;
	private EventoView view;
	
	public EventoController(EventoModel model, EventoView view) {
		this.model = model;
		this.view = view;
	}

	public String getNomeEvento() {
		return getNomeEvento();
	}

	public void setNomeEvento(String nomeEvento) {
		this.model.setNomeEvento(nomeEvento);
	}

	public int getInscricoesEvento() {
		return getInscricoesEvento();
	}

	public void setInscricoesEvento(int inscricoesEvento) {
		this.model.setInscricoesEvento(inscricoesEvento);
	}

	public void atualizar() {
		view.consultarEvento(model.getNomeEvento(), model.getInscricoesEvento());
	}
	
}
