/**
 * 
 */
package banque;

/**
 * @author moisesfil
 *
 */
public class Banque {
	private int  nbClient;
	private int numClient;
	private Client[] clients  = new Client[100];
	
	/**
	 * @return the nbClient
	 */
	public int getNbClient() {
		return nbClient;
	}
	
	public int getNumClient() {
		return numClient;
	}
	
	/**
	 * @return the clients
	 */
	public Client getClients(int numClient) {
		return clients[numClient];
	}
	
	public int ajouterClient(String nom , Date date ) {
		if (nbClient != clients.length) {
			clients[nbClient] = new Client(nom,date);
			nbClient ++;
		}
		return nbClient;
	}
	
	public void afficherBilanBanque() {
		System.out.println("La banque a  actuellement "+this.nbClient+" clients.");
		for(int i = 0; i < nbClient ; i++) {
			clients[i].afficherBilan();
		}
	}
	
	public String genererAutorisation(Carte carte, float somme) {
		if(!(carte.isDateValide())){
			return "Refus bancaire votre carte a expirée !";
		}
		else if(somme > 1000) {
			return "Refus bancaire la somme dépasse votre plafond limitée a  1000 euros !";
		}
		else if(!(carte.isDateValide()) && somme > 1000 ) {
			return "Refus bancaire votre carte a expirée et votre plafond est dépassée !";
		}
		else {
			return "ok";
		}
		
	}
	
}
