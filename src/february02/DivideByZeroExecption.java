package february02;

import java.util.Scanner;

public class DivideByZeroExecption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = obj.nextInt();
		
		int z = 0;
		String a = "";
		
		System.out.println("Enter another number");
		int y = obj.nextInt();
		
		try {
			z = x/y;
			try {
				System.out.println(a.charAt(1));
			}
			catch(Exception m) {
				System.out.println("Exception occured: " + m.getMessage());
			}
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Exception occured: " + e.getMessage());
			//z = 5;
		}
		
		System.out.println("Value of z is: " + z);
		
		for(int i = 1; i<=z; i++) {
			System.out.println(i);
		}

	}

}
