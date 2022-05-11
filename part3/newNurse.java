
import java.time.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.io.*;  
import java.util.Scanner; 
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 
//this is the new nurse window
 public  class  newNurse extends FinalProjectApp  {
	 //Nurse to be returned later
	 Nurse aNurse = new Nurse();
	 
	 //FinalProjectApp ref = new FinalProjectApp();
	 
	 //Nurse map
	//HashMap<Integer, Nurse> NurseCatalog = new HashMap<Integer, Nurse>();
	
	//provide methods to add values 
		
		public void addNurse(int akey, Nurse aNurse){
			super.NurseCatalogGet().put(akey, aNurse);
		}
	
    public  void creation() {
	 
	 
	 
	//main new nurse window
	JFrame frame4 = new JFrame("add Nurse window");
	frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame4.setLayout(new BoxLayout(frame4.getContentPane(), BoxLayout.PAGE_AXIS));
	
	
	//JButton
	JButton button = new JButton("create");
	
	//initial texts
	
	JLabel title = new JLabel("****************CREATOR*****************");
	

	//ID
	JLabel textLabelID = new JLabel("type ID");
	JTextField nameFieldID = new JTextField( 20);
	 
	
	//name
	JLabel textLabelName = new JLabel("type Name");
	JTextField nameFieldName = new JTextField( 20);
	
	
	
	//gender
	JLabel textLabelGender = new JLabel("type gender");
	JTextField nameFieldGender = new JTextField( 20);
	
	
	
	//DOB
	JLabel textLabelDOB = new JLabel("type date of birth");
	JTextField nameFieldDOB = new JTextField( 20);

	
	//Occupation
	JLabel textLabelOccupation = new JLabel("type occupation");
	JTextField nameFieldOccupation = new JTextField( 20);
	
	
	
	//the action happens here
	
	//first we convert ID to int
	//int recordedID = Integer.parseInt(nameFieldID.getText());
	
	button.addActionListener(new ActionListener(){
		 
		@Override
		 public void actionPerformed(ActionEvent e){
			System.out.print("clicked");
			

			//Create the new Nurse
			Nurse aNurse = new Nurse(Integer.parseInt(nameFieldID.getText()), nameFieldName.getText(), nameFieldDOB.getText(), nameFieldGender.getText(),  nameFieldOccupation.getText());
			 System.out.print("gate i");
			addNurse(aNurse.getID(), aNurse);
			System.out.print("gate ii");
			
			
			//close after		 
			frame4.dispose();
		  }
		  
		 //} catch (IOException e) {
      //System.out.println(e.getMessage());
	 
	 });
	
	//add element to frame
	
	frame4.add(title);
	frame4.add(textLabelID);
	frame4.add(nameFieldID);

	
	
	frame4.add(textLabelName);
	frame4.add(nameFieldName /*BorderLayout.EAST*/);
	
	
	
	frame4.add(textLabelGender);
	frame4.add(nameFieldGender /*BorderLayout.EAST*/);
	
	
	frame4.add(textLabelDOB);
	frame4.add(nameFieldDOB /*BorderLayout.EAST*/);
	
	
	frame4.add(textLabelOccupation);
	frame4.add(nameFieldOccupation /*BorderLayout.EAST*/);
	
	
	
	
	frame4.add(button, BorderLayout.SOUTH);
	frame4.setLocationRelativeTo(null);
	frame4.pack();
	frame4.setVisible(true);
	
	//return aNurse;
	//debug
	//System.out.println(super.NurseCatalog);
	 }
	
 }