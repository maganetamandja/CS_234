import java.util.ArrayList;



//create shift
//ArrayList<String> shifts = new ArrayList<String>();

//the 3 shifts
//shifts.add("Day");
//shifts.add("mid");
//shifts.add("night");

public class Nurse  {
    // declare initial variables
        private int nurseID;
        private String Name;
        private String dob;
        private String gender;
        private String occupation;
        
    //constructor
    public Nurse (int anurseID,String aName, String adob, String agender, 
    String aoccupation){
        nurseID = anurseID;
        Name = aName;
        dob = adob;
        gender = agender;
        occupation = aoccupation;
    }
	//Allows to create empty nurses
	public Nurse (){
        
        
    }
    
    //get Nurse shift
    
   // public String getNurseShift(int shift){
     //   return shifts.get(shift+1);
        
    //}
    
    //get Nurse ID
    public int getID(){
        return this.nurseID;
        }
		
	 //get Nurse Name
    public String getNurseName(){
        return this.Name;
        }
	 //get Nurse ob
    public String getNurseDOB(){
        return this.dob;
        }
	 //get Nurse gender
    public String getNurseGender(){
        return this.gender;
        }
		
		//get Nurse occupation
    public String getNurseOccupation(){
        return this.occupation;
        }
    
}