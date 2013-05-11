package com.doctorsap.task;

import java.util.ArrayList;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.doctorsap.SpecialityList;
import com.doctorsap.madel.Specialty;

public class SpecialityTask extends AsyncTask<Void, Integer, Boolean> {
	
	private Context context;
	private ProgressDialog progress;
	
	public SpecialityTask(Context context) {
		this.context = context;
	}
	

	@Override
	protected void onPreExecute() {
		progress = new ProgressDialog(context);
		progress.setIndeterminate(true);
		progress.setCancelable(true);
		progress.setMessage("Searching Speciality ...");
		progress.show();
	}
	
	@Override
	protected Boolean doInBackground(Void... params) {
		
		ArrayList<Specialty> list = new ArrayList<Specialty>();
		
		Specialty s = new Specialty("Gynaecology & Obstetrics", "uterus, women, ovarian, internal medicine");
		Specialty s2 = new Specialty("Ophthalmology", "eye");
		Specialty s3 = new Specialty("Gastroenterology", "digestive system");
		list.add(s3);
		list.add(s2);
		list.add(s3);
		/*
		 Gastroenterology-  digestive system 
		 Neurology- nervous system, depression, dementia, Parkinson's disease, Alzheimer's disease, Huntington disease
		 Psychiatry- mental disorders, severe learning disability, personality disorder
		 Dental- teeth, gums, Dental fillings, Dental Scaling
		 Physiotherapy General Paediatrics- Back pain, Neck pain and whiplash, Osteoporosis, Cerebral palsy, Falls and fractures
		 Dermatology, Venereology & Leprology- skin, ance, allergy, fungal infections, sexual diseases
		 Paediatric Surgery-  infants, children,
		 Cardiology- heart,  coronary artery disease
		 Oncology- cancer 
		 Plastic Surgery
		 ENT ( Ear Nose Throat)
		 Radiology X-ray, radiography, ultrasound, computed tomography, CT , Video xray
		 Urology - urinary tract infections , kidney
		 Orthopedic - Knee , fracture , sports injuries, degenerative diseases 
		 General Surgery -
		 Nephrology-  acute renal failure, chronic kidney disease, hematuria, proteinuria, kidney stones,  Dialysis
		 
		 */
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread.run();
		return true;
	}
	
	@Override
	protected void onPostExecute(Boolean result) {
		if(result) {
			progress.dismiss();
			context.startActivity(new Intent(context, SpecialityList.class));
		}
		
	}
	
	@Override
	protected void onProgressUpdate(Integer... values) {
		// TODO Auto-generated method stub
		super.onProgressUpdate(values);
	}

}
