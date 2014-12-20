package com.android.balanceeasy;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class SelectNetworkActivity extends ActionBarActivity {

	private static final String NETWORK_OPERATOR = "NETWORK_OPERATOR"; 	
	private Spinner  networkSpinner;
	private Button submitBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		networkSpinner = (Spinner) findViewById(R.id.spinner1);
		submitBtn = (Button) findViewById(R.id.submitBtn);
		
		submitBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SelectNetworkActivity.this, 
						ShowBalancesActivity.class);
				if(networkSpinner.getSelectedItem() !=null){
					intent.putExtra(NETWORK_OPERATOR, String.valueOf(networkSpinner.getSelectedItem()));
					startActivity(intent);
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
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
