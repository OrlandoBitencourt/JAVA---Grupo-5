package main.java.controller;

import main.java.model.SalaCafeModel;
import main.java.view.SalaCafeView;

public class SalaCafeController {
	
	private SalaCafeModel model;
	private SalaCafeView view;
	
	public SalaCafeController(SalaCafeModel model, SalaCafeView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getNomeSalaCafe() {
		return getNomeSalaCafe();
	}
	public void setNomeSalaCafe(String nomeSalaCafe) {
		this.model.setNomeSalaCafe(nomeSalaCafe);
	}
	public int getLotacaoSalaCafe() {
		return getLotacaoSalaCafe();
	}
	public void setLotacaoSalaCafe(int lotacaoSalaCafe) {
		this.model.setLotacaoSalaCafe(lotacaoSalaCafe);
	}
	
	public void atualizar() {
		view.consultarSalaCafe(model.getNomeSalaCafe(), model.getLotacaoSalaCafe());
	}
}
