/**
 * 
 */
package main;

import banque.Banque;
import banque.Carte;
import banque.Client;
import banque.Compte;
import banque.Date;
import banque.Terminal;

/**
 * @author moisesfil
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date dateCarte = new Date(10,02,2024);
		Date dateDuClient = new Date(17,9,2000);
		Date dateDeCarrefour = new Date(17,01,2004);
		Date dateDuJour = new Date();
		Date dateNonValide = new Date(8,02,2021);
		Banque banqueDeJean = new Banque();
		Banque banqueDeCarrefour = new Banque();
		banqueDeCarrefour.ajouterClient("Carrefour",dateDeCarrefour);
		banqueDeJean.ajouterClient("Jean",dateDuClient);
		Compte compteDeJean = new Compte();
		compteDeJean.depot(5000);
		compteDeJean.afficherSolde();
		banqueDeJean.getClients(0).afficherBilan();
		int [] codeCarte = {1,7,0,9};
		int [] codeNonValide = {1,2,3,4};
		Carte carteDeJean = new Carte(codeCarte,banqueDeJean,02,01,dateCarte);
		Terminal t1 = new Terminal(banqueDeCarrefour,01,01);
		t1.payer(100, carteDeJean, codeNonValide);
		t1.payer(100, carteDeJean, codeNonValide);
		t1.payer(100, carteDeJean, codeCarte);
		

		
		 
	}

}
