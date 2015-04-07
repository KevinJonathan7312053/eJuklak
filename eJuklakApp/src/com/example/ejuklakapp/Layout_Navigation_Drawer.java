package com.example.ejuklakapp;

import android.app.*;
import android.os.*;
import android.support.v4.app.Fragment;

public class Layout_Navigation_Drawer extends Fragment{
	private static final String ARG_SECTION_NUMBER = "section_number";
	
	public Layout_Navigation_Drawer(){}
	
	@Override
	public void onAttach(Activity activity){
		super.onAttach(activity);
	}
	
	public static Layout_Navigation_Drawer newInstance(int sectionNumber){
		Layout_Navigation_Drawer frag = new Layout_Navigation_Drawer();
		Bundle args = new Bundle();
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		frag.setArguments(args);
		return frag;
		
	}
}
