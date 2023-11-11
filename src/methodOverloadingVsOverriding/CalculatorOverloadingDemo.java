package methodOverloadingVsOverriding;

public class CalculatorOverloadingDemo {
	/*
	 * It refers to the ability to define multiple methods with the same name but
	 * different parameters within the same class
	 * Overloaded methods must have different parameter lists, which can differ in the number
	 * of parameters, their types, or their order.
	 * The compiler determines which overloaded method to invoke based on the arguments provided at the call site.
	 * 
	 */
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}

}
