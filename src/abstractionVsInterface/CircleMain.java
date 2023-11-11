package abstractionVsInterface;

public class CircleMain {

	public static void main(String[] args) {
		Shape cir1 = new Circle(5.0); 
		System.out.println("Area: "+cir1.getArea());
		System.out.println("Perimeter: "+cir1.getPrimeter());
		
		Paint cir2 = new Circle();
		cir2.color();
		cir2.draw();

	}

}
