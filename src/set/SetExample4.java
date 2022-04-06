package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample4 {
	public static void main(String[] args) {
		Integer[] arrayInt1 = { 2, 10, 4, 8, 5};
		Integer[] arrayInt2 = {10, 5};
		
		List<Integer> listInt1 = Arrays.asList(arrayInt1);
		List<Integer> listInt2 = Arrays.asList(arrayInt2);
		
		Set<Integer> setInt1 = new HashSet<>(listInt1);
		Set<Integer> setInt2 = new HashSet<>(listInt2);
		
		if(setInt1.containsAll(setInt2)) {
			System.out.println("SetInt1 contains setInt2.");
		}
		
		if(setInt1.containsAll(listInt2)) {
			System.out.println("SetInt1 contains listInt2.");
		}
		System.out.println();
		
		System.out.print("setInt1: ");
		System.out.println(setInt1);
		System.out.print("setInt2: ");
		System.out.println(setInt2);
		System.out.println();
		
		setInt1.removeAll(setInt2);
		System.out.print("setInt1: ");
		System.out.println(setInt1);
	}
	
}
