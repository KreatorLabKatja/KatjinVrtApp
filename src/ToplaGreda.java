/**
 * 
 */

/**
 * @author Katja Horvat
 *
 */
public class ToplaGreda extends Greda {
	
	//dodatne lastnosti tople grede
	private boolean odprta;
	private double temperatura;
	
	/**
	 * @param d
	 * @param s
	 * @param o
	 */
	public ToplaGreda(int d, int s, String o) {
		super(d, s, o);
		
		//inicializiramo dodatne lastnosti
		odprta = false;
		temperatura = 20.0;
		
		
	}

	
	//metoda za odpiranje tople grede
	//vhod:		//
	//izhod:	uspešnost odpiranja
	public boolean odpri() {
		//če je greda zaprta
		if(!odprta) {
			//jo odpre
			odprta = true;
			//javi, da jo je uspešno odprl
			System.out.println("Greda " + getOznaka() + " je zdaj odprta.");
			//vrne
			return true;
		}
		//sicer, javi, da je ne more odpreti, ker je že odprta
		else {
			//javi, da je greda že odprta od prej.
			System.out.println("Greda " + getOznaka() + " je že bila odprta.");
			//vrne
			return false;
		}
	}
	
	//metoda za zapiranje tople grede
		//vhod:		//
		//izhod:	uspešnost zapiranja
		public boolean zapri() {
			//če je greda odprta
			if(odprta) {
				//jo zapre
				odprta = false;
				//javi, da jo je uspešno zaprl
				System.out.println("Greda " + getOznaka() + " je zdaj zaprta.");
				//vrne
				return true;
			}
			//sicer, javi, da je ne more zapreti, ker je že zaprta
			else {
				//javi, da je greda že zaprta od prej.
				System.out.println("Greda " + getOznaka() + " je že bila zaprta.");
				//vrne
				return false;
			}
		}
}