package menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu_Demo extends JFrame implements ActionListener{

	  private JMenu file;
	  private JMenu edit;
	  private JMenu view;
	  private JPanel west;
	  private JPanel east;
	  private JLabel message;
	  private JTextField text;

	  public void actionPerformed(ActionEvent ee){
		  String outp ="";
		  String selection = ee.getActionCommand();
		  
			  if("Exit".equals(selection))
				  System.exit(0);
			  outp = outp+"  You selected "+selection;
			  message.setText(outp);
			  text.setText(selection);
		  
		  
	  }

	  public void buildFrame(){

	     west = new JPanel();
	     east = new JPanel();
	     message = new JLabel("Menu Demo!");
	     JPanel labelPanel = new JPanel();
	     labelPanel.setBackground(Color.white);
	     west.setBackground(Color.GREEN);
	     east.setBackground(Color.YELLOW);
	     labelPanel.setBorder(BorderFactory.createTitledBorder("Message"));
	     Container pane = getContentPane();
	     pane.setLayout(new BorderLayout(10,10));
	     pane.setBackground(Color.GRAY);
	     west.setPreferredSize(new Dimension(200,200));
	     west.add(new JLabel());
	     text =new JTextField(15);
	     pane.add(text, BorderLayout.CENTER);
	     //west.add(text);
	     labelPanel.add(message);
	     east.add(labelPanel);
	     east.setPreferredSize(new Dimension(200,200));
	     pane.add(west, BorderLayout.WEST);
	     pane.add(east, BorderLayout.EAST);
	     setSize(500,250);
	     setLocation(400,400);
	     //setVisible(true);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	     setVisible(true);
	  }

	  public void makeMenu(String[] items, JMenu menu){
		  menu.addSeparator();
	    JMenuItem item;
	    for(int k = 0; k<items.length;k++){
	    	menu.addSeparator();
	       item = new JMenuItem(items[k]);
	       item.addActionListener(this);
	       menu.add(item);
	    }
	    
	    menu.addSeparator();
	    item = new JMenuItem("Exit");
	    item.addActionListener(this);
	    item.setBackground(Color.PINK);
	    menu.add(item);

	  }

	  public Menu_Demo(String[] fileItems, String[] editItems, String[] viewItems) {
	    super("Look at my menus!");
	    //make the menus
	    file = new JMenu("File");
	    makeMenu(fileItems, file);
	    edit = new JMenu("Edit");
	    makeMenu(editItems, edit);
	    view = new JMenu("View");
	    makeMenu(viewItems,view);
	    
	    //build the menu bar
	    JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
	    menuBar.add(file);
	    menuBar.add(edit);
	    menuBar.add(view);
	    buildFrame();
	  }
}
