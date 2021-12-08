package Layout;


		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.*;
		public class GUI {
		public static void main(String args[]) {
		// Frame anlegen als Top-Level-Container
		JFrame frame = new JFrame("Hallo Welt");
		// Modell anlegen
		MyModel model = new MyModel();
		// View-Komponente anlegen...
		MyView view = new MyView(model);
		// ...und dem Fenster hinzufuegen
		frame.getContentPane().add(view, BorderLayout.CENTER);
		// Programm beenden wenn das Fenster geschlossen wird
		// (Controller)
		frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
		System.exit(0);
		}
		});
		// und alles darstellen
		frame.pack();
		frame.setVisible(true);
		}
		}
	