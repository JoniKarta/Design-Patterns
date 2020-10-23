package Observer;

public class Student implements Observer{

	private String name;
	private String lastName;
	private Subject observable;
	
	public Student(Subject observable, String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.observable = observable;
		observable.registerObserver(this);
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return name;
	}

	@Override
	public void update() {
		System.out.println(name + " Hello!\n" + observable.getState());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
