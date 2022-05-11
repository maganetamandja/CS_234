
import java.time.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.io.*;  
import java.util.Scanner; 
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 
//this is the new Patient window
 public  class  NewPatient extends FinalProjectApp  {
	 //Patient to be returned later
	 Patient aPatient = new Patient();
	 
	 //FinalProjectApp ref = new FinalProjectApp();
	 
	 //Patient map
	//HashMap<Integer, Patient> PatientCatalog = new HashMap<Integer, Patient>();
	
	//provide methods to add values 
		
		public void addPatient(int akey, Patient aPatient){
			super.PatientCatalogGet().put(akey, aPatient);
		}
	
    public  void creation() {
	 
	 
	 
	//main new Patient window
	JFrame frame4 = new JFrame("add Patient window");
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
	
	//record insuranceDeductible
	JLabel textLabelDeductible = new JLabel("type insurance deductible");
	JTextField nameFieldDeductible = new JTextField( 20);
	
	//record premium
	JLabel textLabelpremium = new JLabel("type premium");
	JTextField nameFieldpremium = new JTextField( 20);
	
	//record injury location
	JLabel textLabelInjuryLocation= new JLabel("type injury location");
	JTextField nameFieldInjuryLocation = new JTextField( 20);
	
	//the action happens here
	
	//first we convert ID to int
	//int recordedID = Integer.parseInt(nameFieldID.getText());
	
	button.addActionListener(new ActionListener(){
		 
		@Override
		 public void actionPerformed(ActionEvent e){
			System.out.print("clicked");
			

			//Create the new Patient
			Patient aPatient = new Patient(Integer.parseInt(nameFieldID.getText()),nameFieldpremium.getText(),nameFieldDeductible.getText(),nameFieldInjuryLocation.getText(), nameFieldName.getText(), nameFieldDOB.getText(), nameFieldGender.getText(),  nameFieldOccupation.getText());
			 System.out.print("gate i");
			addPatient(aPatient.getID(), aPatient);
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

	frame4.add(textLabelpremium);
	frame4.add(nameFieldpremium /*BorderLayout.EAST*/);
	
	frame4.add(textLabelDeductible);
	frame4.add(nameFieldDeductible /*BorderLayout.EAST*/);
	
	frame4.add(textLabelInjuryLocation);
	frame4.add(nameFieldInjuryLocation /*BorderLayout.EAST*/);
	
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
	
	//return aPatient;
	//debug
	//System.out.println(super.PatientCatalog);
	 }
	
 }