package com.example.criminalintent;

import java.util.ArrayList;

import com.example.criminalintent.R.string;

import android.support.v4.app.*;
import android.R.anim;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;


public class CrimeListFragment extends ListFragment {
private ArrayList<Crime>mCrimes; 
private static final String TAG="CrimeListFragment"; 
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	getActivity().setTitle(R.string.crime_title);
	mCrimes=CrimeLab.get(getActivity()).getCrimes();
	CrimeAdapter adapter=new CrimeAdapter(mCrimes);
	setListAdapter(adapter);
			
}
@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Crime c=((CrimeAdapter) getListAdapter()).getItem(position);
		//Log.d(TAG,c.getmTitle()+"was clicked");
		Intent i=new Intent(getActivity(),CrimeActivity.class);
		i.putExtra(CrimeFragment.EXTRA_CRIME_ID, c.getmId());
		startActivity(i);
		
	}
public class CrimeAdapter extends ArrayAdapter<Crime> {

	public CrimeAdapter(ArrayList<Crime> crimes) {
		super(getActivity(),0,crimes);
		// TODO Auto-generated constructor stub
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	if(convertView==null)
		convertView=getActivity().getLayoutInflater().inflate(R.layout.list_item_crime, null);
	Crime c=getItem(position);
	TextView titleTextView=(TextView) convertView.findViewById(R.id.crime_list_titletextview);
	TextView dateTextView=(TextView) convertView.findViewById(R.id.crime_lsit_datetextview);
	dateTextView.setText(c.getmDate().toString());
	CheckBox solvedcheckBox=(CheckBox) convertView.findViewById(R.id.crime_list_item_checkbox1);
	solvedcheckBox.setChecked(c.isSolved());
	return convertView;
	}
}
}
