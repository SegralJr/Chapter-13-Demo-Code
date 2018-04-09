package graphics;

import java.awt.*;
import javax.swing.*;

public class Driver extends JFrame{ //parent GUI
	PaintOnPanel panel;
	public void makeFrame(){
		Container pane = getContentPane();
		pane.setBackground(new Color (20,250,20));
		panel = new PaintOnPanel();
		
		JLabel north = new JLabel("Look below:", SwingConstants.CENTER);
		pane.add(north, BorderLayout.NORTH);
		pane.add(panel,BorderLayout.CENTER);
		setLocation(300,300);
		setSize(800,500);
		setVisible (true);
		//pane.add(new PaintOnPanel());
		
	}
}
