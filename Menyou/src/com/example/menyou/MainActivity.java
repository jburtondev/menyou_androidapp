package com.example.menyou;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Buttons with intents
		//First Button:
		//		1.Gallery
		//		2.CallLog
		//		3.ContactBook
		Button myGalleryButton = (Button) findViewById(R.id.myGalleryButton);
		Button myCallLogButton = (Button) findViewById(R.id.myCallLogButton);
		Button myContactBookButton = (Button) findViewById(R.id.myContactBookButton);

		//OnClick Listeners for Buttons:
		//		1.Gallery
		//		2.CallLog
		//		3.ContactBook
		myGalleryButton.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent();

				myIntent.setAction(Intent.ACTION_VIEW);
				myIntent.setData(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI); // Link to Image Gallery
				startActivity(myIntent);

			}

		});
		myCallLogButton.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(); 

				myIntent.setAction(Intent.ACTION_CALL_BUTTON); // Link to Call Log
				startActivity(myIntent); //Starts the intent activity

			}

		});
		myContactBookButton.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent();

				myIntent.setAction(Intent.ACTION_VIEW);
				myIntent.setData(android.provider.Contacts.People.CONTENT_URI); // Link to Contact Book
				startActivity(myIntent);

			}

		});
	}

}
