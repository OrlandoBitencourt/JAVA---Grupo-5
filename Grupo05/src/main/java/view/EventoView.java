package main.java.view;

/**
* Classe EventoView 
* 
* Consultar dados da EventoView;
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

public class EventoView {
	public void consultarEvento(String nomeEvento, int inscricoesEvento) {
		System.out.println("Evento: "+nomeEvento);
		System.out.println("Inscritos: "+inscricoesEvento);
	}
}
