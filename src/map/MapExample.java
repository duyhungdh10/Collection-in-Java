package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Java");
		map.put(2, "C++");
		map.put(3, "PHP");
		map.put(4, "python");
		map.put(5, "Java");
		
		Set set = map.keySet();		// Tra doi tuong Set chua cac key
		for(Object key : set) {
			System.out.println(key+ " " + map.get(key));
		}
		System.out.println("------------");
		
		Set entrySet = map.entrySet();	// Tra doi tuong Set chua cac key va value
		for(Object entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println("------------");
		
		System.out.println(entrySet);
		System.out.println("------------");
		
		//Use Map.Entry interface to access elements of Map
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
	}
}
