package doctorsap

class Doctor {

	static searchable = true
	static embedded = ['specialty']

	String fullName;
	String eduction;
	String liscenceNo;
	Specialty specialty;
	Hospital hospital;
	
	static constraints = {
		fullName blank:false ;
		liscenceNo blank:false ;
		specialty nullable:false ;
		hospital nullable:false ;
	}
	static mapping = { sort "fullName":"asc" }
	
	String toString() {
		fullName
	}
}
