package com.example.stoppointui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Stations extends Activity {
	private static final String[] rno = {};

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.findstations);

		final AutoCompleteTextView ac1 = (AutoCompleteTextView) findViewById(R.id.acRno);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(Stations.this,
				android.R.layout.simple_dropdown_item_1line, rno);	
	}

}
