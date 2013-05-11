package doctorsap

class Specialty {

	String name;
	String tags;

	static constraints = { name blank:false ; }
	static mapping = { sort "name":"asc" }
	String toString() {
		name
	}
	
	static searchFields = [
		fields : [
			'name',
			'tags'
		],
		defaultField : 'name', //default filter field
		defaultSort : 'name'
	]
}
