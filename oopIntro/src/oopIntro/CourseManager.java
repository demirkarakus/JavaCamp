package oopIntro;

public class CourseManager {

		public void addToLesson(Courses course) {
			System.out.println(course.courseId + " Id numaralı kurs " + course.courseName + " ismi ile "
					+ course.teacherName + " tarafından derslere eklenmiştir.");
		}
}
