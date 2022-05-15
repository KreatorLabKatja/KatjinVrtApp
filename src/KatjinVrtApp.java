import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 
 */

/**
 * @author Katja Horvat
 *
 */
//Deklariramo javni razred
public class KatjinVrtApp {
	//Deklariramo lastnost za vnos iz konzole
	private static BufferedReader in;

	//Deklariamo javno statično metodo main
	//prejme:	seznam vhodnih parametrov
	//vrne:		/
	public static void main(String[] args) {
		
		//Inicializiramo objekt in 
		in = new BufferedReader(new InputStreamReader(System.in));
				
		//v konzolo izpišemo pozdrav
		System.out.println("Pozdravljeni na Katjinem vrtu!");
		
		//Ustvarimo objekt in ga deklariramo
		Greda prvaGreda = new Greda (250, 60, "A1");
		Greda drugaGreda = new Greda (250, 60, "A2");
		Greda tretjaGreda = new Greda (250, 60, "B1");
		ToplaGreda cetrtaGreda = new ToplaGreda (300, 200, "T1");
		StalnaGreda petaGreda = new StalnaGreda (500, 60, "S1", "razlicna zelisca", 25);
		
		//prekopamo prvo gredo
		System.out.println("Prekopavam gredo " + prvaGreda.getOznaka() + " in na kompost mecem " + prvaGreda.prekoplji() +".");
		
		//posadimo novo vrtnino na prvo gredo
		try{
			//Aplikacija vpraša uporabnika, kaj naj posadi in to zapiše v novo spremenljivko
			System.out.print("Kaj naj posadim? ");
			String nv = in.readLine();
			
			//uporabimo metodo posadi
			if(prvaGreda.posadi(nv)) {
				System.out.println("Na " + prvaGreda.getOznaka() + " smo posadili " + nv + ".");
				
			}
			else {
				System.out.println("Na " + prvaGreda.getOznaka() + " nismo mogli posaditi " + nv + ".");
			}
		}
		
		catch(Exception e){
			//napaka pri vnosu
			System.out.println("Napaka pri izbiri vrtnine " + e.toString());
		}
		
		//zalijemo prvo gredo
		try{
			//Aplikacija vpraša uporabnika, koliko vode naj zlije na gredo
			System.out.print("S koliko litri vode naj zalijem gredo? ");
			double nz = Double.parseDouble(in.readLine());
			
			//uporabimo metodo zalij
			System.out.println("Gredo " + prvaGreda.getOznaka() + " smo zalili z " + nz + " litri vode in je sedaj zalita " + prvaGreda.zalij(nz) + " ml/cm2.");
				
			
			
		}
		
		catch(Exception e){
			//napaka pri vnosu
			System.out.println("Napaka pri zalivanju " + e.toString());
		}
		
		//uporabnim metodo odpiranja tople grede
		try {
			for(int c =0; c<2; c++) {
				cetrtaGreda.odpri();
				Thread.sleep(2000);
				cetrtaGreda.zapri();
				Thread.sleep(2000);
			}
		} 
		
		catch(Exception e){
			//napaka pri vnosu
			System.out.println("Napaka pri odpiranju in zapiranju " + e.toString());
		}
		
		//izpišemo podatke o stalni gredi
		System.out.println("Na stalni gredi " + petaGreda.getOznaka() + " je posajeno " + petaGreda.getSteviloRastlin() + " " + petaGreda.getVrtnina() + ".");
	}

}
