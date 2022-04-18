import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.*;
import java.util.*;
import java.text.SimpleDateFormat;

// we take information and store it persitantly thus fulfillin our 
//first aim
public class create {
  public  void createclient() {

    try  {
		
		FileWriter writer = new FileWriter("test.csv", true);
		
		// Create a Scanner object; we will do this for every entry
		Scanner myObj = new Scanner(System.in);
		System.out.println("New patient");		
		System.out.println("Enter patient ID strating with ID ie: ID1234");
		
		// Read user ID
		String userID = myObj.nextLine();  
	
	    // save userID
        writer.write(userID);
	    //separate cells
	    writer.write(",");
		//we repeat this process
		
		//record Name
		System.out.println("Enter patient Name");
		String Name = myObj.nextLine(); 
		writer.write(Name);
		writer.write(",");
		
		//record gender
		System.out.println("Enter patient Gender");
		String gender = myObj.nextLine(); 
		writer.write(gender);
		writer.write(",");
		
		//record DOB
		System.out.println("Enter Date of birth dd-Mon-YY");
		String dob = myObj.nextLine(); 
		writer.write(dob);
		writer.write(",");
		
		//record Occupation
		System.out.println("Enter Occupation");
		String occupation = myObj.nextLine();
	    writer.write(occupation);
		writer.write(",");
		
		//record insurancePremium
		System.out.println("Enter Insurance Premium");
	    String insurancePremium = myObj.nextLine(); 
	    writer.write(insurancePremium);
		writer.write(",");
		
		//record insuranceDeductible
		System.out.println("Enter Insurance Deductible");
	    String insuranceDeductible = myObj.nextLine();
	    writer.write(insuranceDeductible);
		writer.write(",");
		
		//record current time; because we do not delete information,
		//we choose the most recent one
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		writer.write(formatter.format(date));
		
	    writer.write("\n");
		System.out.println("user has been created");
		writer.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
		
  }
}