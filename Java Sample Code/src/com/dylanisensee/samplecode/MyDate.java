package com.dylanisensee.samplecode;

import java.util.Date;

public class MyDate {
	
	private int month;
	private int year;
	private int day;
	
	public String toString() {
		return String.format("%d/%d/%d", this.month, this.day, this.year);
	}
	
	public MyDate(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public MyDate() {
		this.year = new Date().getYear() + 1900;
		this.month = new Date().getMonth() + 1;
		this.day = new Date().getDate();
	}
	
	public MyDate(int month, int day) {
		this();
		this.month = month;
		this.day = day;
	}
	
	public MyDate(String str) {
		//assume that str MM/dd/yyyy;
		String[] strCopy = str.split("/");
		this.month = Integer.parseInt(strCopy[0]);
		this.day = Integer.parseInt(strCopy[1]);
		this.year = Integer.parseInt(strCopy[2]);
	}
	

}
