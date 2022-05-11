import java.io.*;  
import java.util.*; 
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 


 public class PatientReport extends FinalProjectApp{
	public  void report(){
	
	//background tag 
	String colortagOpen = "<span style = 'background-color: powderblue'>";
	String colortagClose ="</span>";
	String myString = "";
	int i =1;
	//used to switch colors
	boolean checker = true;
		
	JFrame frame2 = new JFrame("Patient report window");
	frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame2.setLayout(new BoxLayout(frame2.getContentPane(), BoxLayout.PAGE_AXIS));
	
	
		//start the body with an HTML tag
		
		
		//we start navigation through the map
		for (HashMap.Entry<Integer,Patient> entry : super.PatientCatalog.entrySet()){
			
			myString = " ";
			
			//alternate between gray backgrownd and no background
			if (checker){
			//myString = "//";
			myString =  String.valueOf(i)+" : " +myString + entry.getValue().getID()+ "   " + entry.getValue().getPatientName()+"  " + entry.getValue().getPatientDOB() + "  "+entry.getValue().getPatientGender() + "  "+entry.getValue().getPatientOccupation() +" "+entry.getValue().getPatientPremium()+ "   " + entry.getValue().getPatientDeductible() + "   " + entry.getValue().getPatientInjuryLocation();
			//myString = myString + "</html>";
			JLabel textLabel = new JLabel(myString, SwingConstants.CENTER);
			textLabel.setPreferredSize(new Dimension(300, 100));
			frame2.getContentPane().add(textLabel, BorderLayout.CENTER);
			textLabel.setForeground(Color.GREEN.darker().darker());
			checker = false;
			}
			else {
			//myString = "//";
			myString =  String.valueOf(i)+" : " +myString + entry.getValue().getID()+ "   " + entry.getValue().getPatientName()+"  " + entry.getValue().getPatientDOB() + "  "+entry.getValue().getPatientGender() + "  "+entry.getValue().getPatientOccupation() +" "+ entry.getValue().getPatientPremium()+ "   " + entry.getValue().getPatientDeductible() + "   " + entry.getValue().getPatientInjuryLocation();

			//myString = myString + "</html>";
			JLabel textLabel = new JLabel(myString, SwingConstants.CENTER);
			textLabel.setPreferredSize(new Dimension(300, 100));
			frame2.getContentPane().add(textLabel, BorderLayout.CENTER);
			checker = true;
			}
			i= i+1;
		}
		
		
		
		//Close the HTML
		

			frame2.setLocationRelativeTo(null);
			frame2.pack();
			frame2.setVisible(true);
	
	

	
	
	}
	
}