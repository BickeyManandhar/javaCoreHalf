package abstractionVsInterface;

public class Circle implements Shape, Paint{
	
	double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() { 
		return Math.PI*radius*radius;
	}

	@Override
	public double getPrimeter() {
		return 2*Math.PI*radius ;
	}

	@Override
	public void color() {
		System.out.println("Circle is green in color.");
		
	}

	@Override
	public void draw() {
		System.out.println("We draw circle using Paint.");
		
	}
	
}
