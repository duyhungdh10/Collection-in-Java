package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InitMapWithStaticBlock {
	public static Map<Integer, String> map;
    static {
        map= new HashMap<>();
        map.put(1, "Hai");
        map.put(2, "Hieu");
        map.put(3, "Hong");
    }
    
    
    public static void main(String[] args) {
    	
    	Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
    	
    	entrySet.stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    	
    }
}
