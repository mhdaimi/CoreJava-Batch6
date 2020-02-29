package february8;

public class ArrayDeclarations {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		int[] newNumbers = new int[4];
		int index = 3;
		int j = 0;
		
		//System.out.println(numbers[1]);
		
		numbers[0] = 1;
		numbers[1] = 10;
		numbers[2] = 100;
		numbers[3] = 1000;
		numbers[4] = 10000;
		
		for(int i=0; i < numbers.length; i++) {
			
			if(i == index) {
				continue;
			}
			newNumbers[j] = numbers[i];
			j++;
			
		}
		
		for(int i=0; i < newNumbers.length; i++) {
			System.out.println(newNumbers[i]);
		}
		
		
	}

}
