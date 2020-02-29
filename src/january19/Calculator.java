package january19;

public class Calculator {
	
	
	int x;
	int y;
	
	public Calculator(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	
	void add() {
		System.out.println("Addition is: " + (x+y));
	}
	
	void subtract() {
		System.out.println("Subtraction is: " + (x-y));
	}
	
	void multiply() {
		System.out.println("Multiplication is: " + (x*y));
	}
	
	void divide() {
		System.out.println("Division is: " + (x/y));
	}

}
