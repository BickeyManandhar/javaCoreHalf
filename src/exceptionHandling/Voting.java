package exceptionHandling;

import java.util.Scanner;

public class Voting {
	private static void legalVotingAge() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int userAge = sc.nextInt();
		if(userAge<18) {
			/* equivalent code
			 * Exception exc = new Exception("Exception: User is not Bickey.");
			   throw exc;
			 */
			throw new Exception("Under age!! You are not allowed to vote.");
			
		}
		else {
			System.out.println("You can vote.");
		}
		
		
	}

	public static void main(String[] args) {
		try {
			legalVotingAge();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
