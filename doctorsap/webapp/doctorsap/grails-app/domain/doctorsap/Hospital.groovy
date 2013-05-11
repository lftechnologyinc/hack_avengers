package doctorsap

class Hospital {

	String name;
	String contact;
	String location;
	
    static constraints = {
		name blank:false ;
		contact blank:false ;
		location blank:false ;
    }
}
