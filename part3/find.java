
import java.io.*;  
import java.util.Scanner; 
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 

 public  class  find  {
	 idseeker anidseeker = new idseeker();

	public  void findClient() {
	JFrame frame3 = new JFrame("find window");
	frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	//JButton
	JButton button = new JButton("Search");
	
	//initial texts
	JLabel textLabel2 = new JLabel("type ID you are looking for:");
	JLabel textLabel3 = new JLabel("****************FINDER*****************");
	
	//textfield
	JTextField textField = new JTextField( 20);
	
	//textLabel2.setLabelFor(textField);
	
	//textLabel2.setPreferredSize(new Dimension(300, 100));
	frame3.getContentPane().add(textLabel2, BorderLayout.CENTER);
	
	//action listener
	//button.addActionListener(
	//public void actionPerformed(ActionEvent e){});
	
	button.addActionListener(new ActionListener(){
		 
		@Override
		 public void actionPerformed(ActionEvent e){
			 
			 
			 
			 System.out.println(anidseeker.client(textField.getText()));
			 
			 JLabel IDfound = new JLabel(anidseeker.client(textField.getText()), SwingConstants.CENTER);
			IDfound.setPreferredSize(new Dimension(300, 100));
			frame3.getContentPane().add(IDfound, BorderLayout.SOUTH);
			 //report areport = new report();
			 //areport.fullReport();
			  }
	 });
	
	frame3.add(textField, BorderLayout.EAST);
	frame3.add(textLabel2, BorderLayout.WEST);
	frame3.add(textLabel3, BorderLayout.NORTH);
	
	frame3.add(button, BorderLayout.SOUTH);
	frame3.setLocationRelativeTo(null);
	frame3.pack();
	frame3.setVisible(true);
	}
	
 

 }