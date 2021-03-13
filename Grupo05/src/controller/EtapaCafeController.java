package controller;

import model.EtapaCafeModel;
import view.EtapaCafeView;

public class EtapaCafeController {
	private EtapaCafeModel model;
	private EtapaCafeView view;
	
	public EtapaCafeController(EtapaCafeModel model, EtapaCafeView view) {
		this.model = model;
		this.view = view;
	}
	

	public int getIdEtapaCafe() {
		return getIdEtapaCafe();
	}

	public void setIdEtapaCafe(int idEtapaCafe) {
		this.model.setIdEtapaCafe(idEtapaCafe);
	}

	public int getIdEtapa() {
		return getIdEtapa();
	}

	public void setIdEtapa(int idEtapa) {
		this.model.setIdEtapa(idEtapa);
	}

	public int getIdCafe() {
		return getIdCafe();
	}

	public void setIdCafe(int idCafe) {
		this.model.setIdCafe(idCafe);
	}
	
	public void atualizar() {
		view.consultarEtapaCafe(model.getIdEtapaCafe(), model.getIdEtapa(), model.getIdCafe());
	}
}
