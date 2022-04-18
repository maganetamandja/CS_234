import java.util.Scanner;  // Import the Scanner class

public class newpatient{
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter patient ID");
	
	String userName = myObj.nextLine();  // Read user ID
   
	
	System.out.println("Enter Date of birth dd-Mon-YY");
	
	String dob = myObj.nextLine();  // Read user DOB
   
	
	System.out.println("Enter patient Gender");
	
	String gender = myObj.nextLine();  // Read user input
   
	
	System.out.println("Enter Occupation");
	
	String occupation = myObj.nextLine();  // Read user input
  
	
	System.out.println("Enter Insurance Premium");
	
	String insurancePremium = myObj.nextLine();  // Read user input
    
	
	System.out.println("Enter Insurance Deductible");
	
	String insuranceDeductible = myObj.nextLine();  // Read user input
}