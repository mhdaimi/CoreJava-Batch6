package january26;

public class Diff21 {
	
	public int diff21(int num) {
		int result = 0;
		
		if(num<=21) {
			result = 21-num;
		} else {
			result = 2 * (num-21);
		}
		
		return result;
	}

}
