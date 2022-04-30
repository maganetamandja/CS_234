
import java.io.*;  
import java.util.Scanner; 
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 


 public class report{
	public  void fullReport(){
		
	String myString = "";
		
	JFrame frame2 = new JFrame("report window");
	frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	
	try{
		Scanner sc = new Scanner(new File("test2.txt"));
		sc.useDelimiter(",");
		myString = "<html>";
		int i =0;
		while (sc.hasNext()){  //returns a boolean value  
		//for (int i =0; i<5; i++){
		myString = myString + String.join(",", sc.next())+ "  _____|____   ";
		
		//if we reach position 7
		if (i== 7){myString= myString + "<br>"+"<br>";
		i=-1;
		}
		i= i+1;
		//}
			//myString = myString + "\n";
		//System.out.print(sc.next());  //find and returns the next complete token from this scanner  
			//System.out.print("  ");
			}
				myString = myString + "</html>";
			JLabel textLabel = new JLabel(myString, SwingConstants.CENTER);
			textLabel.setPreferredSize(new Dimension(300, 100));
			frame2.getContentPane().add(textLabel, BorderLayout.CENTER);
			
			
			
			
			
		sc.close();  //closes the scanner 	
		}
		catch (FileNotFoundException ex) {
			System.out.print("file not found");
		}
	
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