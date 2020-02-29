package january19;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x = 1; x <= 10; x++) {
			
			if(x==5) {
				continue;
			}
			System.out.println(x);
			
		}
		
		System.out.println("Outside for loop");

	}

}
