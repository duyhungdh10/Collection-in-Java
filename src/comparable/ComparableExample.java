package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		
		List<Person> listPerson = new ArrayList<>();
		
		listPerson.add(new Person(11, "B"));
		listPerson.add(new Person(5, "A"));
		listPerson.add(new Person(9, "E"));
		listPerson.add(new Person(21, "G"));
		listPerson.add(new Person(15, "H"));
		listPerson.add(new Person(12, "A"));
		
		System.out.println("List original Person.");
		listPerson.forEach(p -> System.out.println(p.toString()));
		System.out.println("---------------------");
		
		Collections.sort(listPerson);
		
		System.out.println("List Person sorted by name.");
		listPerson.forEach(p -> System.out.println(p.toString()));
	}
}
