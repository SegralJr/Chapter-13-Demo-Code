package graphics;

import javax.swing.*;
import java.awt.*;
public class Flags extends JFrame {
	  public void makeFlag(){
		     setSize(600,480);
		     setLocation(200,200);
		     setTitle("The National Flag of Ovalland");
		     Container pane = getContentPane();
		     JPanel left = new LeftPanel();
		     JPanel center = new CenterPanel();
		     JPanel right = new RightPanel();
		     pane.setLayout(new GridLayout(1,3));
		     pane.add(left);
		     pane.add(center);
		     pane.add(right);
		     setVisible(true);
		     setDefaultCloseOperation(EXIT_ON_CLOSE);
		  }
		  private class LeftPanel extends JPanel{
		     public void paintComponent(Graphics g){
		         super.paintComponent(g);
		         setBackground(Color.red);
		         g.setColor(Color.yellow);
		         g.fillOval(50,120,100,240);
		     }
		  }
		  private class CenterPanel extends JPanel{
		     public void paintComponent(Graphics g){
		         super.paintComponent(g);
		         setBackground(Color.white);
		         g.setColor(Color.blue);
		         g.fillOval(50,200,100,80);
		     }
		  }
		  private class RightPanel extends JPanel{
		     public void paintComponent(Graphics g){
		         super.paintComponent(g);
		         setBackground(Color.green);
		         g.setColor(Color.orange);
		         g.fillOval(50,120,100,240);
		     }
		  }


		  public Flags() {
		  }
		}
