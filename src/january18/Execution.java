package january18;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Car ciaz = new Car("Maruti Ciaz", "Grey", 2019, 5);
		//Car.noOfGear = 5;
		ciaz.color = "Black";
		ciaz.displayDetails();
		ciaz.changeGear(2);
		int speed = ciaz.accelerate();
		System.out.println("Accelarating speed by: " + speed + " km/hour");
		
		Car.applyBrakes();*/
		
		StaticInstanceVariable obj = new StaticInstanceVariable();
		obj.display();
		obj.increement();
		obj.display();
		
		StaticInstanceVariable obj1 = new StaticInstanceVariable();
		obj1.display();
		obj1.increement();
		obj1.display();
		
		StaticInstanceVariable obj2 = new StaticInstanceVariable();
		obj2.display();
		obj2.increement();
		obj2.display();
		

	}

}
