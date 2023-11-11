package exceptionHandling;

public class ExceptionDemo1 {
//why we need exception?
	public static void main(String[] args) {
		// no compile time error but has runtime error.
		System.out.println("Program Started.\n");
		int num1 = 1;
		int num2 = 0;
		int div = 0;
		System.out.println("Execution stopped before calculating div.\n");
		div = num1 / num2; // -> Arithmetic operation whose result is "infinity"

		System.out.println("Execution stopped after calculating div");
		System.out.println("Result by dividing " + num1 + " by " + num2 + " = " + div);
		System.out.println("------------ The End ------------");

	}

}
