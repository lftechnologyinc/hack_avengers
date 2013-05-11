package com.doctorsap;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.doctorsap.task.DoctorsTask;
import com.doctorsap.task.SpecialityTask;

public class DoctorSap extends SherlockActivity implements OnClickListener,  OnEditorActionListener{

	private Button bSpeciality;
	private EditText etSearch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_doctor_sap);
		
		bSpeciality = (Button) findViewById(R.id.bSpeciality);
		bSpeciality.setOnClickListener(this);
		
		etSearch = (EditText) findViewById(R.id.etSearch);
		etSearch.setOnEditorActionListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.doctor_sap, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bSpeciality:
			SpecialityTask st = new SpecialityTask(this);
			st.execute();
			break;
		case R.id.bDoctors:
			DoctorsTask dt = new DoctorsTask(this);
			dt.execute();
		default:
			break;
		}
		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		if (actionId == EditorInfo.IME_ACTION_SEARCH && etSearch.getText().toString().trim() != "") {
            performSearch(etSearch.getText().toString().trim());
            return true;
        }
        return false;
	}

	private void performSearch(String query) {
		Toast.makeText(this, query, Toast.LENGTH_LONG).show();
	}

}
