package sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortedMapByKey {
	public static void main(String[] args) {
        // Original data
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "Four");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(1, "One");
        
        System.out.println("Original map: " + map);
 
        // Convert list from map
        List<Map.Entry<Integer, String>> list1 = new ArrayList<>(map.entrySet());
 
        // Create a comparator to sort by key
        Comparator<Entry<Integer, String>> keyComparator = new Comparator<Entry<Integer, String>>() {
            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        };
 
        // Sorting a List
        Collections.sort(list1, keyComparator);
 
        // Convert List to Map
        // **** Must use linkedHashMap (cac phan tu sap xep theo thu tu them vao)
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list1) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted map: " + sortedMap);
    }
}
