package com.example.criminalintent;

import android.support.v4.app.*;

public class CrimeListActivity extends SingleFragmentActivity {

	@Override
	protected Fragment creatFragment() {
		return new CrimeListFragment();
	}                                                                

}
