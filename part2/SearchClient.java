import java.io.*;  
import java.util.Scanner;  

public class SearchClient {
	
	public void client(){
		//parsing a CSV file into Scanner class constructor
		try{
		Scanner sc = new Scanner(new File("test.csv"));
		sc.useDelimiter(",");
		
		Scanner aclientID = new Scanner(System.in);
		System.out.println("Enter patient ID strating with ID ie: ID1234");
		
		String userID = aclientID.nextLine();
		int i=0;
		String str;
		
		while (sc.hasNext()){  //returns a boolean value
		
		str = sc.next();
		//System.out.print(str.getClass().getName());
		//System.out.print(str);
			if (str.contains(userID)){
				System.out.print("ID searched :");
				while (i<=5){
					System.out.print(sc.next());
					System.out.print("  ");
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
	}
}