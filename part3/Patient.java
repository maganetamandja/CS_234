public class Patient  {
    
    // declare initial variables
        private int patientNumber;
        private String premium ;
        private String deductible;
        private String injuryLocation ;
        private String Name;
        private String dob;
        private String gender;
        private String occupation;
        
    //constructor
    public Patient (int apatientNumber, String apremium , String adeductible,
    String ainjuryLocation, String aName, String adob, String agender, 
    String aoccupation){
        patientNumber = apatientNumber;
        premium = apremium;
        deductible = adeductible;
        injuryLocation = ainjuryLocation;
        Name = aName;
        dob = adob;
        gender = agender;
        occupation = aoccupation;
    
    }
	
	//Savior constructor
	public Patient (){
		//just exists
	}
    
    //get patient ID
    public int getID(){
        return this.patientNumber;
    }
	
	
	 //get Patient Name
    public String getPatientName(){
        return this.Name;
        }
	 //get Patient ob
    public String getPatientDOB(){
        return this.dob;
        }
	 //get Patient gender
    public String getPatientGender(){
        return this.gender;
        }
		
		//get Patient gender
    public String getPatientPremium(){
        return this.premium;
        }
		
		//get Patient gender
    public String getPatientDeductible(){
        return this.deductible;
        }
		
		//get Patient gender
    public String getPatientInjuryLocation(){
        return this.injuryLocation;
        }
		
		//get Patient occupation
    public String getPatientOccupation(){
        return this.occupation;
        }
}