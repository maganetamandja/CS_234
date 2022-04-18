class Address {
    
    //declare variables
    private int addressID;
    private String Street;
    private String City;
    private String State;
    private String PostalCode;
    private String Country;
    private String phoneNumber;
    
    
    public Adress(String aStreet, String aCity ,
    String aState,String aPostalCode,String aCountry, 
    String aphoneNumber){
           
       Street= aStreet;
       City = aCity;
       State = aState;
       PostalCode = aPostalCode;
       Country = aCountry;
       phoneNumber = aphoneNumber;
        
        
    }
    
    //the adress has a person's ID associate
    Person aPerson =  new Patient();
    addressID = aPerson.getID();
    
    
}