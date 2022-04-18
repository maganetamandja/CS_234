import java.io.*;  
import java.util.Scanner;  

public class Access {
	public void report(){
		//parsing a CSV file into Scanner class constructor
		try{
		Scanner sc = new Scanner(new File("test.csv"));
		sc.useDelimiter(",");
		while (sc.hasNext()){  //returns a boolean value  
							 
			System.out.print(sc.next());  //find and returns the next complete token from this scanner  
			System.out.print("  ");
			}  
		sc.close();  //closes the scanner 	
		}
		catch (FileNotFoundException ex) {
			System.out.print("file not found");
		}
	}
}