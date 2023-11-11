package exceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name: ");
		String userName;
		userName = sc.nextLine();
		if (userName.equals("NotBickey")) {
			try {
				Exception exc = new Exception("You are restricted.");
				throw exc; // throw keyword used to throw an exception
			} catch (Exception e) {
				System.out.println("Exception: " + e.getMessage());// above exc is caught here.
			}
		} else {
			System.out.println("Hi " + userName + ". You are successfully signed in.\n");
		}

	}

}
