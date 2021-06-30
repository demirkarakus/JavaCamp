package homeworkDay3;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Instructor Added.");
		System.out.println("Id : " + user.getId() + " Name : "+ user.getFirstName());
	}
	@Override
	public void update(User user) {
		System.out.println("Instructor Updated.");
		System.out.println("Id : " + user.getId() + " Name : "+ user.getFirstName());
	}
}
