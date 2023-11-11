package exceptionHandling;

import java.util.Scanner;

public class UsernamePassword {

	private static void userNamePassword() throws Exception {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String uname = sc1.nextLine();
		System.out.print("Enter your password: ");
		String pass = sc1.nextLine();
		if (uname.equals("Bickey") && pass.equals("test@123")) {
			System.out.println("Hi " + uname + " you have sucessfully signed in.");
		} else {
			throw new Exception("Username or password is not correct or you are not signed up.");
		}
	}

	public static void main(String[] args) {
		try {
			userNamePassword();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
