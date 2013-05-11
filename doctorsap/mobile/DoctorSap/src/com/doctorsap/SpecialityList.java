package com.doctorsap;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;

public class SpecialityList extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_speciality_list);
	}
	
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		finish();
	}

}
