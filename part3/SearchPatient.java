import java.util.LinkedList;

public class SearchPatient{
	
	String IDnumber;
	patient apatient = new patient();
	catalog acatalog = new catalog();
	
	iterateUsingIterator(acatalog);

public SearchPatient(catalog anacatalog, String anID){
	IDnumber = anID;
	acatalog = acatalog;
	//apatient = anapatient;
}

public  patient Search(String anID){
	
	while (acatalog.hasNext()){
	apatient = acatalog.next;
	if (apatient.getID().contains(anID))
		return apatient;
	
	}

	

}

}