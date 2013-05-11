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
	private ArrayList<Specialty> list;
	
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
		
		list = new ArrayList<Specialty>();
		
		Specialty s = new Specialty("Gynaecology & Obstetrics", "uterus, women, ovarian, internal medicine");
		Specialty s2 = new Specialty("Ophthalmology", "eye");
		Specialty s3 = new Specialty("Gastroenterology", "digestive system");
		Specialty s4 = new Specialty("Cardiology", "heart,  coronary artery disease");
		Specialty s5 = new Specialty("ENT", "ear, nose, throat");
		Specialty s6 = new Specialty("Radiology", "X-ray, radiography, ultrasound, computed tomography, CT , Video xray");
		Specialty s7 = new Specialty("Urology", "urinary tract infections , kidney");
		Specialty s8 = new Specialty("Orthopedic", "Knee , fracture , sports injuries, degenerative diseases ");
		Specialty s9 = new Specialty("Nephrology", "acute renal failure, chronic kidney disease, hematuria, proteinuria, kidney stones,  Dialysis");
		
		list.add(s9);
		list.add(s8);
		list.add(s7);
		list.add(s6);
		list.add(s5);
		list.add(s4);
		list.add(s3);
		list.add(s2);
		list.add(s);
		list.add(s9);
		list.add(s8);
		list.add(s7);
		list.add(s6);
		list.add(s5);
		list.add(s4);
		list.add(s3);
		list.add(s2);
		list.add(s);
		
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					sleep(4000);
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
			Intent intent = new Intent(context, SpecialityList.class);
			intent.putParcelableArrayListExtra("list", list);
			context.startActivity(intent);
		}
		
	}
	
	@Override
	protected void onProgressUpdate(Integer... values) {
		// TODO Auto-generated method stub
		super.onProgressUpdate(values);
	}

}
