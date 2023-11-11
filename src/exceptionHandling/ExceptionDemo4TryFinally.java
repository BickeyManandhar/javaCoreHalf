package exceptionHandling;

public class ExceptionDemo4TryFinally {
//try-finally block example
	public static void main(String[] args) {
		// no compile time error but has runtime error.
		System.out.println("Program Started.\n");
		int num1 = 10;
		int num2 = 0;
		int result = 0;

		try {
			result = num1 / num2; // -> Arithmetic operation whose result is "infinity"
		} 
		finally {
			//this block will be executed no matter if there is exception or not
			System.out.println("\nFinally block still executed even though the exception of try was not caught.\n");
			System.out.println("------------ Program Ended. ------------\n");
		}

//		if (result != 0) {
//			System.out.println("Result of diving " + num1 + " by " + num2 + " is " + result + "\n");
//		} else {
//			System.out.println(
//					"There was an exception so the value of div is as it was initialized i.e. Div = " + result + "\n");
//		}

		

	}

}
