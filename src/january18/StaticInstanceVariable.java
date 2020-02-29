package january18;

public class StaticInstanceVariable {
	
	int counter = 0;
	static int counter1 = 0;
	
	void increement() {
		counter++;
		counter1++;
	}
	
	void display() {
		System.out.println("Counter: " + counter);
		System.out.println("Counter1: " + counter1);
	}
	
	
	public static void main(String[] args) {
		
		StaticInstanceVariable obj = new StaticInstanceVariable();
		obj.display();
		obj.increement();
		obj.display();
		
	}
	
	

}
