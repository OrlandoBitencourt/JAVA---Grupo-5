package controller;

import model.EtapaModel;
import view.EtapaView;

public class EtapaController {
	private EtapaModel model;
	private EtapaView view;
	
	public EtapaController(EtapaModel model, EtapaView view) {
		this.model = model;
		this.view = view;
	}

	public int getIdEtapa() {
		return getIdEtapa();
	}

	public void setIdEtapa(int idEtapa) {
		this.model.setIdEtapa(idEtapa);
	}

	public int getNumeroEtapa() {
		return getNumeroEtapa();
	}

	public void setNumeroEtapa(int numeroEtapa) {
		this.model.setNumeroEtapa(numeroEtapa);
	}

	public String getInicioEtapa() {
		return getInicioEtapa();
	}

	public void setInicioEtapa(String inicioEtapa) {
		this.model.setInicioEtapa(inicioEtapa);
	}

	public String getFinalEtapa() {
		return getFinalEtapa();
	}

	public void setFinalEtapa(String finalEtapa) {
		this.model.setFinalEtapa(finalEtapa);
	}

	public String getInicioCafeEtapa() {
		return getInicioCafeEtapa();
	}

	public void setInicioCafeEtapa(String inicioCafeEtapa) {
		this.model.setInicioCafeEtapa(inicioCafeEtapa);
	}

	public String getFinalCafeEtapa() {
		return getFinalCafeEtapa();
	}

	public void setFinalCafeEtapa(String finalCafeEtapa) {
		this.model.setFinalCafeEtapa(finalCafeEtapa);
	}

	public int getIdEvento() {
		return getIdEvento();
	}

	public void setIdEvento(int idEvento) {
		this.model.setIdEvento(idEvento);
	}
	
	public void atualizar() {
		view.consultarEtapa(model.getNumeroEtapa(), model.getInicioEtapa(), model.getFinalEtapa(), model.getInicioCafeEtapa(), model.getFinalCafeEtapa(), model.getIdEvento());
	}
}
