package january26;

public class MissingChar {

	
	public String missingChar(String str, int n) {
		  
		String result = "";
		
		String front = str.substring(0, n);
		String back = str.substring(n+1);
		
		result = front + back;
		
		return result;
	}

	
}
