/**
 * 
 */
package banque;

/**
 * @author moisesfil
 *
 */
public class Carte {

	private int[] codeCarte = new int[4];
	private Banque banque;
	private int numClient;
	private int numCompte;
	private Date dateValide;
	private int compteur = 3;
	
	
	
	

	/**
	 * @param codeCarte
	 * @param banque
	 * @param numClient
	 * @param numCompte
	 * @param dateValide
	 */
	
	public Carte(int[] codeCarte, Banque banque, int numClient, int numCompte, Date dateValide) {
		super();
		this.codeCarte = codeCarte;
		this.banque = banque;
		this.numClient = numClient;
		this.numCompte = numCompte;
		this.dateValide = dateValide;
	}

	/**
	 * @return the codeCarte
	 */
	public int[] getCodeCarte() {
		return codeCarte;
	}

	/**
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * @return the numClient
	 */
	public int getNumClient() {
		return numClient;
	}

	/**
	 * @return the numCompte
	 */
	public int getNumCompte() {
		return numCompte;
	}
	
	/**
	 * @return the dateValide
	 */
	public Date getDateValide() {	
		return dateValide;
	}

	
	public boolean codeValide(int[] code) {
		if(compteur == 0) {
			System.out.println("La carte a était bloquée !");
			return false;
		}
		else {
			for (int i = 0; i < code.length; i++) {
				if (code[i] != codeCarte[i]) {
					this.compteur--;
					System.out.println("Attention : Votre code est faux, il vous restes "+compteur+" tentative(s) avant le blocage de votre carte !");
					return false;
					}
				}
			return true;
			}
		}
	
	void payer(Banque b, int numClient,int numCompte,float montant) {
		b.getClients(numClient).getCompte(numCompte).virer(montant, getBanque().getClients(getNumClient()).getCompte(getNumCompte()));
	}
	
	public boolean isDateValide() {
		if(dateValide.posterieurA(getDateValide())) {
			return false;
		}
		else {
			return true;
		}
	}
}
