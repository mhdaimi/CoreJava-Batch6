package february8;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		
		set.add("Maharashtra");
		set.add("Karnataka");
		set.add("Gujarat");
		set.add("Telangana");
		set.add("Maharashtra");
		set.add("Telangana");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		for (String s : set) {
			System.out.println(s);
		}
		
		
	}

}
