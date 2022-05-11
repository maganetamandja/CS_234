import java.io.*;  
import java.util.*; 
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 


 public class removePatient extends FinalProjectApp{
	 
	public void deletePatient(int akey){
		super.PatientCatalogGet().remove(akey);
	}
	public  void remove (){
		
		
	
	
		
		JFrame frame4 = new JFrame("remove Patient window");
		frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame4.setLayout(new BoxLayout(frame4.getContentPane(), BoxLayout.PAGE_AXIS));

		//JButton
		JButton button = new JButton("Delete");
		
		//initial texts
	
		JLabel title = new JLabel("****************DELETE Patient*****************");
		JLabel textLabelID = new JLabel("type ID");
		JTextField nameFieldID = new JTextField( 20);
		
		

		
		button.addActionListener(new ActionListener(){
		 
		@Override
		 public void actionPerformed(ActionEvent e){
			System.out.print("clicked");
			String recordedID = "";
			recordedID = nameFieldID.getText();
			
			deletePatient(Integer.parseInt(recordedID));
			
			
			
			//close after		 
			frame4.dispose();
		  }
		  
		 //} catch (IOException e) {
      //System.out.println(e.getMessage());
	 
	 });
	
	frame4.add(title);
	frame4.add(textLabelID);
	frame4.add(nameFieldID);
	
	frame4.add(button, BorderLayout.SOUTH);
	frame4.setLocationRelativeTo(null);
	frame4.pack();
	frame4.setVisible(true);
	}
 }
