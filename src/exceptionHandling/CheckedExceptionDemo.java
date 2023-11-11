package exceptionHandling;

public class CheckedExceptionDemo {
	//Checked Exception are the exceptions that are checked by the compiler during the compilation.
	//Examples: IOExceptions, SQLException, FileNotFoundException, etc
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver"); // loading the jdbc driver gives checked exception
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
