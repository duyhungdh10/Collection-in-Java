package sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
	public static final List<Integer> NUMBERS = Arrays.asList(5, 1, 2, 4, 3, 6, 7, 9, 8);

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>(NUMBERS);
		System.out.println(set1);
	}
}
