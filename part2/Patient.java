public class Patient implements Person {
    
    // declare initial variables
        private int patientNumber;
        private double premium ;
        private double deductible;
        private String injuryLocation ;
        private String Name;
        private String dob;
        private String gender;
        private String occupation;
        
    //constructor
    public Patient (int apatientNumber, double apremium , double adeductible,
    String ainjuryLocation, String aName, String adob, String agender, 
    String aocccupation){
        patientNumber = apatientNumber;
        premium = apremium;
        deductible = adeductible;
        injuryLocation = ainjuryLocation;
        Name = aName;
        dob = adob;
        gender = agender;
        occupation = occupation;
    
    }
    
    //get patient ID
    public int getID{
        return this.patientNumber;
    }
}