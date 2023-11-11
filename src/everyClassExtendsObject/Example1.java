package everyClassExtendsObject;

public class Example1 extends Object {

	// Every class in java extends super class Object , so there are certain rules
	// we need to follow
	
	String name = "Bickey";

	public Example1() {

	}

	public void print() {
		System.out.println("Every Class in Java extends Object Class.");
	}

	//toString() method is coming from Object Class 
	@Override
	public String toString() {
		return "Example1 [name=" + name + "]";
	}
}
