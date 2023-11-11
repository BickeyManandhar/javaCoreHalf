package abstractionVsInterface;

public class Bus extends Vehicle {

	@Override
	public void start() { // overriding the abstract method in the sub-class and providing its
							// implementation
		System.out.println("Bus started.");

	}
}
