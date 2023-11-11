package exceptionHandling;

public class ExceptionDemo2TryCatch {
//try-catch example
	public static void main(String[] args) {
		// no compile time error but has runtime error.
		System.out.println("Program Started.\n");
		int num1 = 10;
		int num2 = 0;
		int div = 0;

		try {
			div = num1 / num2; // -> Arithmetic operation whose result is "infinity"
		} catch (Exception e) {
			//this block of code will be executed if try block throws an exception
			System.out.println("Exception occurred:" + e.getMessage() + "\n");// provides brief info about the exception
			//e.printStackTrace(); // provide detailed information about exception
		}

		if (div != 0) {
			System.out.println("Result of diving " + num1 + " by " + num2 + " is " + div + "\n");
		} else {
			System.out.println(
					"There was an exception so the value of div is as it was initialized i.e. Div = " + div + "\n");
		}

		System.out.println("------------ The End ------------");

	}

}
