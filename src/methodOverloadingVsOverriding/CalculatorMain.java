package methodOverloadingVsOverriding;

public class CalculatorMain {

	public static void main(String[] args) {
		CalculatorOverloadingDemo calc = new CalculatorOverloadingDemo();
		System.out.println("Using add() that takes and returns double: " + calc.add(2.1, 2.4));
		System.out.println("Using add() that takes and returns int: " + calc.add(1, 6));

	}

}
