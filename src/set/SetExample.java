package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		// Create a HashSet
		Set<Integer> hashsetInt = new HashSet<>();
		hashsetInt.add(15);
		hashsetInt.add(10);
		hashsetInt.add(25);
		hashsetInt.add(18);
		hashsetInt.add(6);
		hashsetInt.add(52);
		
		// Create a TreeSet
		Set<Integer> treesetInt = new TreeSet<>();
		treesetInt.add(15);
		treesetInt.add(10);
		treesetInt.add(25);
		treesetInt.add(18);
		treesetInt.add(6);
		treesetInt.add(52);
		
		System.out.println("Cac phan tu trong hashsetInt: ");
		System.out.println(hashsetInt);
		System.out.println("Cac phan tu trong treesetInt: ");
		System.out.println(treesetInt);
	}
}
