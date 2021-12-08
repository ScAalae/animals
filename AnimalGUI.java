package Layout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AnimalGUI  extends JFrame implements ActionListener {
 
 private JFrame  eingabeMaske ;
 private JTextField artF, nameF, grösseF, gewichtF, gebDatumF;
 private JPanel hauptPanel, northPanel, southPanel, westPanel, eastPanel, centerPanel;
 private JButton knopf1, knopf2;
 private JRadioButton rSatt;
 
	//Konstruktor
	public AnimalGUI() {
	super("Tier");
	setLayout(new BorderLayout());
	this.setSize(700, 700);
	hauptPanel = new JPanel(); //neues Panel wird erzeugt
	northPanel = new JPanel();
	southPanel = new JPanel();
	westPanel = new JPanel();
	eastPanel = new JPanel();
	centerPanel = new JPanel();
	 
	
	artF = new JTextField("ART");
	nameF = new JTextField("Name");
	grösseF = new JTextField("Grösse");
	gewichtF = new JTextField("Gewicht");
	gebDatumF = new JTextField("Geburtsdatum");
	
	knopf1 = new JButton("Neu Tier erstellen");
	knopf2 = new JButton("Eingaben löschen");
	
	
	
	
	
	

	hauptPanel.add(northPanel, BorderLayout.NORTH);
//	hauptPanel.add(southPanel, BorderLayout.SOUTH);
//	hauptPanel.add(eastPanel, BorderLayout.EAST);
//	hauptPanel.add(westPanel, BorderLayout.WEST);
//	hauptPanel.add(centerPanel, BorderLayout.CENTER);
//	hauptPanel.setLayout(new BoxLayout(hauptPanel, BoxLayout.Y_AXIS ));
	this.add(hauptPanel);
	this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	};

 public static void  main(String arg[]) {
	new AnimalGUI() ; 
 }
}
