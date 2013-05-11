import doctorsap.Specialty;

class BootStrap {

    def init = { servletContext ->
		Specialty.findByName('Gynaecology & Obstetrics')?:new Specialty(name:'Gynaecology & Obstetrics', tags: '').save(failOnError: true);
		Specialty.findByName('Internal Medicine')?:new Specialty(name:'Internal Medicine', tags: '').save(failOnError: true);
		Specialty.findByName('Ophthalmology (EYE)')?:new Specialty(name:'Ophthalmology (EYE)', tags: '').save(failOnError: true);
		Specialty.findByName('Gastroenterology')?:new Specialty(name:'Gastroenterology', tags: '').save(failOnError: true);
		Specialty.findByName('Neurology')?:new Specialty(name:'Neurology', tags: '').save(failOnError: true);
		Specialty.findByName('Psychiatry')?:new Specialty(name:'Psychiatry', tags: '').save(failOnError: true);
		Specialty.findByName('Dental')?:new Specialty(name:'Dental', tags: '').save(failOnError: true);
		Specialty.findByName('Physiotherapy General Paediatrics')?:new Specialty(name:'Physiotherapy General Paediatrics', tags: '').save(failOnError: true);
		Specialty.findByName('Dermatology, Venerology & Leprology')?:new Specialty(name:'Dermatology, Venerology & Leprology', tags: '').save(failOnError: true);
		Specialty.findByName('Paediatric Surgery')?:new Specialty(name:'Paediatric Surgery', tags: '').save(failOnError: true);
		Specialty.findByName('Cardiology')?:new Specialty(name:'Cardiology', tags: '').save(failOnError: true);
		Specialty.findByName('Oncology')?:new Specialty(name:'Oncology', tags: '').save(failOnError: true);
		Specialty.findByName('Plastic Surgery')?:new Specialty(name:'Plastic Surgery', tags: '').save(failOnError: true);
		Specialty.findByName('ENT (Ear Nose Throat)')?:new Specialty(name:'ENT (Ear Nose Throat)', tags: '').save(failOnError: true);
		Specialty.findByName('Radiology')?:new Specialty(name:'Radiology', tags: '').save(failOnError: true);
		Specialty.findByName('Urology')?:new Specialty(name:'Urology', tags: '').save(failOnError: true);
		Specialty.findByName('Orthopeadic')?:new Specialty(name:'Orthopeadic', tags: '').save(failOnError: true);
		Specialty.findByName('General Surgery')?:new Specialty(name:'General Surgery', tags: '').save(failOnError: true);
		Specialty.findByName('Nephrology')?:new Specialty(name:'Nephrology', tags: '').save(failOnError: true);
    }
    def destroy = {
    }
}