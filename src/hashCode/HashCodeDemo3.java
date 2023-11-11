package hashCode;

import java.util.Objects;

public class HashCodeDemo3 {

	public static void main(String[] args) {
		Phone p1 = new Phone(1200, "Apple");
		System.out.println(p1.hashCode());
		Phone p2 = new Phone(1000, "Samsung");
		System.out.println(p2.hashCode());

		// p3 and p4 are same and we have same hashCode() because we override hashCode()
		Phone p3 = new Phone(800, "Oppo");
		System.out.println(p3.hashCode());
		Phone p4 = new Phone(800, "Oppo");
		System.out.println(p4.hashCode());
		// this is now true because we override equals()
		System.out.println(p3.equals(p4));

	}

}

//multiple class can be created inside a class but we cannot use public access modifier
class Phone {
	int price;
	String brand;

	@Override
	public int hashCode() {
		return Objects.hash(brand, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(brand, other.brand) && price == other.price;
	}

	

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

}
