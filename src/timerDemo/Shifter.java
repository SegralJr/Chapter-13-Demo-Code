package timerDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shifter extends JFrame implements ActionListener {
	public void actionPerformed(ActionEvent e){
		if(timer == e.getSource()){
			if(shifter ==0 ){
				left.setText("Timer In Action!");
				right.setText("");
				shifter = ++shifter%3;
			}
			else{
				if(shifter ==1 ){
					left.setText("");
					centrum.setText("Timer In Action!");
					shifter = ++shifter%3;
				}
				else{
					right.setText("Timer In Action!");
					centrum.setText("");
					shifter = ++shifter%3;
				}	
			}
		}
		else{
			if(up==e.getSource()){
				timer.setDelay(timer.getDelay()+100);
				delay.setText(String.valueOf(timer.getDelay()));
			}
			else
				if(down == e.getSource()){
					timer.setDelay(Math.max(timer.getDelay()-100,0));
					delay.setText(String.valueOf(timer.getDelay()));
				}
				else
					if(start == e.getSource()){
						timer.start();
						delay.setText(String.valueOf(timer.getDelay()));
					}
					else
						timer.stop();
		}
	}
	Timer timer;
	JButton start = new JButton("Start");
	JButton stop = new JButton("Stop");
	JButton up = new JButton("Delay Up");
	JButton down = new JButton("Delay Down");
	JTextField left = new JTextField(10);
	JTextField centrum = new JTextField(10);
	JTextField right = new JTextField(10);
	JTextField delay= new JTextField(10);
	int shifter = 0;
	public void makeWindow(){
		Font font = new Font("Dialog", Font.BOLD, 15);
		setSize(450,250);
		setLocation(200,200);
		JLabel label = new JLabel("Current Delay:  ");
		label.setFont(font);
		JPanel center = new JPanel();
		center.setFont(font);
		center.add(left);
		delay.setFont(font);
		left.setFont(font);
		right.setFont(font);
		centrum.setFont(font);
		start.setFont(font);
		stop.setFont(font);
		up.setFont(font);
		down.setFont(font);
		
		center.add(centrum);
		center.add(right);
		center.add(label);
		center.add(delay);
		JPanel south = new JPanel();
		south.setFont(font);
		south.add(start);
		south.add(stop);
		south.add(up);
		south.add(down);
		start.addActionListener(this);
		stop.addActionListener(this);
		up.addActionListener(this);
		down.addActionListener(this);
		add(center,BorderLayout.CENTER);
		add(south,BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public Shifter(int delay){
		
		super("Shifting a text with control!");
		
		timer = new Timer(delay, this);
		makeWindow();
	}

}


