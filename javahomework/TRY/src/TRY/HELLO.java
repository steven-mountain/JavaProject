package TRY;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class HELLO {

	public static void main(String[] args) {
		TreeSet<Student> hs = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		hs.add(new Student(21, "Mike"));
		hs.add(new Student(22, "Rose"));
		hs.add(new Student(21, "Mike"));
		hs.add(new Student(27, "Mike"));
		hs.add(new Student(22, "Rose"));
		hs.add(new Student(16, "Maria"));
		hs.add(new Student(28, "Mike"));
		hs.add(new Student(16, "Maria"));
		
		for(Student x : hs) {
			System.out.println(x);
		}
		System.out.println(hs.size());
	}
}

class Student implements Comparable<Student>{
	private int age;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age * 7;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((Student) obj).getName().equals(name) && ((Student) obj).getAge() == age;
	}
	
	public boolean equals(Student obj) {
		// TODO Auto-generated method stub
		return name.equals(obj.name) && age == obj.getAge();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (o.getAge() - age) == 0 ? o.getName().compareTo(name) : (o.getAge() - age);
	}
}
