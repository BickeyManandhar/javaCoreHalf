package hashCode;

public class HashCodeDemo4 {

	public static void main(String[] args) {
		// Hashcode does not work for Integer as it gives same value as the variable
		Integer num1 = 12345;
		System.out.println(num1.hashCode());

		Integer num2 = 12345;
		System.out.println(num2.hashCode());

	}

}
