package Course_10_9;

public class CourseTest {
	public static void main(String[] args) {
		Course course = new Course("chinese");
		course.addStudent("Tom");
		course.addStudent("linda");
		course.addStudent("Mike");
		for(int i = 0; i < course.getNumberOfStudents(); ++i) {
			System.out.println(course.getStudents()[i]);
		}
		System.out.println("---------------------");
		System.out.println("drop linda");
		course.dropStudent("linda");
		for(int i = 0; i < course.getNumberOfStudents(); ++i) {
			System.out.println(course.getStudents()[i]);
		}
		
		
	}
}
