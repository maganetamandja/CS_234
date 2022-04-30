import java.io.*;  
import java.util.Scanner;  

public class idseeker {
	
	public String client(String userID){
		String myString = "";
		//parsing a CSV file into Scanner class constructor
		try{
		Scanner sc = new Scanner(new File("test2.txt"));
		sc.useDelimiter(",");
		
		//Scanner aclientID = new Scanner(System.in);
		//System.out.println("Enter patient ID strating with ID ie: ID1234");
		
		
		int i=0;
		String str;
		
		while (sc.hasNext()){  //returns a boolean value
		
		str = sc.next();
		//System.out.print(str.getClass().getName());
		//System.out.print(str);
			if (str.contains(userID)){
				System.out.print("ID searched :");
				while (i<=1){
					myString = myString + String.join(",", sc.next()) + "  _____|____   ";
					//System.out.print(sc.next());
					//System.out.print("  ");
					i++;
				}
			}
							 
			  //find and returns the next complete token from this scanner  
			
			}  
		sc.close();  //closes the scanner 	
		}
		catch (FileNotFoundException ex) {
			System.out.print("file not found");
		}
		
		return myString;
	}
}