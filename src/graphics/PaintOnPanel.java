package graphics;

import java.awt.*;
import javax.swing.*;

public class PaintOnPanel extends JPanel{
    
	protected void paintComponent(Graphics g){
		setBackground(Color.yellow);
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawRect(30,30,400,250);
		
		g.drawLine(30,280,430,30);
		
		g.setColor(Color.blue);
		g.drawOval(30,30,400,250);
		
		g.fillRect(100,70,40,140);
		
		g.setColor(Color.magenta);
		g.fillOval(230,155, 180,100);
		
		g.setColor(Color.black);
		g.drawRect(230,155,180,100);
		g.drawOval(230,155,180,100);
		
		g.setFont(new Font("SansSeriff",Font.BOLD+Font.ITALIC,21));
		g.drawString("Rectangle",150,70);
		
		g.setFont(new Font("SansSeriff", Font.ITALIC,40));
		g.drawString("OVAL",270,220);
		
		int [] xCoords = {30,60,90,120,150,180,210,240,270,300};
		int [] yCoords = {290, 330,320,330,380,300,370,330,360,290};
		g.setColor(Color.magenta);
		g.drawPolygon(xCoords,yCoords,xCoords.length);
		
		g.setColor(Color.blue);		
		g.fillPolygon(xCoords,yCoords,xCoords.length);
		
	    int [] y = {490, 530,520,530,580,500,570,530,560,590};
	    g.setColor(Color.red);
		g.drawPolyline(y,xCoords,xCoords.length);
		
		g.setColor(Color.black);
		g.drawOval(210,40,140,100);
		
		g.setColor(Color.magenta);
		g.drawArc(210,40,140,100,90,90 );
		
		g.fillArc(210,40,140,100,200,100);
		
	}


}
