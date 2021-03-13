package main.java.principal;

import main.java.bd.*;
import main.java.model.*;
import main.java.view.*;
import main.java.controller.*;

/**
* @author  Gabriela, Matheus, Orlando, Pedro, Rudolfo
* @version 1.0
*/


public class Principal {

	public static void main(String[] args) {
		//Conexao.conectar();
		
		Repositorio r = new Repositorio();

		PessoaModel model = dados(r);
		PessoaView view = new PessoaView();
		PessoaController controllerPessoa = new PessoaController(model, view);
		
		controllerPessoa.atualizar();
		

		
		
		/**
		 * TESTE CADASTRAR SALA
		SalaModel model = dados();
		SalaView view = new SalaView();
		SalaController controllerSala = new SalaController(model, view);
		
		controllerSala.atualizar();
		**/
		
		/**
		 * TESTE CADASTRAR SALA CAFE		
		SalaCafeModel model = dados();
		SalaCafeView view = new SalaCafeView();
		SalaCafeController controllerSalaCafe = new SalaCafeController(model, view);
		
		controllerSalaCafe.atualizar();
		**/
		
		/**
		 * TESTE CADASTRAR EVENTO
		EventoModel model = dados();
		EventoView view = new EventoView();
		EventoController controllerEvento = new EventoController(model, view);
		
		controllerEvento.atualizar();
		*/
		
		/**
		 * TESTE CADASTRAR ETAPA
		EtapaModel model = dados();
		EtapaView view = new EtapaView();
		EtapaController controllerEtapa = new EtapaController(model, view);
		
		controllerEtapa.atualizar();
		*/
		
		/**
		 * TESTE CADASTRAR ETAPASALA
		EtapaSalaModel model = dados();
		EtapaSalaView view = new EtapaSalaView();
		EtapaSalaController controllerEtapaSala = new EtapaSalaController(model, view);
		
		controllerEtapaSala.atualizar();
		*/
		
		/**
		 * TESTE CADASTRAR ETAPASALA
		EtapaCafeModel model = dados();
		EtapaCafeView view = new EtapaCafeView();
		EtapaCafeController controllerEtapaCafe = new EtapaCafeController(model, view);
		
		controllerEtapaCafe.atualizar();
		*/
		
		/**
		 * TESTE CADASTRAR ETAPASALA
		PessoaEventoModel model = dados();
		PessoaEventoView view = new PessoaEventoView();
		PessoaEventoController controllerPessoaEvento = new PessoaEventoController(model, view);
		
		controllerPessoaEvento.atualizar();
		*/
		
	}
	

	public static PessoaModel dados(Repositorio rep) {
		
		PessoaModel p = new PessoaModel();
		
		p.setNomePessoa("Orlando");
		p.setSobrenomePessoa("Bitencourt");
		
		rep.cadastrar(p);
		
		return p;
	}
	
	
	/**
	 * CRIA MODELO SALA COM DADOS
	//metodo de dados
	public static SalaModel dados() {
			
		SalaModel s = new SalaModel();
			
		s.setNomeSala("Auditorio 1");
		s.setLotacaoSala(30);
			
		return s;
	}
	**/
	
	/**
	 * CRIA MODELO SALA COM DADOS
	//metodo de dados
	public static SalaCafeModel dados() {
		
		SalaCafeModel c = new SalaCafeModel();
			
		c.setNomeSalaCafe("Refeitorio 1");
		c.setLotacaoSalaCafe(50);
			
		return c;
	}
	**/
	
	/**
	 * CRIA MODELO EVENTO
	//metodo de dados
	public static EventoModel dados() {
			
		EventoModel ev = new EventoModel();		
		
		ev.setNomeEvento("Proway Projetos Java");
		ev.setInscricoesEvento(0);
		
		return ev;
	}
	*/
	
	
	/**
	 * CRIA MODELO ETAPA
	//metodo de dados
	public static EtapaModel dados() {
			
		EtapaModel et = new EtapaModel();		
		
		et.setNumeroEtapa(1);
		et.setInicioEtapa("2021-03-12 08:00:00");
		et.setFinalEtapa("2021-03-12 12:00:00");
		et.setInicioCafeEtapa("2021-03-12 10:00:00");
		et.setFinalCafeEtapa("2021-03-12 10:30:00");
		et.setIdEvento(1);
		
		return et;
	}
	*/
	
	/**
	 * CRIA MODELO ETAPA
	//metodo de dados
	public static EtapaSalaModel dados() {
			
		EtapaSalaModel es = new EtapaSalaModel();		
		
		es.setIdEtapaSala(1);
		es.setIdEtapa(2);
		es.setIdSala(1);
		
		return es;
	}
	*/
	
	/**
	 * CRIA MODELO EtapaCafeModel
	//metodo de dados
	public static EtapaCafeModel dados() {
			
		EtapaCafeModel ec = new EtapaCafeModel();		
		
		ec.setIdEtapaCafe(1);
		ec.setIdEtapa(2);
		ec.setIdCafe(1);
		
		return ec;
	}
	*/
	
	/**
	 * CRIA MODELO PessoaEventoModel
	//metodo de dados
	public static PessoaEventoModel dados() {
			
		PessoaEventoModel pe = new PessoaEventoModel();		
		
		pe.setIdPessoaEvento(1);
		pe.setIdPessoa(2);
		pe.setIdEvento(1);
		
		return pe;
	}
	*/
}
