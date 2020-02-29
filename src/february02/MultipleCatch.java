package february02;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string");
		String a = obj.nextLine();
		
		String b = null;
		
		
		try{
			System.out.println(b.length());
			System.out.println(a.charAt(6));
		}
		catch(StringIndexOutOfBoundsException s) {
			System.out.println("Exception: " + s.getMessage());
			int lenght = a.length();
			System.out.println("max lenght of string is: " + lenght);
		}
		catch(NullPointerException n) {
			System.out.println("Exception: " + n.getMessage());
			b = "Maharashtra";
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		
		System.out.println("Value of b: " + b);

	}

}
