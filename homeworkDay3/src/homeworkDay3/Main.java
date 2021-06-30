package homeworkDay3;

public class Main {

	public static void main(String[] args) {
				
		Student student1 = new Student();
		student1.setId(1);
		student1.seteMail("mail@adresim.com");
		student1.setFirstName("Vehbi Erbil Karakuş");

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.seteMail("kodlama@kodlama.io");
		instructor1.setFirstName("Engin Demiroğ");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.update(instructor1);
		
		System.out.println("***********************");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.update(student1);
	}
}
