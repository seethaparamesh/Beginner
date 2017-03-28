package dao;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	 

	/**
	 * @param other
	 * @return a positive number is greater , negative number is smaller and 0 if equal
	 */
	public int compareTo(Person other) {
		if (other.getAge() > this.age) {
			return 1;
		}
		else if (other.getAge() < this.age) {
			return -1;
		}
		else
			return 0;
	}
	

	
}
