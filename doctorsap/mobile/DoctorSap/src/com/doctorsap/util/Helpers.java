package com.doctorsap.util;

import android.content.Context;
import android.net.ConnectivityManager;

public class Helpers {
	
	public static boolean checkInternetConnection(Context context) {
		ConnectivityManager connectivityManager = 
				(ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		
		if (connectivityManager.getActiveNetworkInfo() != null
				&& connectivityManager.getActiveNetworkInfo().isAvailable()
				&& connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
			return true;
		} else {
			return false;
		}
		
	}

}
