package january12;

public class Execution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewBike pulsar = new NewBike("Bajaj Pulsar", 200, 6);
		
		pulsar.displayName();
		pulsar.displaySpeed();
		int gears = pulsar.returnGear();
		System.out.println("The number of gears is: " + gears);

	}

}
