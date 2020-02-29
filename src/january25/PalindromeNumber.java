package january25;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int num = 1; num <= 1000; num++) {
			//int num = 1220;
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
				//System.out.println("Given number is not palindrome");
			}
		}
		


	}

}
