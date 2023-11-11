package methodOverloadingVsOverriding;

public class Shape {
	/*
	 * Method overriding: It is when subclass provides its own implementation of a
	 * method that is already defined in its super class. 
	 * The method in the subclass
	 * must have the same name, return type and parameter list as in super class
	 */
	void draw() {
		System.out.println("Drawing a shape.");
	}
}
