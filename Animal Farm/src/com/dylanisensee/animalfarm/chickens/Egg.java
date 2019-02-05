package com.dylanisensee.animalfarm.chickens;
import java.util.Date;

public class Egg {
	//instance variables (aka properties)
	private int size;
	private Date dateLaid;
	private boolean cracked;
	
	public Egg(int size) {
		this.size = size;
		this.dateLaid = new Date();
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Date getDateLaid() {
		return this.dateLaid;
	}
}
