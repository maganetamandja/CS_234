import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 
import java.time.*;
import java.util.*;
import java.text.SimpleDateFormat;

class Visit extends FinalProjectApp {
	int visitId = 0;
	Nurse nurse;
	Patient patient;
	String beginvisit;
	String endvisit;
	
	public String beginvisitTime(){
		return this.beginvisit;
	}
	
    public Visit(Nurse aNurse, Patient aPatient){
        // A contructor creates the id 
		visitId = visitId +1;
		nurse = aNurse;
		patient = aPatient;  
	}
	
	 public Visit(){
		 //just exist
	 }
	
		
	public void addVisit(int nurseKey, int patientkey){
			Visit myVisit = new Visit(super.NurseCatalog.get(nurseKey), super.PatientCatalog.get(patientkey));
			super.VisitCatalog.put(visitId, myVisit);
		}

		
		
    
	//add the time of begin or end of visit
	public String recordDate(){
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return formatter.format(date);
	}
	public void creation(){
		//main new Patient window
	JFrame frame4 = new JFrame("add visit window");
	frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame4.setLayout(new BoxLayout(frame4.getContentPane(), BoxLayout.PAGE_AXIS));
	
	//JButton begin meeting
	JButton button1 = new JButton("begin visit");
	
	//JButton end meeting
	JButton button2 = new JButton("end visit");
	
	//initial texts
	
	JLabel title = new JLabel("****************VISIT*****************");
	
	JLabel textLabelPatientID = new JLabel("type patient ID");
	JTextField nameFieldNurseID = new JTextField( 20);
	 
	
	//name
	JLabel textLabelNurseID = new JLabel("type Nurse ID");
	
	JTextField nameFieldPatientID = new JTextField( 20);
	
	button1.addActionListener(new ActionListener(){
		 
		@Override
		 public void actionPerformed(ActionEvent e){
			System.out.print("clicked");
			

			//Create the new Patient
			addVisit(Integer.parseInt(nameFieldPatientID.getText()), Integer.parseInt(nameFieldNurseID.getText()));
			 System.out.print("gate i");
			//addPatient(aPatient.getID(), aPatient);
			System.out.print("gate ii");
			beginvisit= recordDate();
			
			//close after		 
			//frame4.dispose();
		  }
		});
		
		button2.addActionListener(new ActionListener(){
		 
		@Override
		 public void actionPerformed(ActionEvent e){
			System.out.print("clicked");
			

			//Create the new Patient
			//Patient aPatient = new Patient(Integer.parseInt(nameFieldID.getText()),nameFieldpremium.getText(),nameFieldDeductible.getText(),nameFieldInjuryLocation.getText(), nameFieldName.getText(), nameFieldDOB.getText(), nameFieldGender.getText(),  nameFieldOccupation.getText());
			 System.out.print("gate i");
			//addPatient(aPatient.getID(), aPatient);
			System.out.print("gate ii");
			endvisit = recordDate();
			
			//close after		 
			frame4.dispose();
		  }
		
		});
		
		frame4.add(title);
		frame4.add(textLabelPatientID);
		frame4.add(nameFieldPatientID);
		frame4.add(textLabelNurseID);
		frame4.add(nameFieldNurseID);
		
		frame4.add(button1, BorderLayout.NORTH);
		frame4.add(button2, BorderLayout.SOUTH);
		frame4.setLocationRelativeTo(null);
		frame4.pack();
		frame4.setVisible(true);
	}
	
}