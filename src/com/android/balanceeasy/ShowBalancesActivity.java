package com.android.balanceeasy;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ShowBalancesActivity extends Activity{

	private static final String NETWORK_OPERATOR = "NETWORK_OPERATOR";
	private Button mBalanceView;
	private Button mTariffPlanView;
	private Button mOffersView;
	
	private Button mDataPlanView;
	private Button mDataBalanceView;
	private Button m3gPlansView;
	private Button m2gPlansView;
	private Button mLast3ChargesView;
	private Button mCustomerCareView;
	private Button mQuickRecharge;
	
	
	
	private static final String VODAFONE = "Vodafone";
	private static final String AIRTEL = "Airtel";
	private static final String UNINOR = "Uninor";
	private static final String TATA_DOCOMO = "Tata Docomo";
	private static final String IDEA = "Idea";

	
	private static final String BALANCE = "BALANCE";
	private static final String TARIFF_PLAN_DETAILS = "TARIFF_PLAN_DETAILS";
	private static final String OFFERS = "OFFERS";
	private static final String DATA_PLAN = "DATA_PLAN";
	private static final String DATA_BALANCE = "DATA_BALANCE";
	private static final String THREE_G_PLANS = "THREE_G_PLANS";
	private static final String TWO_G_PLANS = "TWO_G_PLANS";
	private static final String LAST_3_CHARGES = "LAST_3_CHARGES";
	private static final String CUSTOMER_CARE = "CUSTOMER_CARE";
	private static final String QUICK_RECHARGE = "QUICK_RECHARGE";
	
	
	
	
	private Intent callIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_offers);
		final String selectedNetwork = getIntent().getStringExtra(NETWORK_OPERATOR);
		mBalanceView = (Button) findViewById(R.id.balanceView);
		mTariffPlanView = (Button) findViewById(R.id.tariffPlanView);
		mOffersView = (Button) findViewById(R.id.offersView);
		
		mDataPlanView = (Button) findViewById(R.id.dataPlanView);
		mDataBalanceView = (Button) findViewById(R.id.dataBalanceView);
		m3gPlansView = (Button) findViewById(R.id.ThreegPlanView);
		m2gPlansView = (Button) findViewById(R.id.TwogPlanView);
		mLast3ChargesView= (Button) findViewById(R.id.last_3Charges);
		mCustomerCareView =(Button) findViewById(R.id.customerCare);
		mQuickRecharge = (Button) findViewById(R.id.quickRecharge);
		
		setColors(selectedNetwork);
		
		mBalanceView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showBalance(selectedNetwork);
			
			}
		});

		mTariffPlanView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showTariffPlanDetails(selectedNetwork);
			}
		});
		
		mOffersView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showOffers(selectedNetwork);
			}
		});
		
		mDataPlanView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showDataPlans(selectedNetwork);
			}
		});
		
		mDataBalanceView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showDataBalance(selectedNetwork);
			}
		});
		
		m3gPlansView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showThreeGPlans(selectedNetwork);
			}
		});
		m2gPlansView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showTwoGPlans(selectedNetwork);
			}
		});
		mLast3ChargesView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showLast3Charges(selectedNetwork);
			}
		});
		
		mCustomerCareView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				callCustomerCare(selectedNetwork);
			}
		});
		
		mQuickRecharge.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showQuickRecharge(selectedNetwork);
			}
		});
	}
	
	private void showBalance(String networkOperator){
		
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "*111*2" + Uri.encode("#")));
			startActivity(callIntent);
			break;

		case AIRTEL:
			break;
		case UNINOR:
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}
		
	}
	
	private void showTariffPlanDetails(String networkOperator){
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "*111*4*1" + Uri.encode("#")));
			startActivity(callIntent);
			break;

		case AIRTEL:
			break;
		case UNINOR:
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}		
	}
	
	private void showOffers(String networkOperator){
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "*121" + Uri.encode("#")));
			startActivity(callIntent);
			break;

		case AIRTEL:
			break;
		case UNINOR:
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}		
	}
		
	
	private void showDataPlans(String networkOperator) {
		
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "*111*6*1" + Uri.encode("#")));
			startActivity(callIntent);
			break;
			
		case AIRTEL:
			break;
		case UNINOR:
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}
	}

	
	private void showDataBalance(String networkOperator){
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "*111*6*2" + Uri.encode("#")));
			startActivity(callIntent);
			break;

		case AIRTEL:
			break;
		case UNINOR:
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}		
	}
	
	
	private void showThreeGPlans(String networkOperator){
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "*111*6*4" + Uri.encode("#")));
			startActivity(callIntent);
			break;

		case AIRTEL:
			break;
		case UNINOR:
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}		
	}
	
		
	private void showTwoGPlans(String networkOperator){
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "*111*6*3" + Uri.encode("#")));
			startActivity(callIntent);
			break;

		case AIRTEL:
			break;
		case UNINOR:
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}		
	}
	
	
	private void showLast3Charges(String networkOperator){
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "*111*3" + Uri.encode("#")));
			startActivity(callIntent);
			break;

		case AIRTEL:
			break;
		case UNINOR:
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}		
	}
	
	private void callCustomerCare(String networkOperator){
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "111"));
			startActivity(callIntent);
			break;

		case AIRTEL:
			break;
		case UNINOR:
			callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:" + "121"));
			startActivity(callIntent);
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}		
	}
	
	
	private void showQuickRecharge(String networkOperator){
		switch (networkOperator) {
		case VODAFONE:
			callIntent = new Intent(Intent.ACTION_VIEW);
			callIntent.setData(Uri.parse("https://shop.vodafone.in/shop/quickRecharge.jsp"));
			startActivity(callIntent);
			break;

		case AIRTEL:
			break;
		case UNINOR:
			break;
		case TATA_DOCOMO:
			break;
		case IDEA:
			break;
		default:
			break;
		}		
	}
	
	@SuppressLint("NewApi")
	private void setColors(String networkOperator){

		switch (networkOperator) {
		case VODAFONE:
			mBalanceView.setBackgroundColor(getResources().getColor(R.color.Red));
			mTariffPlanView.setBackgroundColor(getResources().getColor(R.color.Red));
			mOffersView.setBackgroundColor(getResources().getColor(R.color.Red));
			
			mDataPlanView.setBackgroundColor(getResources().getColor(R.color.Red));
			mDataBalanceView.setBackgroundColor(getResources().getColor(R.color.Red));
			m3gPlansView.setBackgroundColor(getResources().getColor(R.color.Red));
			m2gPlansView.setBackgroundColor(getResources().getColor(R.color.Red));
			mLast3ChargesView.setBackgroundColor(getResources().getColor(R.color.Red));
			mCustomerCareView.setBackgroundColor(getResources().getColor(R.color.Red));
			mQuickRecharge.setBackgroundColor(getResources().getColor(R.color.Red));
			
			break;

		case AIRTEL:
			mBalanceView.setBackgroundColor(getResources().getColor(R.color.Red));
			mTariffPlanView.setBackgroundColor(getResources().getColor(R.color.Red));
			mOffersView.setBackgroundColor(getResources().getColor(R.color.Red));
			
			mDataPlanView.setBackgroundColor(getResources().getColor(R.color.Red));
			mDataBalanceView.setBackgroundColor(getResources().getColor(R.color.Red));
			m3gPlansView.setBackgroundColor(getResources().getColor(R.color.Red));
			m2gPlansView.setBackgroundColor(getResources().getColor(R.color.Red));
			mLast3ChargesView.setBackgroundColor(getResources().getColor(R.color.Red));
			mCustomerCareView.setBackgroundColor(getResources().getColor(R.color.Red));
			mQuickRecharge.setBackgroundColor(getResources().getColor(R.color.Red));
		
			break;
		case UNINOR:
			mBalanceView.setBackgroundColor(getResources().getColor(R.color.Blue));
			mTariffPlanView.setBackgroundColor(getResources().getColor(R.color.Blue));
			mOffersView.setBackgroundColor(getResources().getColor(R.color.Blue));
			
			mDataPlanView.setBackgroundColor(getResources().getColor(R.color.Blue));
			mDataBalanceView.setBackgroundColor(getResources().getColor(R.color.Blue));
			m3gPlansView.setBackgroundColor(getResources().getColor(R.color.Blue));
			m2gPlansView.setBackgroundColor(getResources().getColor(R.color.Blue));
			mLast3ChargesView.setBackgroundColor(getResources().getColor(R.color.Blue));
			mCustomerCareView.setBackgroundColor(getResources().getColor(R.color.Blue));
			mQuickRecharge.setBackgroundColor(getResources().getColor(R.color.Blue));
		
			break;
		case TATA_DOCOMO:
			mBalanceView.setBackground(getResources().getDrawable(R.drawable.tata_docomo));
			mTariffPlanView.setBackgroundColor(getResources().getColor(R.color.Brown));
			mOffersView.setBackgroundColor(getResources().getColor(R.color.Brown));
			
			mDataPlanView.setBackgroundColor(getResources().getColor(R.color.Brown));
			mDataBalanceView.setBackgroundColor(getResources().getColor(R.color.Brown));
			m3gPlansView.setBackgroundColor(getResources().getColor(R.color.Brown));
			m2gPlansView.setBackgroundColor(getResources().getColor(R.color.Brown));
			mLast3ChargesView.setBackgroundColor(getResources().getColor(R.color.Brown));
			mCustomerCareView.setBackgroundColor(getResources().getColor(R.color.Brown));
			mQuickRecharge.setBackgroundColor(getResources().getColor(R.color.Brown));
		
			break;
		case IDEA:
			mBalanceView.setBackgroundColor(getResources().getColor(R.color.Yellow));
			mBalanceView.setTextColor(getResources().getColor(R.color.Black));
			mTariffPlanView.setBackgroundColor(getResources().getColor(R.color.Yellow));
			mTariffPlanView.setTextColor(getResources().getColor(R.color.Black));
			mOffersView.setBackgroundColor(getResources().getColor(R.color.Yellow));
			mOffersView.setTextColor(getResources().getColor(R.color.Black));
			mDataPlanView.setBackgroundColor(getResources().getColor(R.color.Yellow));
			mDataPlanView.setTextColor(getResources().getColor(R.color.Black));
			mDataBalanceView.setBackgroundColor(getResources().getColor(R.color.Yellow));
			mDataBalanceView.setTextColor(getResources().getColor(R.color.Black));
			m3gPlansView.setBackgroundColor(getResources().getColor(R.color.Yellow));
			m3gPlansView.setTextColor(getResources().getColor(R.color.Black));
			m2gPlansView.setBackgroundColor(getResources().getColor(R.color.Yellow));
			m2gPlansView.setTextColor(getResources().getColor(R.color.Black));
			mLast3ChargesView.setBackgroundColor(getResources().getColor(R.color.Yellow));
			mLast3ChargesView.setTextColor(getResources().getColor(R.color.Black));
			mCustomerCareView.setBackgroundColor(getResources().getColor(R.color.Yellow));
			mCustomerCareView.setTextColor(getResources().getColor(R.color.Black));
			mQuickRecharge.setBackgroundColor(getResources().getColor(R.color.Yellow));
			mQuickRecharge.setTextColor(getResources().getColor(R.color.Black));
			break;
		default:
			break;
		}

		
		
	}
	
}
