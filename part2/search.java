import java.io.*;  
import java.util.Scanner;  

public class SearchClient {
	
	public static void main(String[] args){
		//parsing a CSV file into Scanner class constructor
		try{
		Scanner sc = new Scanner(new File("data.csv"));
		sc.useDelimiter(",");
		
		int i=0;
		
		while (sc.hasNext()){  //returns a boolean value
			if (sc.next() =="ID34568" ){
				while ( sc.next() != "\n"){
					System.out.print(sc.next());
					System.out.print("  ");
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