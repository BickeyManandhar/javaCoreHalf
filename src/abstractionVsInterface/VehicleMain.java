package abstractionVsInterface;

public class VehicleMain {

	public static void main(String[] args) {
		//Vehicle v = new Vehicle(); // Vehicle is an abstract class, hence it cannot be instantiated
		Vehicle v1 = new Bus(); // using the up-casting logic
		v1.start();
		v1.stop();

	}

}
