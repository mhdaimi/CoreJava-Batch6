package january12;

public class NewBike {
	String name;
	int speed;
	int gears;
	
	NewBike(String iName, int iSpeed, int iGears){
		name = iName;
		speed = iSpeed;
		gears = iGears;
	}
	
	void displayName() {
		System.out.println("The name of bike is: " + name);
	}
	
	void displaySpeed() {
		System.out.println("The max speed is: " + speed);
	}
	
	int returnGear() {
		return gears;
	}
	
}
