package january19;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 25;
		int y = 45;
		int z = 50;
		
		
		System.out.println(! ((x>y) && (x>z))  );
		
		System.out.println(z>x || z < y);
		
		
		boolean result = z>x || z < y;
		
		System.out.println(result);
		
		

	}

}
