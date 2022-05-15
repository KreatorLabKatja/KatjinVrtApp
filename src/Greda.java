//Avtor: Katja Horvat

//deklariramo javni razred
public class Greda {
	//Deklariramo lastnosti
	private int dolzina; 			//v cm	
	private int sirina;				//v cm
	private String vrtnina;			
	private double zalitost;		//v ml/cm2 		
	private String oznaka;
	private boolean prekopana;
	
	//deklariramo konstruktor (metoda, ki bo ustavirla nov objekt)
	//Ustvarimo gredo
	//vrača: nov objekt razreda Greda
	/**
	 * @param d > dolžina
	 * @param s > širina
	 * @param o > oznaka
	 */
	public Greda(int d, int s, String o) {
		//inicializiram lastnosti
		dolzina = d;
		sirina = s;
		vrtnina = "plevel";
		zalitost = 0.1;
		oznaka = o;
		prekopana = false; 
		
		//Izpišemo dogodek
		System.out.println("Ustvarjam gredo, ki je dolga " + d + " cm in siroka " + s + " cm ter ima oznako " + o + ".");
		
	}
	
	//metoda, ki prekoplje gredo
	//vrne: prejšnjo vrtnino
	public String prekoplji() throws Exception {
		//če je greda že prekopana, vržemo izjemo
		if(prekopana) {
			throw new Exception("Greda " + getOznaka() + " je že prekopana!");
		}
		
		//spremeni prekopana v true
		prekopana = true;
		
		//zapomni si prejšnjo vrtnino
		String prejsnjaVrtnina = vrtnina;
		
		//spremeni vrtnino v prazno
		vrtnina = "";
		
		//vrne prejšnjo vrtnino
		return prejsnjaVrtnina;
	}

	/**
	 * @return the oznaka
	 */
	public String getOznaka() {
		return oznaka;
	}
	
	//metoda, ki posadi vrtnino
	//vhod: kaj naj posadim (nova vrtnina)
	//izhod: ali je bilo uspešno posajeno
	public boolean posadi(String novaVrtnina) throws Exception {
		//preveri ali je greda prekopana
		if(prekopana) {
			//posadi novo vrtnino
			vrtnina = novaVrtnina;
			
			//spremeni prekopana v false
			prekopana = false;
			
			//vrne, da je bilo uspešno posajeno
			return true;
		}
		
		//če ni prekopana, vrne, da ne more posaditi nove vrtnine
		else {
			throw new Exception("Greda " + getOznaka() + " ni prekopana!");
		}
		
		
	}
	
	//metoda, ki zalije gredo
	//vhodi:	koliko vode smo zlili na gredo v litrih 
	//izhodi: 	stopnjo zalitosti
	public double zalij(double kolicinaVode) {
		//izračunamo površino grede
		int povrsina = dolzina * sirina; 
		
		//za koliko se je povečala zalitost na cm2
		double novaZalitost = kolicinaVode/povrsina * 1000;
		
		//prištejemo novo zalitost k stari zalitosti
		zalitost = zalitost + novaZalitost;
		
		//vrne skupno zalitost
		return zalitost;
	}

	/**
	 * @return the dolzina
	 */
	public int getDolzina() {
		return dolzina;
	}

	/**
	 * @return the sirina
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * @return the vrtnina
	 */
	public String getVrtnina() {
		return vrtnina;
	}
	
}