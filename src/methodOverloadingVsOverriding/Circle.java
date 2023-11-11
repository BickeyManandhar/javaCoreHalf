package methodOverloadingVsOverriding;

public class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("We are drawing circle using Shape.");
		
	}
	
}

