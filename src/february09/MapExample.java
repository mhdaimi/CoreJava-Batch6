package february09;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("PUNE", 411001);
		map.put("pune", 40000001);
		
		System.out.println(map);
		
		/*map.put("Pune", 411014);
		map.put("Mumbai", 400001);
		map.put("Aurangabad", 431001);
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.size());
		
		map.replace("Pune", 411001);
		System.out.println(map);
		
		map.remove("Mumbai");
		System.out.println(map);
		
		System.out.println(map.containsKey("Nasik"));
		System.out.println(map.containsValue(431001));
		
		
		System.out.println(map.get("Punee"));
		
		map.put("Aurangabad", 123456);
		
		System.out.println(map);
		
		
		for (String key : map.keySet()) {
			
			System.out.println("Key: " + key + "   " + "Value: " + map.get(key));
			
		}*/
		
	}

}
