//main menu 
import java.util.Scanner;  

public class menu {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("what would you like to do: \n \n 1- See all patients");
		System.out.println(" \n 2- Look for a client");
		System.out.println(" \n 3- Create a client");
		
		String choice = myObj.nextLine();  // Read user input
  
			
		switch(choice) {
			case "1":
				Access report = new Access();
				report.report();
				//System.out.println("chhose 1");
			break;
			case "2":
			
			SearchClient searchAclient = new SearchClient();
			searchAclient.client();
    
			break;
			
			case "3":
			create createAclient = new create();
			createAclient.createclient();
			break;
    
			}
		}
	}
