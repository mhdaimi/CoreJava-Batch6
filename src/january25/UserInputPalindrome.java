package january25;

import java.util.Scanner;

public class UserInputPalindrome {
	static Scanner obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj = new Scanner(System.in);
		int number, rev;
		String userInput;
		 number= userInput();
		 rev = reverseNumber(number);
		verifyNumber(number, rev);
		
		System.out.println("Do you want to continue(Yes/No)");
		obj.nextLine();
		userInput= obj.nextLine();
		
		while(! userInput.equals("No")) {
			number = userInput();
			rev = reverseNumber(number);
			verifyNumber(number, rev);
			System.out.println("Do you want to continue(Yes/No)");
			obj.nextLine();
			 userInput= obj.nextLine();
		}
		
		
	}
	
	static void verifyNumber(int number, int rev) {
		if(number == rev) {
			System.out.println("Given number is palindrome: " + number);
		} else {
			System.out.println("Given number is not palindrome");
		}
	}
	
	static int userInput() {
		System.out.println("Enter a number to check if its palindrome");
		return obj.nextInt();
	}
	
	static int reverseNumber(int number) {
		int rev = 0;
		int temp = 0;
		int num = number;
		while(num >0){
			temp = num%10;
			rev = (rev*10) + temp;
			num=num/10;
		}
		return rev;
	}

}
