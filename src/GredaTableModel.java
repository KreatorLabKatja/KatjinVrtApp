import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

/**
 * 
 */

/**
 * @author Katja Horvat
 *
 */
public class GredaTableModel extends DefaultTableModel {
	//Deklariramo lastnosti
	private ArrayList<Greda> grede;
	/**
	 * 
	 */
	public GredaTableModel() {
		super();
		
		//inicializiramo lastnosti
		grede = new ArrayList<Greda>();
				
		//dodamo stolpce
		addColumn("Oznaka");
		addColumn("Dolžina");
		addColumn("Širina");
		addColumn("Vrtnina");
	}

	//Metoda, ki doda pivsko steklenico v model tabele
	public void addGreda(Greda g){
			
		//Dodamo objekt v argumentu na seznam
		grede.add(g);
			
		//Ustvarimo seznam objektoc za vrstico v tabeli
		Object[] vrstica = new Object[]{g.getOznaka(), g.getDolzina(), g.getSirina(), g.getVrtnina()};
			
			
		//Dodamo vrstico v tabelo
		addRow(vrstica);
		}
}
