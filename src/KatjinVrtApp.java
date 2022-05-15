import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

	//Deklariramo zasebno statično lestnost seznam gred
	private static ArrayList<Greda> grede;
		
	//Deklariamo javno statično metodo main
	//prejme:	seznam vhodnih parametrov
	//vrne:		/
	public static void main(String[] args) {
		
		//Inicializiramo objekt in 
		in = new BufferedReader(new InputStreamReader(System.in));

		//Inicializiramo seznam steklenic
		grede = new ArrayList<Greda>();
	
		//v konzolo izpišemo pozdrav
		System.out.println("Pozdravljeni na Katjinem vrtu!");
		
		//Aplikacija vpraša uporabnika, koliko gred ima vrt in inicializira novo spremenjljivko
		int stGred = 0;
		
		try {
			System.out.print("Koliko gred ima tvoj vrt? ");
			stGred = Integer.parseInt(in.readLine());
		} 
		
		catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} 
		
		
		for(int c = 0; c < stGred; c++) {
			System.out.println("Vnos " + (c+1) + ". grede:");
			
			//preberemo dolžino, širino in oznako
			try {
				System.out.print("Oznaka: ");
				String o = in.readLine();
				
				System.out.print("Dolzina (v cm): ");
				int d = Integer.parseInt(in.readLine());
				
				System.out.print("Sirina (v cm): ");
				int s = Integer.parseInt(in.readLine());
				
				//dodamo nov objekt v seznam
				grede.add(new Greda(d, s, o));
			} 
			
			catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} 
			
			
		}
		
		
		//Ustvarimo objekt in ga deklariramo
		Greda prvaGreda = new Greda (250, 60, "A1");
		Greda drugaGreda = new Greda (250, 60, "A2");
		Greda tretjaGreda = new Greda (250, 60, "B1");
		ToplaGreda cetrtaGreda = new ToplaGreda (300, 200, "T1");
		StalnaGreda petaGreda = new StalnaGreda (500, 60, "S1", "razlicna zelisca", 25);
		
		//prekopamo prvo gredo
		try {
			System.out.println("Prekopavam gredo " + prvaGreda.getOznaka() + " in na kompost mecem " + prvaGreda.prekoplji() +".");
		} 
		
		catch (Exception e1) {
			System.out.println("Napaka pri prekopavanju: " +  e1.getMessage());
		}
		
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
			System.out.println("Napaka pri sajenju vrtnine " + e.toString());
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
