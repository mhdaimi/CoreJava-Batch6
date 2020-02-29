package january12;

public class Execution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodExample obj = new MethodExample();

		obj.display("Pune");
		obj.display("Radical");
		obj.display("Java");
		
		obj.add(10, 20);
		
		int result = obj.add(10, 20);
		System.out.println(result);
	}

}
