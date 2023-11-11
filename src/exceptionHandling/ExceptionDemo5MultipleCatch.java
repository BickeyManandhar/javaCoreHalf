package exceptionHandling;

public class ExceptionDemo5MultipleCatch {
//try-multiple catch and finally block example
	public static void main(String[] args) {
		// no compile time error but has runtime error.
		System.out.println("Program Started.\n");
		int num1 = 10;
		int num2 = 0;
		int result = 0;

		try {
			result = num1 / num2; // -> Arithmetic operation whose result is "infinity"
		}
		// when we write multiple catch block, The catch block needs to be in descending
		// order which means the exception condition needs to be priority based and
		// general exception block has to be at last
		// NullPointer and ArithmeticException both comes under Runtime Exception so
		// their order does not matter here
		catch (NullPointerException e) {
			// this block of code will be executed if try block throws an exception
			// System.out.println("Exception occurred:" + e.getMessage() + "\n");// provides
			// brief info about the exception
			System.out.println("Exception occurred.\n");
			e.printStackTrace(); // provide detailed information about exception
			System.out.println("This is NullPointerException Block.\n");

		} catch (ArithmeticException e) {
			// this block of code will be executed if try block throws an exception
			// System.out.println("Exception occurred:" + e.getMessage() + "\n");// provides
			// brief info about the exception
			System.out.println("Exception occurred.\n");
			e.printStackTrace(); // provide detailed information about exception
			System.out.println("This is Arithmetic Exception Block.\n");

		} catch (Exception e) {
			// this block of code will be executed if try block throws an exception
			// System.out.println("Exception occurred:" + e.getMessage() + "\n");// provides
			// brief info about the exception
			System.out.println("Exception occurred.\n");
			e.printStackTrace(); // provide detailed information about exception
			System.out.println("This is General Exception Block.\n");
			System.out.println("Program continued executing even after exception occured.\n");

		} finally {
			// this block will be executed no matter if there is exception or not
			System.out.println("\nFinally block still executed even though the exception of try was not caught.\n");
			System.out.println("------------ Program Ended. ------------\n");
		}

	}

}
