package doctorsap

class Doctor {

	String fullName;
	String eduction;
	String liscenceNo;
	Specialty specialty;

	static constraints = {
		fullName blank:false ;
		liscenceNo blank:false ;
	}
	static mapping = { sort "fullName":"asc" }
	
	String toString() {
		fullName
	}
}
