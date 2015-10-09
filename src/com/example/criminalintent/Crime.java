package com.example.criminalintent;

import java.util.Date;
import java.util.UUID;

import android.R.anim;

public class Crime {
private UUID mId;
private String mTitle;
private Date mDate;
private boolean isSolved;
public Crime()
{
	mId=UUID.randomUUID();
	mDate=new Date();
}
public Date getmDate() {
	return mDate;
}
public void setmDate(Date mDate) {
	this.mDate = mDate;
}
public boolean isSolved() {
	return isSolved;
}
public void setSolved(boolean isSolved) {
	this.isSolved = isSolved;
}

public String getmTitle() {
	return mTitle;
}
public void setmTitle(String mTitle) {
	this.mTitle = mTitle;
}
public UUID getmId() {
	return mId;
}
@Override
	public String toString() {
	return mTitle;
	}
}
