package january12;

public class Execution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike lml = new Bike();
		lml.displayName();
		lml.displaySpeed(100);
		int gears = lml.returnGear();
		System.out.println("The number of gears are: " + gears);

	}

}
