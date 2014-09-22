package com.example.stoppointui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyMenu extends ListActivity {

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.ListActivity#onListItemClick(android.widget.ListView,
	 * android.view.View, int, long)
	 */

	String classes[] = { "Routes", "Stations", "About" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(MyMenu.this,
				android.R.layout.simple_list_item_single_choice, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese = classes[position];
		try {
			Class ourClass = Class.forName("com.example.stoppointui." + cheese);
			System.out.println(cheese);
			System.out.println("Intent Created");
			Intent ournewIntent = new Intent(MyMenu.this, ourClass);
			startActivity(ournewIntent);
			overridePendingTransition(R.anim.slide_in_right,
					R.anim.slide_out_left);
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // Debugging.
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	}
}
