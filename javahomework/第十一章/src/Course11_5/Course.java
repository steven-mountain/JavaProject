package Course11_5;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String > students = new ArrayList<String>(100);
	private int numberOfStudents;
	
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
		++numberOfStudents;
	}
	
	public ArrayList<String > getStudents(){
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		students.remove(student);
	}
	
}
	