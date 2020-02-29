package january18;

public class Car {
	String color;
	int year;
	static int noOfGear;
	String name;
	
	Car(String name, String color, int year, int noOfGear){
		this.name = name;
		this.color = color;
		this.year = year;
		this.noOfGear = noOfGear;
		
		this.displayDetails();
	}
	
	void displayDetails() {
		System.out.println("The name of the car is: " + name);
		System.out.println("The color of the car is: " + color);
		System.out.println("The year of make is: " + year);
		System.out.println("The car has " + noOfGear + " gears");
		
		this.accelerate();
		
	}
	
	void changeGear(int gearNo) {
		System.out.println("Changing to gear: " + gearNo);
	}
	
	
	int accelerate() {
		this.displayDetails();
		int speed = 20;
		return speed;
	}
	
	
	static void applyBrakes() {
		
		System.out.println("Reducing speed...");
		
	}
	

}
