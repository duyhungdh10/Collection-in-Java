package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Java");
		linkedlist.add("C++");
		linkedlist.add("PHP");
		linkedlist.add("Java");
		linkedlist.add("Python");
		
		//Show list with Iterator
		Iterator<String> itr = linkedlist.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		System.out.println();
		
		linkedlist.addFirst("C#");
		linkedlist.addLast("Android");
		
		//Show list with for each
		for(String str : linkedlist) {
			System.out.print(str + ", ");
		}
		System.out.println("\n--------------");
		
		// Create new list
		LinkedList<String> linkedlist2 = new LinkedList<String>();
		linkedlist2.addAll(linkedlist);
		linkedlist2.add(2, "Kotlin");
		
		for(String str : linkedlist2) {
			System.out.print(str + ", ");
		}
		
		System.out.println("\n--------------");
		
		System.out.println(linkedlist2.get(2));
	}
}
