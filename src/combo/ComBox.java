package combo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComBox extends JFrame implements ActionListener , ItemListener{
	static final long serialVersionUID = 0;
	//
	//data field components referenced in several methods
	//
	JTextField field = new JTextField(10);
	JTextArea area = new JTextArea("          Selections:          \n");
	JComboBox<String> box;
	JButton ok;
	
	//JLabel display = new JLabel("Selections:");
	int filter =0;
	String message = "";
	String selected="";
	public void itemStateChanged(ItemEvent e){
		/*if(++filter %2 == 1)
			return;
		selected = (String)  box.getSelectedItem();
		System.out.println(selected);
		message = area.getText() +"\n      " + selected;
		area.setText(message);
		 */    
	}
	  
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource() ==ok){
			  field.setText(selected);
		}
		else{
			selected = (String) box.getSelectedItem();
			message = area.getText() +"\n      " + selected;
			area.setText(message);   
		}
		
  }
  public void makeWindow(String[] args){
	
    setSize(660,400);
    setLocation(100,100);
    
    Container pane = getContentPane();
    pane.setLayout(new BorderLayout(10,10));
    //
    //panels for BorderLayout regions
    //
    JPanel west = new JPanel();
	JPanel center = new JPanel();
	JPanel east= new JPanel();
	JPanel south = new JPanel();
	//
    //manage TextArea on center panel
	//
    {area.setFont(new Font("Dialog", Font.BOLD, 18));
    area.setBackground(JColorChooser.showDialog(this,"Color the text area",null));
    area.setToolTipText("Text area collects all outdoor elements");
    center.setBorder(BorderFactory.createLineBorder(Color.RED,5));
    center.add(area);
    }
    //
    //manage combo box, east panel
    //
    {east.setBackground(JColorChooser.showDialog(this,"Color the combo panel ",null));
    east.setBorder(BorderFactory.createLineBorder(Color.BLUE,5));
    box = new JComboBox<String> (args);
    box.setBackground(Color.PINK);
    box.addItemListener(this);
    box.addActionListener(this);
    //box.setEditable(true);
    east.add(box);
    }
    
    //
    //manage button on south panel
    //
    {ok = new JButton("OK");
    ok.setToolTipText("Displays your selection");
    ok.addActionListener(this);
    south.add(ok);
    }
    //
    //manage TextField on west panel
    //
    {field.setBackground(new Color(180,220,0));
    field.setFont(new Font("Serif", Font.BOLD, 25));
    west.add(field, SwingConstants.CENTER );
    }
    //
    //load the panels to the frame
    //
    pane.add(west,BorderLayout.WEST);
    pane.add(south,BorderLayout.SOUTH);
    pane.add(center,BorderLayout.CENTER);
    pane.add(east,BorderLayout.EAST);
    
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }//end method mamkeWindow()
  
  public ComBox(String[] args){
    makeWindow(args);
  }
}
