package Course_10_9;

public class Course {
	  private String courseName;
	  private String[] students = new String[100];
	  private int numberOfStudents = 0;
	    
	  public Course(String courseName) {
	    this.courseName = courseName;
	  }
	  
	  public void addStudent(String student) {
		  if(numberOfStudents >= students.length) {
				String[] temp = new String[students.length * 2];
				System.arraycopy(students, 0, temp, 0, students.length);
				students = temp;
			}
		  students[numberOfStudents++] = student;
	  }
	  
	  public String[] getStudents() {
	    return students;
	  }

	  public int getNumberOfStudents() {
	    return numberOfStudents;
	  }  

	  public String getCourseName() {
	    return courseName;
	  }  
	  
	  public void dropStudent(String student) {
		  int index = 0;
		  for(int i = 0; i <  numberOfStudents; ++i) {
			  if(students[i] == student) {
				  index = i;
				  break;
			  }
		  }
		  if(index == numberOfStudents - 1)
			 --numberOfStudents;
		  else {
			  String temp = students[numberOfStudents - 1];
			  students[index] = temp;
			  --numberOfStudents;
		  }
	  }
	  
	  public void clear() {
		  numberOfStudents =  0;
	  }
	  
}

