package main.java.controller;

import main.java.model.PessoaModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Repositorio {
	
	//Objetos
	EntityManagerFactory emf;
	EntityManager em;

	//Construtor
	public Repositorio() {
		emf = Persistence.createEntityManagerFactory("grupo05");
		em = emf.createEntityManager();
	}
	
	//Cadastrar
	public void cadastrar(PessoaModel p) {
		
		//cadastrar cliente
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		emf.close();
		
	}
}
