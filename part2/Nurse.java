import java.util.ArrayList;

//create shift
ArrayList<String> shifts = new ArrayList<String>();

//the 3 shifts
shifts.add("Day");
shifts.add("mid");
shifts.add("night");

public class Nurse implements Person {
    // declare initial variables
        private int nurseID
        private String Name;
        private String dob;
        private String gender;
        private String occupation;
        
    //constructor
    public Nurse (int anurseID,String aName, String adob, String agender, 
    String aocccupation){
        nurseID = anurseID;
        Name = aName;
        dob = adob;
        gender = agender;
        occupation = occupation;
    }
    
    //get Nurse shift
    
    public String getNurseShift(int shift){
        return shifts.get(shift+1);
        
    }
    
    //get Nurse ID
    public int getID{
        return this.nurseID;
        }
    
}