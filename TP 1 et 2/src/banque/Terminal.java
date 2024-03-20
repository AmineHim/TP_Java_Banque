/**
 * 
 */
package banque;

/**
 * @author moisesfil
 *
 */
public class Terminal {
	private Banque banque;
	private int numclient;
	private int numCompte;
	/**
	 * @param banque
	 * @param numclient
	 * @param numCompte
	 */
	public Terminal(Banque banque, int numclient, int numCompte) {
		super();
		this.banque = banque;
		this.numclient = numclient;
		this.numCompte = numCompte;
	}
	
	
	
	/**
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}


	/**
	 * @return the numclient
	 */
	public int getNumclient() {
		return numclient;
	}

	/**
	 * @return the numCompte
	 */
	public int getNumCompte() {
		return numCompte;
	}
	
	public int payer(float somme,Carte carte,int [] code) {
		if(carte.codeValide(code)) {
			System.out.println("Code ok");

			if(carte.getBanque().genererAutorisation(carte, somme)=="ok") {
				System.out.println("Autorisation ok");

				carte.payer(this.getBanque(), this.getNumclient(), this.getNumCompte(), somme);
				System.out.println("Payement accépté");
				return 1;
			}
		}
		return 0;
	}
	
	
	
	
	

}
