package com.dylanisensee.samplecode;
public class HondaCivic {
	
	
	////////////////////////////////////////////////////////////////
	// main() - we'll use this for testing
	// But look over the entire class before adding code to main()
	////////////////////////////////////////////////////////////////
	public static void main(String[] args) {

		// STEP 1
		// create 2 HondaCivic objects (h1 and h2)
		HondaCivic h1 = new HondaCivic();
		HondaCivic h2 = new HondaCivic();
		
		// STEP 2
		// note that changing a static variable through one instance
		// changes it for all instances
		//h1.MAX_SPEED = 5000; - this line will cause a compiler error because MAX_SPEED is a constant
		System.out.println(h2.MAX_SPEED);
		
		// STEP 3
		// In most cases, static fields are also constants
		// we shouldn't really be able to mess with the MAX_SPEED
		
		
		// STEP 4
		// Although you can access static member through an instance of an object, you shouldn't
		// Instead you should access it directly through the class (notice the warnings).
		// By doing it this way, we can avoid the overhead of instantiating
		// a new object
		// NOTE THAT WE DO NOT NEED TO INSTANTIATE A CLASS TO ACCESS A STATIC VARIABLE
		System.out.println(HondaCivic.FUEL_CAPACITY);
		
		// STEP 5
		// Let's add a static variable that keeps track of how many HondaCivics get instantiated
		// Then we'll add code to the default constructor that increments the variable
		System.out.println("Number of instances: " + HondaCivic.instances);
		
		// Static Methods
		// Making methods static can help your programs to save RAM, because you do not need an object to call a static method
		// Instead you call a static method on a class (put the CLASS name before the dot, not a variable name).
		/* 		
		 	String url = "http://www.google.com";
			String protocol = UrlParser.getProtocol(url);  // notice how we are invoking getProtocol() on the UrlParser class.
			
			// if the methods of the UrlParser class were NOT static, we would have to create an instance/object of the UrlParser class
			// before we could use any of the methods, like this:
			
			UrlParser up = new UrlParser(); // we just created an object that took up some RAM
			String url = "http://www.google.com";
			String protocol = up.getProtocol(url);
		*/
		
		// So, you can call a static method without creating an object (by calling a constructor)
		// Remember that every time you call a constructor, an object is loaded into RAM
		
		// Static members (variables, constants, methods) get loaded into RAM by the JVM when it starts your app.
		// Before the JVM runs the main method, the 'class loader' looks at all the imported classes and loads the static members.
		// Then the code in the main() method runs and that's when your code starts instantiating objects (by calling constructor functions).
		// So static members have noting to do with any instances of objects.
		// BECAUSE OF THIS, YOU CANNOT REFER TO AN INSTANCE VARIABLE IN THE BODY OF A STATIC METHOD
		
	}
		
	
	///////////////////////////////
	// STATIC VARIABLES
	///////////////////////////////
	public static final int MPG = 40;
	public static final int MAX_SPEED = 120;//mph
	public static final int FUEL_CAPACITY = 20;//gallons
	public static int instances;
	
	
	///////////////////////////////
	// INSTANCE VARIABLES
	///////////////////////////////
	private int currentSpeed;
	private float fuel;
	private String color;
	private int id; 
	// WHAT OBSERVATIONS CAN YOU MAKE ABOUT STATIC VS. INSTANCE VARIABLES????????	
	public HondaCivic() {
		HondaCivic.instances++;
	}
	
	//////////////////////////////////////////////////////
	// SETTERS AND GETTERS
	// Note that currentSpeed and fuel are read-only. Why?
	//////////////////////////////////////////////////////
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public float getFuel() {
		return fuel;
	}
		
	
	///////////////////////////////////
	// METHODS
	///////////////////////////////////
	public boolean accelerate(){
		if(fuel > 0 && currentSpeed < MAX_SPEED){
			fuel--;
			currentSpeed++;
			return true;
		}
		return false;
	}
	
	public void decelerate(){
		if(currentSpeed > 0){
			currentSpeed--;
		}
	}
	
	public boolean addFuel(float gallons){
		if(fuel + gallons < FUEL_CAPACITY){
			fuel += gallons;
			return true;
		}
		return false;
	}

}