package hashCode;

public class HashCodeDemo1 {

	public static void main(String[] args) {
		String name1 = "Bickey";
		System.out.println(name1.hashCode());

		String name2 = "Bickey";
		System.out.println(name2.hashCode());

		String name3 = new String("Bickey");
		System.out.println(name3.hashCode()); // why we are still getting same hashCode()?

		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name3));// this is true also

		// name1, name2 and name3 has same hashCode() value

	}

}
