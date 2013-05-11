package com.doctorsap.madel;

import android.os.Parcel;
import android.os.Parcelable;

public class Doctors implements Parcelable {

	private int _id;
	private String education;
	private String full_name;
	private String license_no;
	private Specialty specialty;

	public Doctors() {

	}

	public Doctors(Parcel in) {
		_id = in.readInt();
		education = in.readString();
		full_name = in.readString();
		license_no = in.readString();
		specialty = in.readParcelable(getClass().getClassLoader());
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(_id);
		dest.writeString(education);
		dest.writeString(full_name);
		dest.writeString(license_no);
		dest.writeParcelable(specialty, flags);

	}

	public static final Parcelable.Creator<Doctors> CREATOR = new Parcelable.Creator<Doctors>() {

		@Override
		public Doctors createFromParcel(Parcel source) {
			return new Doctors(source);
		}

		@Override
		public Doctors[] newArray(int size) {
			return new Doctors[size];
		}
	};

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getLicense_no() {
		return license_no;
	}

	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

}
