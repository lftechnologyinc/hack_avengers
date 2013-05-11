package doctorsap

class Specialty {

	static searchable = true 
	
	String name;
	String tags;

	static constraints = { name blank:false ; }
	static mapping = { sort "name":"asc" }
	String toString() {
		name
	}
}
