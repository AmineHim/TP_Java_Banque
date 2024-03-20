/**
 * 
 */
package banque;

/**
 * @author moisesfil
 *
 */
public class Compte {
	private float solde = 0;
	
	public void depot(float valeur) {
		solde = solde + valeur;
		System.out.println("Le dépot est de "+valeur);

		
	}
	
	public void retrait(float valeur) {
		solde = solde - valeur;
		System.out.println("Le retrait est de "+valeur);

	}
	
	public float getSolde() {
		return solde;
	}
	
	public void afficherSolde() {
		System.out.println("Le solde est de :"+getSolde());
	}
	
	public void virer(float valeur, Compte destinataire) {
		retrait(valeur);
		destinataire.depot(valeur);
		System.out.println("Virement de "+valeur+" à "+destinataire);

	}
}
