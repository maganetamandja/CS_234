import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.io.*;  
import java.util.Scanner; 
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 

 public  class  newclient  {
	 
	 public  void findClient() {
	 
	 try  {
		
	 FileWriter writer = new FileWriter("test2.txt", true);
	 idseeker anidseeker = new idseeker();
	 
	

	
	JFrame frame4 = new JFrame("add patient window");
	frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame4.setLayout(new BoxLayout(frame4.getContentPane(), BoxLayout.PAGE_AXIS));
	//LayoutManager layout = new BoxLayout(frame4, BoxLayout.PAGE_AXIS);
	//frame4.setLayout(layout);
	
	//JButton
	JButton button = new JButton("create");
	
	//initial texts
	//JLabel textLabel2 = new JLabel("type ID you are looking for:");
	JLabel title = new JLabel("****************CREATOR*****************");
	
	//textfield

	//textfield
	JLabel textLabelID = new JLabel("type ID");
	JTextField nameFieldID = new JTextField( 20);
	 
	
	//textfield
	JLabel textLabelName = new JLabel("type Name");
	JTextField nameFieldName = new JTextField( 20);
	
	
	
	//textfield
	JLabel textLabelGender = new JLabel("type gender");
	JTextField nameFieldGender = new JTextField( 20);
	
	
	
	//textfield
	JLabel textLabelDOB = new JLabel("type date of birth");
	JTextField nameFieldDOB = new JTextField( 20);
	
	
	
	
	
	//textfield
	JLabel textLabelOccupation = new JLabel("type occupation");
	JTextField nameFieldOccupation = new JTextField( 20);
	
	
	
	//textfield
	JLabel textLabelPremium = new JLabel("type premium");
	JTextField nameFieldPremium = new JTextField( 20);
	
	
	//textfield
	JLabel textLabelDeductible = new JLabel("type deductible");
	JTextField nameFieldDeductible = new JTextField( 20);
	
	
	
	//textLabel2.setLabelFor(textField);
	
	//textLabel2.setPreferredSize(new Dimension(300, 100));
	//frame3.getContentPane().add(textLabel2, BorderLayout.CENTER);
	
	//action listener
	//button.addActionListener(
	//public void actionPerformed(ActionEvent e){});
	
	button.addActionListener(new ActionListener(){
		 
		@Override
		 public void actionPerformed(ActionEvent e){
			 System.out.print("clicked");
			 frame4.dispose();
			 
		try  {
			 System.out.print("inside try");
			writer.write(nameFieldID.getText());
		} catch (IOException d) {
      System.out.println(d.getMessage());
    }
	    //separate cells
		
		try {
			writer.write(",");
			} catch (IOException d) {
      System.out.println(d.getMessage());
    }
			 
			try{ 
			 writer.write(nameFieldName.getText());
			 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	    //separate cells
		try{
			 writer.write(",");
			 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
			 
		try {	 
	 writer.write(nameFieldGender.getText());
	 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	    //separate cells
		try {
	 writer.write(",");
	 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	 
	 try{
	writer.write(nameFieldDOB.getText());
	} catch (IOException d) {
      System.out.println(d.getMessage());
    }
	    //separate cells
		try {
	 writer.write(",");
	 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	 
	 try {
	 writer.write(nameFieldOccupation.getText());
	 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	    //separate cells
		
		try{
	 writer.write(",");
	 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	 
	 try {
	 writer.write(nameFieldPremium.getText());
	 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	    //separate cells
		
		try {
	 writer.write(",");
	 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	 
	 try {
	 writer.write(nameFieldDeductible.getText());
	 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	    //separate cells
	try{
	 writer.write(",");
	 } catch (IOException d) {
      System.out.println(d.getMessage());
    }
	 
	 Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		try{
		writer.write(formatter.format(date));
		} catch (IOException d) {
      System.out.println(d.getMessage());
    }
		try {
		writer.write(",");
		} catch (IOException d) {
      System.out.println(d.getMessage());
    }
		try{
	    writer.write("\n");
		} catch (IOException d) {
      System.out.println(d.getMessage());
    }
	 
			 //report areport = new report();
			 //areport.fullReport();
	
		  }
		  
		 //} catch (IOException e) {
      //System.out.println(e.getMessage());
	 
	 });
	
	frame4.add(title);
	frame4.add(textLabelID);
	frame4.add(nameFieldID);
	
	//frame3.add(textLabel3, BorderLayout.NORTH);
	
	
	frame4.add(textLabelName);
	frame4.add(nameFieldName /*BorderLayout.EAST*/);
	
	
	
	frame4.add(textLabelGender);
	frame4.add(nameFieldGender /*BorderLayout.EAST*/);
	
	
	frame4.add(textLabelDOB);
	frame4.add(nameFieldDOB /*BorderLayout.EAST*/);
	
	
	frame4.add(textLabelOccupation);
	frame4.add(nameFieldOccupation /*BorderLayout.EAST*/);
	
	
	frame4.add(textLabelPremium);
	frame4.add(nameFieldPremium /*BorderLayout.EAST*/);
	
	
	frame4.add(textLabelDeductible);
	frame4.add(nameFieldDeductible /*BorderLayout.EAST*/);
	
	frame4.add(button, BorderLayout.SOUTH);
	frame4.setLocationRelativeTo(null);
	frame4.pack();
	frame4.setVisible(true);
	}
		 catch (IOException e) {
      System.out.println(e.getMessage());
    }

	 }
	
 }