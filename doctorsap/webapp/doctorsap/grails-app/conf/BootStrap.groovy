import doctorsap.Specialty;

class BootStrap {

    def init = { servletContext ->
		Specialty.findByName('Gynaecology & Obstetrics')?:new Specialty(name:'Gynaecology & Obstetrics', tags: 'uterus , women, ovarian').save(failOnError: true);
		Specialty.findByName('Internal Medicine')?:new Specialty(name:'Internal Medicine', tags: 'internalmedicine').save(failOnError: true);
		Specialty.findByName('Ophthalmology (EYE)')?:new Specialty(name:'Ophthalmology (EYE)', tags: 'eye').save(failOnError: true);
		Specialty.findByName('Gastroenterology')?:new Specialty(name:'Gastroenterology', tags: 'nervous system, depression, dementia, Parkinsons disease, Alzheimers disease, Huntington disease').save(failOnError: true);
		Specialty.findByName('Neurology')?:new Specialty(name:'Neurology', tags: 'nervous system, depression, dementia, Parkinsons disease, Alzheimers disease, Huntington disease').save(failOnError: true);
		Specialty.findByName('Psychiatry')?:new Specialty(name:'Psychiatry', tags: 'mental disorders, severe learning disability, personality disorder').save(failOnError: true);
		Specialty.findByName('Dental')?:new Specialty(name:'Dental', tags: 'teeth, gums, Dental fillings, Dental Scaling').save(failOnError: true);
		Specialty.findByName('Physiotherapy General Paediatrics')?:new Specialty(name:'Physiotherapy General Paediatrics', tags: 'Back pain, Neck pain and whiplash, Osteoporosis, Cerebral palsy, Falls and fractures').save(failOnError: true);
		Specialty.findByName('Dermatology, Venerology & Leprology')?:new Specialty(name:'Dermatology, Venerology & Leprology', tags: 'skin, ance, allergy, fungal infections, sexual diseases').save(failOnError: true);
		Specialty.findByName('Paediatric Surgery')?:new Specialty(name:'Paediatric Surgery', tags: 'infants, children').save(failOnError: true);
		Specialty.findByName('Cardiology')?:new Specialty(name:'Cardiology', tags: 'heart,  coronary artery disease').save(failOnError: true);
		Specialty.findByName('Oncology')?:new Specialty(name:'Oncology', tags: 'cancer').save(failOnError: true);
		Specialty.findByName('Plastic Surgery')?:new Specialty(name:'Plastic Surgery', tags: 'surgery').save(failOnError: true);
		Specialty.findByName('ENT (Ear Nose Throat)')?:new Specialty(name:'ENT (Ear Nose Throat)', tags: 'ear, nose, throat').save(failOnError: true);
		Specialty.findByName('Radiology')?:new Specialty(name:'Radiology', tags: 'X-ray, radiography, ultrasound, computed tomography, CT , Video xray').save(failOnError: true);
		Specialty.findByName('Urology')?:new Specialty(name:'Urology', tags: 'urinary tract infections , kidney').save(failOnError: true);
		Specialty.findByName('Orthopeadic')?:new Specialty(name:'Orthopeadic', tags: 'Knee , fracture , sports injuries, degenerative diseases').save(failOnError: true);
		Specialty.findByName('General Surgery')?:new Specialty(name:'General Surgery', tags: 'surgery').save(failOnError: true);
		Specialty.findByName('Nephrology')?:new Specialty(name:'Nephrology', tags: 'acute renal failure, chronic kidney disease, hematuria, proteinuria, kidney stones,  Dialysis').save(failOnError: true);
    }
    def destroy = {
    }
}