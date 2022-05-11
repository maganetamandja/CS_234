import java.util.*;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class FinalProjectApp {
	
	
	
	//visit map
	static HashMap<Integer, Visit> VisitCatalog = new HashMap<Integer, Visit>();
	
	//Nurse map
	static HashMap<Integer, Nurse> NurseCatalog = new HashMap<Integer, Nurse>();
	
	//Patient map
	static HashMap<Integer, Patient> PatientCatalog = new HashMap<Integer, Patient>();
	
	public HashMap<Integer, Nurse> NurseCatalogGet(){
		return this.NurseCatalog ;
	}
	
	public HashMap<Integer, Patient> PatientCatalogGet(){
		return this.PatientCatalog ;
	}
	
	//public NurseCatalogSet(HashMap<Integer, Nurse > aNurseCatalog){
	//	this.NurseCatalog = aNurseCatalog;
	//}
	
	
	
	
		// the catalog is contained inside the main app
		
		//patient map
		//Patient patientObject;
		
		//HashMap<int, patientObject> PatientCatalog = new HashMap<int, patientObject>();
		
		
		
		
		
	//	public void addPatient(int akey, Patient aPatient){
		//	PatientCatalog.put(akey, aPatient);
		//}
	
	//load an image
	static ImageIcon img = new ImageIcon("bgimage.jpg");
	
	//load dummy data
	
	
	public static void main(String[] args){
		LoadDummyData();
		//The main frame
		JFrame frame = new JFrame("Main window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//create a menubar
		JMenuBar mb = new JMenuBar();
		//create a menu 
		JMenu x = new JMenu("Menu");
		
		//menu items
		//menu create Nurse
		JMenuItem createNurse = new JMenuItem("create Nurse");
		createNurse.setMnemonic(KeyEvent.VK_C);
		
		//Here is where the action happen
		createNurse.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent e){
			 System.out.println("create Nurse window");
			 newNurse anewNurse = new newNurse();
			 System.out.println("gate 1");
			 //create a nurse variable
			 //Nurse tempNurse = new Nurse();
			 System.out.println("gate 2");
			 anewNurse.creation();
			 
			 
			 
			 //System.out.println("gate 3");
			 //addNurse(tempNurse.getID(), tempNurse);
			 
		 }
	 });
	 
	 //menu create Patient
		JMenuItem createPatient = new JMenuItem("create Patient");
		createPatient.setMnemonic(KeyEvent.VK_C);
		
		//Here is where the action happen
		createPatient.addActionListener(new ActionListener(){
		@Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("create Patient window");
			 NewPatient anewPatient = new NewPatient();
			 System.out.println("gate 1");
			 //create a nurse variable
			 //Nurse tempNurse = new Nurse();
			 System.out.println("gate 2");
			 anewPatient.creation();
			 
			 
			 
			 //System.out.println("gate 3");
			 //addNurse(tempNurse.getID(), tempNurse);
			 
		 }
	 });
	 
	 //menu report nurse
		JMenuItem nurseReport = new JMenuItem("Nurse Report");
		nurseReport.setMnemonic(KeyEvent.VK_C);
		
		//Here is where the action happen
		nurseReport.addActionListener(new ActionListener(){
		@Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("Nurse Report window");
			 NurseReport aNurseReport = new NurseReport();
			 System.out.println("gate 1");
			 //create a nurse variable
			 //Nurse tempNurse = new Nurse();
			 System.out.println("gate 2");
			 aNurseReport.report();
			 
			 
			 
			 //System.out.println("gate 3");
			 //addNurse(tempNurse.getID(), tempNurse);
			 
		 }
	 });
	 
	 //menu report nurse
		JMenuItem patientReport = new JMenuItem("Patient Report");
		patientReport.setMnemonic(KeyEvent.VK_C);
		
		//Here is where the action happen
		patientReport.addActionListener(new ActionListener(){
		@Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("Patient Report window");
			 PatientReport aNurseReport = new PatientReport();
			 System.out.println("gate 1");
			 //create a nurse variable
			 //Nurse tempNurse = new Nurse();
			 System.out.println("gate 2");
			 aNurseReport.report();
			 
			 
			 
			 //System.out.println("gate 3");
			 //addNurse(tempNurse.getID(), tempNurse);
			 
		 }
	 });
	 
	 //menu delete nurse
		JMenuItem deleteNurse = new JMenuItem("Remove Nurse");
		deleteNurse.setMnemonic(KeyEvent.VK_C);
		
		//Here is where the action happen
		deleteNurse.addActionListener(new ActionListener(){
		@Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("Delete Nurse window");
			 removeNurse aremoveNurse = new removeNurse();
			 System.out.println("gate 1");
			 //create a nurse variable
			 //Nurse tempNurse = new Nurse();
			 System.out.println("gate 2");
			 aremoveNurse.remove();
			 
			 
			 
			 //System.out.println("gate 3");
			 //addNurse(tempNurse.getID(), tempNurse);
			 
		 }
	 });
	 
	 //menu delete patient
		JMenuItem deletePatient = new JMenuItem("Remove Patient");
		deletePatient.setMnemonic(KeyEvent.VK_C);
		
		//Here is where the action happen
		deletePatient.addActionListener(new ActionListener(){
		@Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("Delete Patient window");
			 removePatient aremovePatient = new removePatient();
			 System.out.println("gate 1");
			 //create a Patient variable
			 //Patient tempPatient = new Patient();
			 System.out.println("gate 2");
			 aremovePatient.remove();
			 
			 
			 
			 //System.out.println("gate 3");
			 //addNurse(tempNurse.getID(), tempNurse);
			 
		 }
	 });
	 
	 //menu create visit
		JMenuItem visit = new JMenuItem("visit");
		visit.setMnemonic(KeyEvent.VK_C);
		
		//Here is where the action happen
		visit.addActionListener(new ActionListener(){
		@Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("visit window");
			 Visit aVisit = new Visit();
			 System.out.println("gate 1");
			 //create a Patient variable
			 //Patient tempPatient = new Patient();
			 System.out.println("gate 2");
			 aVisit.creation();
			 
			 
			 
			 //System.out.println("gate 3");
			 //addNurse(tempNurse.getID(), tempNurse);
			 
		 }
	 });
	 
	 //menu report visit
		JMenuItem visitReport = new JMenuItem("visit Report");
		patientReport.setMnemonic(KeyEvent.VK_C);
		
		//Here is where the action happen
		visitReport.addActionListener(new ActionListener(){
		@Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("Visit Report window");
			 VisitReport aVisitReport = new VisitReport();
			 System.out.println("gate 1");
			 //create a nurse variable
			 //Nurse tempNurse = new Nurse();
			 System.out.println("gate 2");
			 aVisitReport.report();
			 
			 
			 
			 //System.out.println("gate 3");
			 //addNurse(tempNurse.getID(), tempNurse);
			 
		 }
	 });
	 
	 //menu report visit
		JMenuItem saveToFile = new JMenuItem("Save datat to file");
		patientReport.setMnemonic(KeyEvent.VK_C);
		
		//Here is where the action happen
		saveToFile.addActionListener(new ActionListener(){
		@Override
		 public void actionPerformed(ActionEvent e){
			 System.out.println("saving to file");
			 VisitReport aVisitReport = new VisitReport();
			 System.out.println("gate 1");
			 //create a nurse variable
			 //Nurse tempNurse = new Nurse();
			 System.out.println("gate 2");
			 writetofile();
			 
			 
			 
			 //System.out.println("gate 3");
			 //addNurse(tempNurse.getID(), tempNurse);
			 
		 }
	 });
		
		//add menu items to menu
	
		x.add(createPatient);
		x.add(createNurse);
		x.add(nurseReport);
		x.add(patientReport);
		x.add(deleteNurse);
		x.add(deletePatient);
		x.add(visit);
		x.add(visitReport);
		x.add(saveToFile);
		//add menu to menu bar
	
		mb.add(x);
		
		//add menubar to frame.
	
		frame.setJMenuBar(mb);
		
		//add image
		
		frame.add(new JLabel(img));
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);

		
		}
		
		//method to save to file
		static File file = new File("data.txt");
		static BufferedWriter bf = null;
		
		static void writetofile(){
		try{
			// create 
			bf = new BufferedWriter(new FileWriter(file));
			
			bf.append("*******************Patients List**********************");
			bf.newLine();
			
			//iterate map entries
			for (HashMap.Entry<Integer, Patient> entry : PatientCatalog.entrySet()){
				//key and values separated
				bf.write(entry.getKey()+ " | " + entry.getValue().getPatientName() + " | " + entry.getValue().getPatientDOB()+ " | "+entry.getValue().getPatientGender()+" | "+ entry.getValue().getPatientOccupation() +" | "+ entry.getValue().getPatientPremium()+ " | " + entry.getValue().getPatientDeductible() + " | " + entry.getValue().getPatientInjuryLocation());
				//new line
				bf.newLine();
			}
			bf.append("*******************Nurse List**********************");
			bf.newLine();
			for (HashMap.Entry<Integer, Nurse> entry : NurseCatalog.entrySet()){
				//key and values separated
				bf.write(entry.getKey()+ " | " + entry.getValue().getNurseName() + " | " + entry.getValue().getNurseDOB()+ " | "+entry.getValue().getNurseGender()+" | "+ entry.getValue().getNurseOccupation());
				//new line
				bf.newLine();
			}
				
			bf.flush();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				bf.close();
			} catch(Exception e){
				
			}
		}
		
		}
		//method to load the database
		static void LoadDummyData(){
			//create and load dummy patients
			Patient aPatient = new Patient(8989,"89.9","600","knee", 
									"James","07/08/87", "male",  "unemployed");
			
			PatientCatalog.put(aPatient.getID(), aPatient);
			
			//create and load dummy Nurse
			Nurse aNurse = new Nurse(2198,/*"85.9","400","head",*/ 
									"Cole","17/08/99", "male",  "nurse");
			
			NurseCatalog.put(aNurse.getID(), aNurse);
			
			//create and load dummy patients
			Patient aPatient1 = new Patient(6571,"76.09","500","shoulder", 
									"conor","06/08/98", "male",  "cavalier");
			
			PatientCatalog.put(aPatient1.getID(), aPatient1);
			
			//create and load dummy Nurse
			Nurse aNurse1 = new Nurse(7812,/*"85.9","400","head",*/ 
									"Mia","17/08/99", "female",  "nurse");
			
			NurseCatalog.put(aNurse1.getID(), aNurse1);
			
			//create and load dummy patients
			Patient aPatient2 = new Patient(2093,"98.09","300","shoulder", 
									"kamy","03/07/99", "female",  "cavaliere");
			
			PatientCatalog.put(aPatient2.getID(), aPatient2);
			
			//create and load dummy Nurse
			Nurse aNurse2 = new Nurse(3453,/*"85.9","400","head",*/ 
									"Carla","17/09/89", "female",  "nurse");
			
			NurseCatalog.put(aNurse2.getID(), aNurse2);
			
			//create and load dummy patients
			Patient aPatient3 = new Patient(67590,"100","897","shoulder", 
									"Kolbe","03/07/99", "male",  "Soldier");
			
			PatientCatalog.put(aPatient3.getID(), aPatient3);
			
			//create and load dummy Nurse
			Nurse aNurse3 = new Nurse(76908,/*"85.9","400","head",*/ 
									"Camy","17/09/89", "female",  "nurse");
			
			NurseCatalog.put(aNurse3.getID(), aNurse3);
			
			//create and load dummy patients
			Patient aPatient4 = new Patient(2093,"98.09","300","shoulder", 
									"kamy","03/07/99", "female",  "retired");
			
			PatientCatalog.put(aPatient4.getID(), aPatient4);
			
			//create and load dummy Nurse
			Nurse aNurse4 = new Nurse(76543,/*"85.9","400","head",*/ 
									"Sam","17/09/89", "male",  "nurse");
			
			NurseCatalog.put(aNurse4.getID(), aNurse4);
			
			//create and load dummy patients
			Patient aPatient5 = new Patient(906542,"98.09","300","arm", 
									"maddy","04/08/99", "male",  "engineer");
			
			PatientCatalog.put(aPatient5.getID(), aPatient5);
			
			//create and load dummy Nurse
			Nurse aNurse5 = new Nurse(987645,/*"85.9","400","head",*/ 
									"marta","21/10/89", "female",  "nurse");
			
			NurseCatalog.put(aNurse5.getID(), aNurse5);
			
			
			
		}

		}
	
