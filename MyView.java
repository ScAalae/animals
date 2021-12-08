package Layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MyView extends JPanel implements Observer {
	private static String labelPrefix = "Number of clicks: ";
	private JLabel label;
	private MyModel model;
	public MyView(MyModel newModel) {
		super();
		model = newModel;
		// View als Observer des Modells registrieren
		model.addObserver(this);
		// Text-label
		label = new JLabel(labelPrefix + "0 ");
		// Button
		JButton button = new JButton("Click me!");
		
		// Controller fuer den Button anlegen
		button.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		// Modell aktualisieren (dadurch wird auch der View
		// neu gezeichnet).
		model.clicked();
		}
		});
		label.setLabelFor(button);
		// Ein Rahmen um den Inhalt
		setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
		// Layout (Gitter mit einer Spalte)
		setLayout(new GridLayout(0, 1));
		add(button);
		add(label);
}
	public void update (Observable o, Object arg) {
	int numClicks = model.getClicks();
	label.setText(labelPrefix + numClicks);
	}
}