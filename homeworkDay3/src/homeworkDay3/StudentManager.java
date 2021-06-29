package homeworkDay3;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Student Added.");
		System.out.println("Id : " + user.getId() + " Name : "+ user.getFirstName());
	}
}
