package com.doctorsap.task;

import java.util.ArrayList;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.doctorsap.madel.Doctors;

public class DoctorsTask extends AsyncTask<Void, Integer, Boolean> {
	
	private Context context;
	private ProgressDialog progress;
	private ArrayList<Doctors> list;
	
	public DoctorsTask(Context context) {
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
		// TODO Auto-generated method stub
		return null;
	}

}
