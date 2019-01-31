package com.dylanisensee.animalfarm.chickens;
import java.util.Date;

public class Egg {
	//instance variables (aka properties)
	public int size;
	public Date dateLaid;
	public boolean cracked;
	
	public Egg(int size) {
		this.size = size;
		this.dateLaid = new Date();
	}
}
