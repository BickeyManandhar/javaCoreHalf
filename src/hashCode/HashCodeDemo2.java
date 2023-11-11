package hashCode;

public class HashCodeDemo2 {

	public static void main(String[] args) {
		Phonee p1 = new Phonee(1200, "Apple");
		System.out.println(p1.hashCode());
		Phonee p2 = new Phonee(1000, "Samsung");
		System.out.println(p2.hashCode());
		
		//p3 and p4 are same but still different hashCode()
		Phonee p3 = new Phonee(800, "Oppo");
		System.out.println(p3.hashCode());
		Phonee p4 = new Phonee(800, "Oppo");
		System.out.println(p4.hashCode());
		//this is false as well
		System.out.println(p3.equals(p4));

	}

}

//multiple class can be created inside a class but we cannot use public access modifier
class Phonee {
	int price;
	String brand;

	public Phonee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phonee(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

}
