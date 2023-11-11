package multilevel_Inheritance;

public class MainClass {
	/*
	 * Multi-level Inheritance: In Java, multi-level inheritance refers to a
	 * scenario where a class inherits from another class, which in turn inherits
	 * from yet another class. This creates a chain or hierarchy of classes. Each
	 * class in the hierarchy inherits the properties and behavior of its parent
	 * class.
	 */

	public static void main(String[] args) {
		GermanShepherd gs = new GermanShepherd();
		gs.breathe(); // inherited from Animal
		gs.bark(); // inherited from Dog
		gs.highlyTrainable(); // inherited from GermanShepherd

	}

}
