package february01;

public class NotString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NotString obj = new NotString();
		
		obj.startsWithNot("amol");
		obj.startsWithNot("notValue");
	}
	
	
	
	public void startsWithNot(String value) {
		
		boolean result = value.startsWith("not");
		
		if(result) {
			System.out.println("String starts with not: " + value);
			
		} else {
			System.out.println("String does not starts with not: " + value);
			System.out.println("not" + value);
		}
		
	}

}
