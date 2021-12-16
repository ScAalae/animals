package Tierpackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet.ColorAttribute;

public class AddTier extends JFrame implements ActionListener{
	private ButtonGroup artgr = new ButtonGroup();
	private ButtonGroup salzgr = new ButtonGroup();
	private ButtonGroup dali = new ButtonGroup();
	private JRadioButton rHund, rKatze, rFisch, rSalzg5, rSalzk5;
	private JCheckBox rEntwurmen, rHauskatze;
	private JLabel nTier, bEingaben, bname, bgroesse, bfarbe, brasse,output1,output2,output3, output4, output5;
	private JTextField name, groesse, farbe, rasse;
	private JPanel mainPanel, southPanel, westPanel, centerPanel, extraPanel, extraPanel2, extraXpanel, dl;
	private JButton absenden, cDark, cLight;

	  public AddTier(String titel) {			
		    super(titel);
		    this.setSize(500, 300);
		    
		    mainPanel = new JPanel();
		    westPanel = new JPanel();
		    southPanel = new JPanel();
		    centerPanel = new JPanel();
		    extraPanel = new JPanel();
		    extraPanel2 = new JPanel();
		    extraXpanel = new JPanel();
		    dl = new JPanel();
		    
		    bEingaben = new JLabel("Bitte ausfüllen");	
//		    bEingaben.setForeground(Color.WHITE);
		    bEingaben.setForeground(new Color(50,50,50));
		    bname = new JLabel("Name");	
		    bname.setForeground(Color.WHITE);
		    bgroesse = new JLabel("Größe");
		    bgroesse.setForeground(Color.WHITE);
		    bfarbe = new JLabel("Farbe");
		    bfarbe.setForeground(Color.WHITE);
		    brasse = new JLabel("Rasse");
		    brasse.setForeground(Color.WHITE);
		    output1 = new JLabel("Output...");
		    output1.setForeground(Color.WHITE);
		    output2 = new JLabel("");
		    output2.setForeground(Color.WHITE);
		    output3 = new JLabel("");
		    output3.setForeground(Color.WHITE);
		    output4 = new JLabel("");
		    output4.setForeground(Color.WHITE);
		    output5 = new JLabel("");
		    output5.setForeground(Color.WHITE);
		    nTier = new JLabel("Neues Tier:");
		    nTier.setForeground(Color.WHITE);

		    name = new JTextField("Nemo");
		    groesse = new JTextField("0.0");
		    farbe = new JTextField("Orange/Weiß");
		    rasse = new JTextField("Clowns_Fisch");
		    
		    rHund = new JRadioButton("Hund");
		    rHund.setSelected(true);
		    rKatze = new JRadioButton("Katze");
		    rFisch = new JRadioButton("Fisch");
		    artgr.add(rHund);
		    artgr.add(rKatze);
		    artgr.add(rFisch);
		    
		    rSalzg5 = new JRadioButton("Salzgehalt > 5%");
		    rSalzk5 = new JRadioButton("Salzgehalt < 5%");
		    rSalzk5.setSelected(true);
		    salzgr.add(rSalzg5);
		    salzgr.add(rSalzk5);
		   
		    rEntwurmen = new JCheckBox("Entwurmen");
		    rHauskatze = new JCheckBox("Hauskatze");
		    cDark = new JButton("Dark");
		    cLight = new JButton("Light");
		    dali.add(cDark);
		    dali.add(cLight);

		    rHauskatze.setToolTipText("Zahm oder Satansbraten");
		    
		    name.setPreferredSize(new Dimension (100, 10));	
		    output1.setPreferredSize(new Dimension(175,20));
		    
		    absenden = new JButton("Absenden");
		    absenden.setBackground(Color.BLACK);
		    
		    mainPanel.setLayout(new BorderLayout());	
		    dl.setLayout(new GridLayout(1,2));	
		    centerPanel.setLayout(new FlowLayout());	
		    westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));		
		    extraXpanel.setLayout(new BoxLayout(extraXpanel, BoxLayout.Y_AXIS));
		  
		    mainPanel.setBackground(Color.DARK_GRAY);
		    centerPanel.setBackground(Color.BLACK);
		    extraPanel.setBackground(Color.BLACK);
		    extraPanel2.setBackground(Color.BLACK);
		    extraXpanel.setBackground(Color.BLACK);
		    westPanel.setBackground(Color.BLACK);
		    southPanel.setBackground(Color.BLACK);
		    
		    cDark.setBackground(Color.BLACK);
		    cLight.setBackground(Color.BLACK);
		    
		    rEntwurmen.setBackground(Color.BLACK);
		    rEntwurmen.setForeground(Color.WHITE);
		    rHauskatze.setBackground(Color.BLACK);
		    rHauskatze.setForeground(Color.WHITE);
		    
		    rSalzg5.setBackground(Color.BLACK);
		    rSalzg5.setForeground(Color.WHITE);
		    rSalzk5.setBackground(Color.BLACK);
		    rSalzk5.setForeground(Color.WHITE);
		    
		    rHund.setBackground(Color.BLACK);
		    rHund.setForeground(Color.WHITE);
		    rKatze.setBackground(Color.BLACK);
		    rKatze.setForeground(Color.WHITE);
		    rFisch.setBackground(Color.BLACK);
		    rFisch.setForeground(Color.WHITE);		    
		    
		    westPanel.add(bEingaben);
		    westPanel.add(bname);
		    westPanel.add(name);
		    westPanel.add(bgroesse);
		    westPanel.add(groesse);
		    westPanel.add(bfarbe);
		    westPanel.add(farbe);
		    westPanel.add(brasse);
		    westPanel.add(rasse);
		    dl.add(cDark);
		    dl.add(cLight);
		    southPanel.add(absenden);
		    centerPanel.add(rHund);
		    centerPanel.add(rKatze);
		    centerPanel.add(rFisch);
		    extraPanel.add(rEntwurmen);
		    extraPanel.add(rHauskatze);
		    extraPanel2.add(rSalzk5);
		    extraPanel2.add(rSalzg5);
		    extraXpanel.add(nTier);
		    extraXpanel.add(output1);
		    extraXpanel.add(output2);
		    extraXpanel.add(output3);
		    extraXpanel.add(output4);
		    extraXpanel.add(output5);
		    
		    absenden.addActionListener(this);	
		    cDark.addActionListener(this);	
		    cLight.addActionListener(this);	
		    
		    mainPanel.add(centerPanel, BorderLayout.CENTER);
		    centerPanel.add(extraPanel, BorderLayout.SOUTH);
		    centerPanel.add(extraPanel2, BorderLayout.SOUTH);
		    centerPanel.add(extraXpanel, BorderLayout.SOUTH);
		    mainPanel.add(westPanel, BorderLayout.WEST);
		    westPanel.add(dl, BorderLayout.SOUTH);
		    mainPanel.add(southPanel, BorderLayout.SOUTH);
		    

		    this.add(mainPanel);												//hauptPanel einfügen
		    this.setVisible(true);
	  }

		public void actionPerformed1(ActionEvent x) {
		    centerPanel.setBackground(Color.WHITE);
		}
		
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == absenden) {
		String xName = name.getText();
		float xGroesse = Float.parseFloat(groesse.getText());
		float xSalzgehalt = (float)0.0;
		String xFarbe = farbe.getText();
		String xRasse = rasse.getText();
		boolean fuettern = false;
		boolean entwurmt;
		boolean hauskatze;
		String kommandos[] = new String[5];
			if(rHund.isSelected()) {
			if(rEntwurmen.isSelected()) {
				entwurmt = true;
			}else {
				entwurmt = false;
			}
			String art = "Hund";
			Tier neuerHund = new Hund(art, xName, xFarbe, xGroesse, xRasse, fuettern, entwurmt, kommandos);
			Tierhandlung.addTier(neuerHund);
			output1.setText("Art: "+art);
			output2.setText("Name: "+ xName);
			output3.setText("Größe: "+xGroesse+"m");
			output4.setText("Farbe: "+ xFarbe);
			output5.setText("Rasse: "+xRasse);
		}
		if(rKatze.isSelected()) {
			if(rEntwurmen.isSelected()) {
				entwurmt = true;
			}else {
				entwurmt = false;
			}
			if(rHauskatze.isSelected()) {
				hauskatze = true;
			}else {
				hauskatze = false;
			}
			String art = "Katze";
			Tier neueKatze = new Katze(art, xName, xFarbe, xGroesse, xRasse, fuettern, entwurmt, hauskatze);
			Tierhandlung.addTier(neueKatze);
			output1.setText("Art: "+art);
			output2.setText("Name: "+ xName);
			output3.setText("Größe: "+xGroesse+"m");
			output4.setText("Farbe: "+ xFarbe);
			output5.setText("Rasse: "+xRasse);


		}
		if(rFisch.isSelected()) {
			if(rSalzg5.isSelected()) {
				xSalzgehalt = (float)5.0;
			} else if(rSalzk5.isSelected()) {
				xSalzgehalt = (float)1.0;
			}
			if(rEntwurmen.isSelected()) {
				entwurmt = true;
			}else {
				entwurmt = false;
			}
			if(rHauskatze.isSelected()) {
				hauskatze = true;
			}else {
				hauskatze = false;
			}
			String art = "Fisch";
			Tier neuerFisch = new Fisch(art, xName, xFarbe, xGroesse, xRasse, fuettern, xSalzgehalt);
			Tierhandlung.addTier(neuerFisch);
			output1.setText("Art: "+art);
			output2.setText("Name: "+ xName);
			output3.setText("Größe: "+xGroesse+"m");
			output4.setText("Farbe: "+ xFarbe);
			output5.setText("Rasse: "+xRasse);
		}
		}else if(e.getSource() == cLight) {
			mainPanel.setBackground(Color.WHITE);
		    centerPanel.setBackground(Color.WHITE);
		    extraPanel.setBackground(Color.WHITE);
		    extraPanel2.setBackground(Color.WHITE);
		    extraXpanel.setBackground(Color.WHITE);
		    westPanel.setBackground(Color.WHITE);
		    southPanel.setBackground(Color.WHITE);
		    cDark.setBackground(Color.WHITE);
		    cLight.setBackground(Color.WHITE);		    
		    rEntwurmen.setBackground(Color.WHITE);
		    rEntwurmen.setForeground(Color.BLACK);
		    rHauskatze.setBackground(Color.WHITE);
		    rHauskatze.setForeground(Color.BLACK);		    
		    rSalzg5.setBackground(Color.WHITE);
		    rSalzg5.setForeground(Color.BLACK);
		    rSalzk5.setBackground(Color.WHITE);
		    rSalzk5.setForeground(Color.BLACK);		    
		    rHund.setBackground(Color.WHITE);
		    rHund.setForeground(Color.BLACK);
		    rKatze.setBackground(Color.WHITE);
		    rKatze.setForeground(Color.BLACK);
		    rFisch.setBackground(Color.WHITE);
		    rFisch.setForeground(Color.BLACK);
		    bEingaben.setForeground(Color.BLACK);
		    bname.setForeground(Color.BLACK);
		    bgroesse.setForeground(Color.BLACK);
		    bfarbe.setForeground(Color.BLACK);
		    brasse.setForeground(Color.BLACK);
		    output1.setForeground(Color.BLACK);	
		    output2.setForeground(Color.BLACK);		
		    output3.setForeground(Color.BLACK);		
		    output4.setForeground(Color.BLACK);		 
		    output5.setForeground(Color.BLACK);
		    nTier.setForeground(Color.BLACK);
		} else if(e.getSource() == cDark) {
		    mainPanel.setBackground(Color.DARK_GRAY);
		    centerPanel.setBackground(Color.BLACK);
		    extraPanel.setBackground(Color.BLACK);
		    extraPanel2.setBackground(Color.BLACK);
		    extraXpanel.setBackground(Color.BLACK);
		    westPanel.setBackground(Color.BLACK);
		    southPanel.setBackground(Color.BLACK);		    
		    cDark.setBackground(Color.BLACK);
		    cLight.setBackground(Color.BLACK);		    
		    rEntwurmen.setBackground(Color.BLACK);
		    rEntwurmen.setForeground(Color.WHITE);
		    rHauskatze.setBackground(Color.BLACK);
		    rHauskatze.setForeground(Color.WHITE);		    
		    rSalzg5.setBackground(Color.BLACK);
		    rSalzg5.setForeground(Color.WHITE);
		    rSalzk5.setBackground(Color.BLACK);
		    rSalzk5.setForeground(Color.WHITE);		    
		    rHund.setBackground(Color.BLACK);
		    rHund.setForeground(Color.WHITE);
		    rKatze.setBackground(Color.BLACK);
		    rKatze.setForeground(Color.WHITE);
		    rFisch.setBackground(Color.BLACK);
		    rFisch.setForeground(Color.WHITE);		    
		    bEingaben.setForeground(Color.WHITE);
		    nTier.setForeground(Color.WHITE);
		    bname.setForeground(Color.WHITE);
		    bgroesse.setForeground(Color.WHITE);
		    bfarbe.setForeground(Color.WHITE);
		    brasse.setForeground(Color.WHITE);
		    output1.setForeground(Color.WHITE);
		    output2.setForeground(Color.WHITE);	
		    output3.setForeground(Color.WHITE);		
		    output4.setForeground(Color.WHITE);		 
		    output5.setForeground(Color.WHITE);
		}
		
		}

}
