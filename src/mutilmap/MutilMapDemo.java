package mutilmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import comparator.Person;

public class MutilMapDemo {
	public static void main(String[] args) {
		Person p1 = new Person(1, "Hung");
		Person p2 = new Person(2, "Huy");
		Person p3 = new Person(3, "Huyen");
		Person p4 = new Person(4, "Quang");
		Person p5 = new Person(5, "Anh");
		
		// Use map
		Map<String, List<Person>> personMap = new HashMap<>();
		
		List<Person> listPer1 = new ArrayList<>();
		listPer1.add(p1);
		listPer1.add(p2);
		
		List<Person> listPer2 = new ArrayList<>();
		listPer2.add(p3);
		listPer2.add(p4);
		listPer2.add(p5);
		
		personMap.put("list1", listPer1);
		personMap.put("list2", listPer2);
		
		// Use Multimap
        Multimap<String, Person> personMultimap = ArrayListMultimap.create();
        personMultimap.put("list1", p1);
        personMultimap.put("list1", p2);	// same key, 1 key - n value (List)
        personMultimap.put("list2", p3);
        personMultimap.put("list2", p4);
        personMultimap.put("list2", p5);
        
        System.out.println(personMap);		// {list1=[1 - Hung, 2 - Huy], list2=[3 - Huyen, 4 - Quang, 5 - Anh]}
        System.out.println(personMultimap);	// {list1=[1 - Hung, 2 - Huy], list2=[3 - Huyen, 4 - Quang, 5 - Anh]}

	}
}
