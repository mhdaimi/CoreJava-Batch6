package january25;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to display the range");
/*		int number = obj.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.println(i);
		}*/
		
		System.out.println("Enter your name");
		String name = obj.nextLine();
		
		System.out.println("Enter your city");
		String city = obj.nextLine();
		
		System.out.println("Enter your pincode");
		int pincode = obj.nextInt();
		
		
		System.out.println("Hello " + name + ", your city is " + city + " pincode is " + pincode);
		
		
		
	}

}
