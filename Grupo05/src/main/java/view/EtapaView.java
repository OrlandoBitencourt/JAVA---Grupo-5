package main.java.view;

/**
* Classe EtapaView 
* 
* Consultar dados da EtapaView;
*
* @author  Gabriela, Orlando, Rudolfo
* @version 1.0
* @since 2021-03-12
*/

public class EtapaView {
	public void consultarEtapa(int numeroEtapa, String inicioEtapa, String finalEtapa, String inicioCafeEtapa, String finalCafeEtapa, int idEvento) {
		System.out.println("Numero Etapa: "+numeroEtapa);
		System.out.println("Inicio Etapa: "+inicioEtapa);
		System.out.println("Final Etapa: "+finalEtapa);
		System.out.println("Inicio Cafe: "+inicioCafeEtapa);
		System.out.println("Final Cafe: "+finalCafeEtapa);
		System.out.println("id Evento: "+idEvento);
	}
}

