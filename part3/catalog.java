import java.util.LinkedList;

public class catalog{
	
	patient apatient = new patient();

public catalog(anapatient){
	apatient = anapatient;
}

public  void addpatient(){

	LinkedList<Patient> patients = new  LinkedList<Patient>();
	
	patients.add(apatient);

}

}