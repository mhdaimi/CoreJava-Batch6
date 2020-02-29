package january26;

import java.util.Scanner;

public class UserInputPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		Scanner objString = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = obj.nextInt();
		checkNumberPalindrome(num);
		//obj.nextLine();
		System.out.println("Do you want to continue? (yes/no)");
		String userChoice = objString.nextLine();
		
		while(userChoice.equals("yes")) {
			System.out.println("Enter a number");
			num = obj.nextInt();
			checkNumberPalindrome(num);
			//obj.nextLine();
			System.out.println("Do you want to continue? (yes/no)");
			userChoice = objString.nextLine();
		}
		
	}
	
	
	static void checkNumberPalindrome(int num) {
		int rev = 0;
		int temp = 0;
		int number = num;
		while(number >0){
			temp = number%10;
			rev = (rev*10) + temp;
			number=number/10;
		}
		if(num == rev) {
			System.out.println("Given number is palindrome: " + num);
		} else {
			System.out.println("Given number is not palindrome");
		}
	}
	
	

}
