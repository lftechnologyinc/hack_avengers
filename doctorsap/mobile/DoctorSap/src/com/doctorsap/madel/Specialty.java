package com.doctorsap.madel;

import android.os.Parcel;
import android.os.Parcelable;

public class Specialty implements Parcelable {

	private int _id;
	private String name;
	private String tags;

	public Specialty() {

	}
	
	public Specialty(String name, String tags) {
		this.name = name;
		this.tags = tags;
	}

	public Specialty(Parcel in) {
		_id = in.readInt();
		name = in.readString();
		tags = in.readString();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(_id);
		dest.writeString(name);
		dest.writeString(tags);
	}

	public static final Parcelable.Creator<Specialty> CREATOR = new Parcelable.Creator<Specialty>() {

		@Override
		public Specialty createFromParcel(Parcel source) {
			return new Specialty(source);
		}

		@Override
		public Specialty[] newArray(int size) {
			return new Specialty[size];
		}
	};

	@Override
	public int describeContents() {
		return 0;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
