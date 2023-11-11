package exceptionHandling;

import java.util.Scanner;

public class ThrowsExceptionDemo {
	// as a programmer we have created an exception
	// but not given a solution to handle it.
	// we are exception that caller will handle it. (caller is main method)

	static private String userInput() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name: ");
		String userName;
		userName = sc.nextLine();

		if (userName.equals("notBickey")) {
			Exception exc = new Exception("Exception: User is not Bickey.");
			throw exc;
		}
		return userName;
	}

	public static void main(String[] args) {
		String uname = null;
		try {
			//caller is handling exception
			uname = userInput(); // when we use throws, someone who is calling the method has to handle the
			// exception.
			//System.out.println(uname);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("End of main method.");

	}

}
