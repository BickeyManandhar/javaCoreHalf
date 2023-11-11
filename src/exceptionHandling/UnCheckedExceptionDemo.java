package exceptionHandling;

public class UnCheckedExceptionDemo {
// Unchecked Exception are also known as runtime exception that are the exception not checked by compiler
	// Examples : ArithmeticException, NullPointerException,
	// ArrayIndexOutOfBoundsException, etc.
	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 0;
		int div = 0;

		div = num1 / num2;// this does not give exception at compile time but gives at runtime

		System.out.println(div);

	}

}
