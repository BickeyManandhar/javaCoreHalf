package abstractionVsInterface;

//Abstraction
/*
 * In Java, both abstraction and interface are used for achieving abstraction and defining contracts, but they serve different purpose.
 * Abstraction refers to the process of hiding complex implementation details and providing a simplified view of functionality. 
 * It is achieved through abstract classes and methods. 
 * An abstract class cannot be instantiated and serves as blueprint for derived classes. 
 * But it can have both concrete and abstract methods.
 */
public abstract class Vehicle {

	public abstract void start(); // abstract method
	public void stop() { //concrete method
		System.out.println("Vehicle stops when applied brake.");
	}
}

