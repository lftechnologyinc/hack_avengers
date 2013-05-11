package com.doctorsap;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.doctorsap.task.SpecialityTask;

public class DoctorSap extends SherlockActivity implements OnClickListener{

	private Button bSpeciality;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_doctor_sap);
		
		bSpeciality = (Button) findViewById(R.id.bSpeciality);
		bSpeciality.setOnClickListener(this);
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
		default:
			break;
		}
		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
	}

}
