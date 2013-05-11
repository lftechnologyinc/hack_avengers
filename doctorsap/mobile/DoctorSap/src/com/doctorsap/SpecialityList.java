package com.doctorsap;

import java.util.ArrayList;

import android.os.Bundle;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockActivity;
import com.doctorsap.madel.Specialty;
import com.doctorsap.view.adapters.SpecialityListAdapter;

public class SpecialityList extends SherlockActivity {

	private ListView lvSpecialty;
	private ArrayList<Specialty> list = new ArrayList<Specialty>();
	private SpecialityListAdapter listAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_speciality_list);
		
		list = getIntent().getParcelableArrayListExtra("list");
		listAdapter = new SpecialityListAdapter(this, list);
		
		lvSpecialty = (ListView) findViewById(R.id.lvSpecialty);
		lvSpecialty.setAdapter(listAdapter);
	}
	
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		finish();
	}

}
