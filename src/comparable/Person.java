package comparable;

public class Person implements Comparable<Person> {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId() + " - " + this.getName();
	}

	// comparator by name
	@Override
	public int compareTo(Person ps) {
		return this.getName().compareTo(ps.getName());
		// return -this.getName().compareTo(ps.getName()); // so sanh nguoc
	}

	/* comparator by id
		@Override
		public int compareTo(Person ps) {
			if (this.getId() > ps.id) {
				return 1;
			} else if (this.getId() < ps.id) {
				return -1;
			} else
				return 0;
		}
	 */
	

}
