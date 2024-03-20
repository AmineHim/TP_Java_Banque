/**
 * 
 */
package banque;
import java.util.Calendar;
/**
 * @author moisesfil
 *
 */
public class Date {
	
	private int jour,mois,an,heure,minute,seconde;

	/**
	 * @param jour
	 * @param mois
	 * @param an
	 */
	public Date(int jour, int mois, int an) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.an = an;
		heure = 0;
		minute = 0;
		seconde = 0;
	}

	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}

	/**
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		this.jour = jour;
	}

	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}

	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		this.mois = mois;
	}

	/**
	 * @return the an
	 */
	public int getAn() {
		return an;
	}

	/**
	 * @param an the an to set
	 */
	public void setAn(int an) {
		this.an = an;
	}

	/**
	 * @return the heure
	 */
	public int getHeure() {
		return heure;
	}

	/**
	 * @param heure the heure to set
	 */
	public void setHeure(int heure) {
		this.heure = heure;
	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * @return the seconde
	 */
	public int getSeconde() {
		return seconde;
	}

	/**
	 * @param seconde the seconde to set
	 */
	public void setSeconde(int seconde) {
		this.seconde = seconde;
	}

	@Override
	public String toString() {
		return "["+heure+":"+minute+":"+seconde+" "+jour+"/"+mois+"/"+an+"]";
	}
	
	public Date()
	{
		Calendar now = Calendar.getInstance();
		an = now.get(Calendar.YEAR);
		mois = 1+now.get(Calendar.MONTH);
		jour = now.get(Calendar.DAY_OF_MONTH);
		heure = now.get(Calendar.HOUR);
		minute = now.get(Calendar.MINUTE);
		seconde = now.get(Calendar.SECOND);
		
	}
	
	public boolean posterieurA(Date date) {
		if(date.getAn() < this.an) {
			return true;
		}
		else if(date.getMois() < this.mois) {

			return true;
		}
		else if(date.getJour() < this.jour) {

			return true;
		}
		else{
			return false;
		}
	}
}
