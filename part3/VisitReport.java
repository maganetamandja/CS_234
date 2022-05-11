import java.io.*;  
import java.util.*; 
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 


 public class VisitReport extends FinalProjectApp{
	public  void report(){
	
	//background tag 
	String colortagOpen = "<span style = 'background-color: powderblue'>";
	String colortagClose ="</span>";
	String myString = "";
	int i =1;
	boolean checker = true;
		
	JFrame frame2 = new JFrame("Visit report window");
	frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame2.setLayout(new BoxLayout(frame2.getContentPane(), BoxLayout.PAGE_AXIS));
	
	
		//start the body with an HTML tag
		
		
		//we start navigation through the map
		for (HashMap.Entry<Integer,Visit> entry : super.VisitCatalog.entrySet()){
			
			myString = " ";
			
			//alternate between gray backgrownd and no background
			if (checker){
			//myString = "//";
			myString =  String.valueOf(i)+" : " +" The Nurse "+" " + entry.getValue().nurse.getNurseName()+ " " +" met with the patient "+entry.getValue().patient.getPatientName();
			//myString = myString + "</html>";
			JLabel textLabel = new JLabel(myString, SwingConstants.CENTER);
			textLabel.setPreferredSize(new Dimension(300, 100));
			frame2.getContentPane().add(textLabel, BorderLayout.CENTER);
			textLabel.setForeground(Color.GREEN.darker().darker());
			checker = false;
			}
			else {
			//myString = "//";
			myString =  String.valueOf(i)+" : "  + entry.getValue().nurse.getNurseName() +" met with "+entry.getValue().patient.getPatientName();

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
	
	
	//texts
	/*JLabel textLabel = new JLabel("Am A label", SwingConstants.CENTER);
	textLabel.setPreferredSize(new Dimension(300, 100));
	frame2.getContentPane().add(textLabel, BorderLayout.CENTER);
	
	frame2.setLocationRelativeTo(null);
	frame2.pack();
	frame2.setVisible(true);*/
	
	
	}
	
}