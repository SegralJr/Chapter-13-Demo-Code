package lists;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ListDemo extends JFrame implements ActionListener, ListSelectionListener{
	
	  private JList<String> list;
	  private String[] allSelected;
	  private int counter = 0;
	  JButton accept;
	  int [] index;
	  public void valueChanged(ListSelectionEvent event){
		  
		  
		  if(counter%2==1) {
			  index[counter] = list.getSelectedIndex();
			  
			  String selected = list.getSelectedValue();
			  System.out.println(selected);
		  	  System.out.println(list.getSelectedIndex());
		  	allSelected[list.getSelectedIndex()] = selected;
	  	  }
		  
		  counter++;
	  }
	  public void actionPerformed(ActionEvent e){
	    if(e.getSource() == accept) {
	    
	    String message = "Your selection(s): \n";
	    for(int j = 0; j < index.length; j++){
	          message  = message+"\n"+ allSelected[index[j]] +" at position "+index[j];
	    }
	    JOptionPane.showMessageDialog(null, message," List Result",
	                                              JOptionPane.INFORMATION_MESSAGE);
	  }
	  }
	  public ListDemo(String[] wordList){
	      super("Select the Field!");
	      list = new JList<String>(wordList);
	      index = new int[wordList.length];
	      for(int j = 0; j < index.length; j++)
	    	  index[j] = -1;
	      allSelected = new String[wordList.length];
	     list.setFont(new Font("Dialog", Font.BOLD, 20));
	     Container pane = getContentPane();
	     JPanel north = new JPanel();
	     JLabel label = new JLabel("MY BEST HORSES");
	     north.add(label);
	     JPanel listPanel = new JPanel();
	     listPanel.setBackground(Color.yellow);
	     listPanel.setBorder(BorderFactory.createTitledBorder("Choose Your Favorite!"));
	     JPanel buttonPanel = new JPanel();
	     buttonPanel.setBackground(Color.pink);
	     accept = new JButton("Accept");
	     accept.setBackground(Color.red);
	     buttonPanel.add(accept);
	     accept.addActionListener(this);
	     
	     listPanel.add(new JScrollPane(list));
	     list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	     pane.add(listPanel, BorderLayout.CENTER);
	     pane.add(buttonPanel, BorderLayout.SOUTH);
	     pane.add(north,BorderLayout.NORTH);
	     setSize(500,450);
	     setLocation(300,200);
	     setVisible(true);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	     list.addListSelectionListener(this);
	  }
	  public ListDemo(int n){
		  super();
		     Container pane = getContentPane();
		     JPanel listPanel = new JPanel();
		     String[] menu = {"Bill","Geri", "Greg",
		    		 "Jean", "Kirk","Phillip","Susan"};
		     JFrame frame1 = new JFrame();
		     JFrame frame2 = new JFrame();
		     JFrame[] menuq ={frame1,frame2};
		     list = new JList(menuq);
		     listPanel.add(list);//new JScrollPane(list));
		     //list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		     pane.add(listPanel, BorderLayout.CENTER);
		     //setSize(400,300);
		     setVisible(true);
		     setDefaultCloseOperation(EXIT_ON_CLOSE);
		     //list.addListSelectionListener(this);
		  }
	  

}
