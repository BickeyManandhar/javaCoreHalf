package sortDataWithCustomClass;

public class MobilePhone implements Comparable<MobilePhone>{

	private String brand;
	private int price;
	private String color;
	
	public MobilePhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobilePhone(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "MobilePhone [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	@Override
	public int compareTo(MobilePhone phone) {
		int x = this.price - phone.price; //sort by price in ascending order
		//int x = phone.price - this.price; //sort by price in descending order
		//return this.brand.compareTo(phone.brand); //this will sort the name from A to Z
		//return phone.brand.compareTo(this.brand);//this will sort the name from Z to A
		return x;
	}
	
}
