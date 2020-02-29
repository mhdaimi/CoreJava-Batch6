package january26;

public class NearHundred {
	
	
	public boolean nearHundred(int n) {
		  
		boolean result = false;
		
		if ((n>=90 && n <=110) || (n>=190 && n <=210)) {
			result = true;
		}
		
		return result;
	}

}
