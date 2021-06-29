package homeworkDay3;

public class Student extends User{
	private String studentNumber;
	private String studentClass;
	
	public Student() {

	}

	public Student(String studentNumber, String studentClass) {
		this.studentNumber = studentNumber;
		this.studentClass = studentClass;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
}
