 package com.example.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

public class CrimeFragment extends Fragment {
private Crime mCrime;
private EditText mTitleFiled;
private Button mDateButton;
private CheckBox mSolvedCheckBox;
@Override
public void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	mCrime=new Crime();
}
@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v=inflater.inflate(R.layout.fragment_crime, container, false);
		mTitleFiled=(EditText) v.findViewById(R.id.crime_title);
		mTitleFiled.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
            mCrime.setmTitle(s.toString());		
           
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});
		 mDateButton=(Button) v.findViewById(R.id.crime_date);
         mDateButton.setText(mCrime.getmDate().toString());
         System.out.println(mCrime.getmDate().toString()+"dasdasdasdadasdasdasdwwwa");
         mDateButton.setEnabled(false);
         mSolvedCheckBox=(CheckBox) v.findViewById(R.id.crime_solved);
         mSolvedCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				mCrime.setSolved(isChecked);
			}
		});
		return v;
				
	}
}
