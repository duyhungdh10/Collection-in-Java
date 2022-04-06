package set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetExample2 {
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Java");
		linkedlist.add("C++");
		linkedlist.add("PHP");
		linkedlist.add("Java");
		linkedlist.add("Python");
		
		// Create a set from a collection
		Set<String> hashsetStr = new HashSet<>(linkedlist);
		System.out.println("Cac phan tu trong hashsetStr: ");
		System.out.println(hashsetStr);
		
		// Creat a set from a collection with condition.
		Set<String> treesetStr = new TreeSet<>();
		treesetStr = linkedlist.stream().filter(s -> s.startsWith("P")).collect(Collectors.toSet());
		System.out.println("Cac phan tu trong treesetStr: ");
		System.out.println(treesetStr);
		
	}
}
