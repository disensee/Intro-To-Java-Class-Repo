package com.dylanisensee.animalfarm.chickens;
import java.util.Random;

public class Chicken {
	
	public static int totalEggsLaidByAllChickens = 0;
	
	//instance variable (aka properties)
	private String name = null;
	private int totalEggsLaid = 0;
	
	public Egg layEgg() {
		int min = 1;
		int max = 5;
		Random r = new Random();
		int size = r.nextInt((max - min) + 1) + min;
		
		Egg e = new Egg(size);
		totalEggsLaid++;
		totalEggsLaidByAllChickens++;
		return e;
	}
	
	public int getTotalEggsLaid() {
		return totalEggsLaid;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return this.name;
	}
}
