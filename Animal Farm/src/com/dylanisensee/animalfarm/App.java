package com.dylanisensee.animalfarm;
import com.dylanisensee.animalfarm.chickens.Chicken;
import com.dylanisensee.animalfarm.chickens.Egg;

public class App {

	public static void main(String[] args) {
		Chicken c1 = new Chicken();
		c1.setName("Pat");
		Egg e1 = c1.layEgg();
		Egg e2 = c1.layEgg();
		Egg e3 = c1.layEgg();
		
		System.out.println(c1.getName() + " just laid " + c1.getTotalEggsLaid() + " eggs");
		System.out.println("First egg: " + e1.size + " " + e1.dateLaid);
		System.out.println("Second egg: " + e2.size + " " + e2.dateLaid);
		System.out.println("Third egg: " + e3.size + " " + e3.dateLaid);
		
		String s1 = "hi";
		String s2 = "hi";
	}

}
