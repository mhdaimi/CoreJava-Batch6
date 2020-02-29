package february09;

import java.util.ArrayList;
import java.util.HashMap;

public class MapWithList {

	public static void main(String[] args) {

		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Amol Palekar");
		list1.add("Finance");
		list1.add("Developer");
		list1.add("Java");
		
		 map.put(11111, list1);
		 
		 System.out.println(map);
		 
		 ArrayList<String> list2 = new ArrayList<>();
		 list2.add("Somya Sharma");
			list2.add("Investment Bank");
			list2.add("Tester");
			list2.add("Selenium");
			
			map.put(22222, list2);
			
			System.out.println(map);
			
			System.out.println(map.get(11111).get(2));
		
	}

}
