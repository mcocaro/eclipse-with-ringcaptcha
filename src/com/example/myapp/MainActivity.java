package com.example.myapp;

import com.thrivecom.ringcaptcha.RingcaptchaApplication;
import com.thrivecom.ringcaptcha.RingcaptchaApplicationHandler;
import com.thrivecom.ringcaptcha.RingcaptchaVerification;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	private static final String APP_KEY = "APP_KEY";
    private static final String API_SECRET = "SECRET_KEY";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		RingcaptchaApplication.onboard(getApplicationContext(), APP_KEY, API_SECRET,new RingcaptchaApplicationHandler() {
			
			@Override
			public void onSuccess(RingcaptchaVerification arg0) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void onCancel() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
