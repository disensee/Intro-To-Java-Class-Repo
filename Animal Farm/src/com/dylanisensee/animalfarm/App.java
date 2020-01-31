package com.dylanisensee.animalfarm;
import com.dylanisensee.animalfarm.chickens.Chicken;
import com.dylanisensee.animalfarm.chickens.Egg;

public class App {

	public static void main(String[] args) {
		Chicken c1 = new Chicken();
		c1.setName("Pat");
		//System.out.println(c1);
		Egg e1 = c1.layEgg();
		Egg e2 = c1.layEgg();
		Egg e3 = c1.layEgg();
		
		Chicken c2 = new Chicken();
		c2.setName("Carol");
		//System.out.println(c2);
		Egg e4 = c2.layEgg();
		Egg e5 = c2.layEgg();
		Egg e6 = c2.layEgg();
		
		/*
		System.out.println(c1.getName() + " just laid " + c1.getTotalEggsLaid() + " eggs");
		System.out.println("First egg: " + e1.getSize() + " " + e1.getDateLaid());
		System.out.println("Second egg: " + e2.getSize() + " " + e2.getDateLaid());
		System.out.println("Third egg: " + e3.getSize() + " " + e3.getDateLaid());
		*/
		
		System.out.println(Chicken.totalEggsLaidByAllChickens);

	}
}