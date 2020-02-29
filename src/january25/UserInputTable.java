package january25;

import java.util.Scanner;

public class UserInputTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to display its math table");
		int number = obj.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(number + " x " + i + " = " + i*number);
			
		}
		
		
		
	}

}
