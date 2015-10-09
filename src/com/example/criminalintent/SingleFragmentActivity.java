package com.example.criminalintent;


import android.support.v4.app.*;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public abstract class SingleFragmentActivity extends FragmentActivity {
protected abstract Fragment creatFragment();
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment);
        FragmentManager fm=getSupportFragmentManager();
        Fragment fragment=fm.findFragmentById(R.id.fragmentcontainer);
        if (fragment==null) {
        	fragment=creatFragment();
        	fm.beginTransaction().add(R.id.fragmentcontainer,fragment).commit();
			
		}
	}

}
