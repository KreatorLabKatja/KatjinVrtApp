import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * 
 */

/**
 * @author Katja Horvat
 *
 */
//Deklariramo javni razred
public class KatjinVrtApp extends JFrame implements ActionListener{
	

	//deklariramo lastnosti za uporabniški vmesnik
	private JPanel povrsina;
	
	private JLabel besediloDolzina;
	private JTextField vnosnoPoljeDolzina;
	
	private JLabel besediloSirina;
	private JTextField vnosnoPoljeSirina;
	
	private JLabel besediloOznaka;
	private JTextField vnosnoPoljeOznaka;
	
	private JButton gumbDodaj;
	private GredaTableModel modelTabele;
	private JTable tabela;
	
	public KatjinVrtApp(String title) throws HeadlessException {
		super(title);
		
		//inicialitiramo lastnosti objekta
		povrsina = new JPanel();
				
		besediloDolzina = new JLabel("Dolzina");
		vnosnoPoljeDolzina = new JTextField(32);
		
		besediloSirina = new JLabel("Sirina");
		vnosnoPoljeSirina = new JTextField(32);
		
		besediloOznaka = new JLabel("Oznaka");
		vnosnoPoljeOznaka = new JTextField(32);
		
		gumbDodaj = new JButton("Dodaj!");
		modelTabele = new GredaTableModel();
		tabela = new JTable(modelTabele);
		
		//besedilo dodamo na površino
		povrsina.add(besediloOznaka);
		povrsina.add(vnosnoPoljeOznaka);
		povrsina.add(besediloDolzina);
		povrsina.add(vnosnoPoljeDolzina);
		povrsina.add(besediloSirina);
		povrsina.add(vnosnoPoljeSirina);
		povrsina.add(gumbDodaj);
		povrsina.add(tabela);
		
		//gumbu dodamo poslušalca dogodkov
		//kot vhodni podatek mu dodamo samega sebe
		gumbDodaj.addActionListener(this);
		
		//površino dodamo v okno
		add(povrsina);
				
		//prikažemo okno - kličemo metodo nadrazreda
		setVisible(true);
				
		//nastavimo obnašanje gumba za zapisanje - naj konča aplikacijo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//nastavimo privzeto velikost okna
		setSize(800, 600);
	}
	
	//Deklariamo javno statično metodo main
	//prejme:	seznam vhodnih parametrov
	//vrne:		/
	public static void main(String[] args) {
		//ustvarimo objekt (lokalno spremenljivko)
		KatjinVrtApp katjinVrt = new KatjinVrtApp("Katjin vrt");	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Gumb je bil pritisnjen!");
	
		//dodamo nov zapis v tabelo
		//
		modelTabele.addGreda(new Greda(Integer.parseInt(vnosnoPoljeDolzina.getText()), Integer.parseInt(vnosnoPoljeSirina.getText()), vnosnoPoljeOznaka.getText()));
	}

}
