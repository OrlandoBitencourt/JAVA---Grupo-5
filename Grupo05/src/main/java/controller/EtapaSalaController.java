package main.java.controller;

import main.java.model.EtapaSalaModel;
import main.java.view.EtapaSalaView;

public class EtapaSalaController {
	private EtapaSalaModel model;
	private EtapaSalaView view;
	
	public EtapaSalaController(EtapaSalaModel model, EtapaSalaView view) {
		this.model = model;
		this.view = view;
	}
	

	public int getIdEtapaSala() {
		return getIdEtapaSala();
	}

	public void setIdEtapaSala(int idEtapaSala) {
		this.model.setIdEtapaSala(idEtapaSala);
	}

	public int getIdEtapa() {
		return getIdEtapa();
	}

	public void setIdEtapa(int idEtapa) {
		this.model.setIdEtapa(idEtapa);
	}

	public int getIdSala() {
		return getIdSala();
	}

	public void setIdSala(int idSala) {
		this.model.setIdSala(idSala);
	}
	
	public void atualizar() {
		view.consultarEtapaSala(model.getIdEtapaSala(), model.getIdEtapa(), model.getIdSala());
	}
}
