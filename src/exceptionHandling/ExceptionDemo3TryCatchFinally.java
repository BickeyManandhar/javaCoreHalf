package exceptionHandling;

public class ExceptionDemo3TryCatchFinally {
//try-catch with finally block example
	public static void main(String[] args) {
		// no compile time error but has runtime error.
		System.out.println("Program Started.\n");
		int num1 = 10;
		int num2 = 0;
		int result = 0;

		try {
			result = num1 / num2; // -> Arithmetic operation whose result is "infinity"
			
		} catch (Exception e) {
			//this block of code will be executed if try block throws an exception
			//System.out.println("Exception occurred:" + e.getMessage() + "\n");// provides brief info about the exception
			System.out.println("Exception occurred.\n");
			e.printStackTrace(); // provide detailed information about exception
			System.out.println("Program continued executing even after exception occured.\n");
			return;//main will stop here but finally will still execute but "More...." will not print
		}
		finally {
			//this block will be executed no matter if there is exception or not
			System.out.println("------------ Program Ended. ------------\n");
		}
		
		System.out.println("More....");

	}

}
