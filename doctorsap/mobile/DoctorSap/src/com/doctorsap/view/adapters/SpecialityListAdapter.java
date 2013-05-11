package com.doctorsap.view.adapters;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.doctorsap.R;
import com.doctorsap.madel.Specialty;

public class SpecialityListAdapter extends BaseAdapter {
	
	private Context context;
	private ArrayList<Specialty> list;

	public SpecialityListAdapter(Context context, ArrayList<Specialty> list) {
		this.context = context;
		this.list = list;
	}
	
	static class ViewHolder {
		TextView tvSpecialityName;
		TextView tvTags;
	}

	@Override
	public int getCount() {
		return list.size();
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Specialty spec = list.get(position);
		
		View view = convertView;
		if(view == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.speciality_list_item, null);
			
			ViewHolder vh = new ViewHolder();
			vh.tvSpecialityName = (TextView) view.findViewById(R.id.tvSpecialityName);
			vh.tvTags = (TextView) view.findViewById(R.id.tvTags);
			
			view.setTag(vh);
		}
		
		ViewHolder holder = (ViewHolder) view.getTag();
		holder.tvSpecialityName.setText(spec.getName());
		holder.tvTags.setText("( " + spec.getTags() +" )");
		
		return view;
	}

	@Override
	public Specialty getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

}
