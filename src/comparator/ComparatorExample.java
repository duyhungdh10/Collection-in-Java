package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
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
		
		
		// List Person sort by name
		
//		Collections.sort(listPerson, new Comparator<Person>() {
//			@Override
//			public int compare(Person ps1, Person ps2) {
//				return ps1.getName().compareTo(ps2.getName());
//			}
//		});
		
		
		listPerson.sort(new Comparator<Person>() {
			@Override
			public int compare(Person ps1, Person ps2) {
				return ps1.getName().compareTo(ps2.getName());
			}
		});
		
		
		/* Lambda
		Collections.sort(listPerson, (Person ps1, Person ps2) -> {
			return ps1.getName().compareTo(ps2.getName());
		});
		------
		
		Collections.sort(listPerson, (ps1,  ps2) -> {
			return ps1.getName().compareTo(ps2.getName());
		});
		------
		
		Comparator<Person> com = (p1, p2) -> {
			return p1.getName().compareTo(p2.getName());
		};
		Collections.sort(listPerson, com);
		
		*/
		
		System.out.println("List Person sort by name.");
		listPerson.forEach(p -> System.out.println(p.toString()));
		System.out.println("---------------------");
		

		// List Person sort by id
		Collections.sort(listPerson, new Comparator<Person>() {
			@Override
			public int compare(Person ps1, Person ps2) {
				if (ps1.getId() > ps2.getId()) {
					return 1;
				} else if (ps1.getId() < ps2.getId()) {
					return -1;
				} else
					return 0;
			}
		});
		
		/* Lambda
		Collections.sort(listPerson, ( ps1, ps2) -> {
			if (ps1.getId() > ps2.getId()) {
				return 1;
			} else if (ps1.getId() < ps2.getId()) {
				return -1;
			} else
				return 0;
		});
		*/
		
		System.out.println("List Person sort by id.");
		listPerson.forEach(p -> System.out.println(p.toString()));
		System.out.println("---------------------");
	}
}
