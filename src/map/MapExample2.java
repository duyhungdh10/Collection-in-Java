package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample2 {
	public static void main(String[] args) {

		// Cac phan tu khong theo thu tu nao
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "One");
		hashMap.put(0, "Zero");
		hashMap.put(2, "Two");
		hashMap.put(4, "Four");
		hashMap.put(21, "Twenty one");
		hashMap.put(5, "Five");

		// Cac phan tu theo thu tu them vao
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "One");
		linkedHashMap.put(0, "Zero");
		linkedHashMap.put(2, "Two");
		linkedHashMap.put(4, "Four");
		linkedHashMap.put(5, "Five");
		linkedHashMap.put(21, "Twenty one");

		// Cac phan tu sort by key
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "One");
		treeMap.put(0, "Zero");
		treeMap.put(2, "Two");
		treeMap.put(4, "Four");
		treeMap.put(21, "Twenty one");
		treeMap.put(5, "Five");

		System.out.println("Elements in hashMap: ");
		System.out.println(hashMap);
		System.out.println("Elements in linkedHashMap: ");
		System.out.println(linkedHashMap);
		System.out.println("Elements in treeMap: ");
		System.out.println(treeMap);
		System.out.println("-------------------\n");
		
		Set<Map.Entry<Integer, String>> entryhashMap = hashMap.entrySet();
		System.out.println("Cac entry co trong hashMap: ");
		System.out.println(entryhashMap);
		System.out.println();
		
		Set entryTreeMap = treeMap.entrySet();
		System.out.println("Cac entry co trong treeMap: ");
		System.out.println(entryTreeMap);
		System.out.println();
		
		System.out.println("Cac entry co trong linkedHashMap: ");
		linkedHashMap.forEach((Integer keyInt, String valueStr) -> System.out.println(keyInt + " " + valueStr));
	}
}
