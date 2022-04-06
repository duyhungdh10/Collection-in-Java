package list;


import java.util.Comparator;

public class Sort {


	public static void InsertionSort(Comparator comparator, Object[] object) {
		InsertionSort(comparator, object, 0, object.length - 1);
	}
	
	static void swap(Object[] object, int firstChild, int lastChild) {
		Object temp = object[firstChild];
		object[firstChild] = object[lastChild];
		object[lastChild] = temp;
	}
	
	static void InsertionSort(Comparator comparator, Object[] object, int start,
			int end) {
		for (int i = start + 1; i <= end; i++) {
			int j = i;
			while (j > 0 && comparator.compare(object[j], object[j - 1]) < 0) {
				swap(object, j, j - 1);
				j--;
			}
		}
	}
}
