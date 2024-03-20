/**
 * 
 */
package banque;

/**
 * @author moisesfil
 *
 */
public class Client {
	private String nom;
	private Date date;
	private int nbComptes=1;
	private Compte [] comptes = new Compte[100];
	
	/**
	 * @param nom
	 * @param date
	 */
	public Client(String nom, Date date) {
		super();
		this.nom = nom;
		this.date = date;
		this.comptes[0] = new Compte();
		
	}

	public String getNom() {
		return nom;
	}
	
	public Date getDate() {
		return date;
	}
	
	Compte getCompte(int numero) {
		return comptes[numero];
	}
	

	public void afficherBilan() {
		for (int i=0; i<nbComptes;i++) {
			   System.out.println(getCompte(i).getSolde());
			}
	}

	public float soldeTotal() {
		float solde_compte;
		float solde_totale = 0;
		int i = 0;
		while ( i < nbComptes) {
			solde_compte = comptes[i].getSolde();
			solde_totale = solde_totale + solde_compte;
			i++;
		}
		return solde_totale;
	}

	public void afficherSolde() {
		System.out.println("Le solde totale du client est de : "+soldeTotal());
	}

	public int ajouterCompte () {
		if ( nbComptes != comptes.length) {
			comptes[nbComptes] = new Compte();
			nbComptes++;
		}
		return nbComptes;
		
	}

}
