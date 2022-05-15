/**
 * 
 */

/**
 * @author Katja Horvat
 *
 */
public class StalnaGreda extends Greda {

	//dodatne lastnosti stalne grede
	private int razmak; 	//v cm
	
	public StalnaGreda(int d, int s, String o, String v, int r) {
		super(d, s, o);
		razmak = r;
		try {
			prekoplji();
			posadi(v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//metoda, ki vrne število rastlin
	//vhod:		/
	//vrne: 	število rastlin an stalni gredi
	public int getSteviloRastlin() {
		//najprej izračuna število rastlin po dolžini
		double stRastlinVVrsti = Math.floor(getDolzina()/razmak);
		
		//potem izračuna število rastlin v širini
		double stVrst = Math.floor(getSirina()/razmak);
		
		//vrne zmnožek
		return new Double(stRastlinVVrsti*stVrst).intValue();
				
	}
	
	
}
