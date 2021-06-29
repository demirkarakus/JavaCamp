package homeworkDay3;

public class Instructor extends User{
	private String rating;
	private String numberOfStudents;
	
	public Instructor() {

	}	
	
	public Instructor(String rating, String numberOfStudents) {
		this.rating = rating;
		this.numberOfStudents = numberOfStudents;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(String numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

}
