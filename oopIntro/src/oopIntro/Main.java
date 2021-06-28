package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenova", 1500, "16 GB Ram", 10);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Toshiba");
		product2.setUnitPrice(12800);
		product2.setDetails("16GB Ram");
		product2.setDiscount(10);

		Product product3 = new Product();
		product3.setId(2);
		product3.setName("Casper");
		product3.setUnitPrice(14500);
		product3.setDetails("32GB Ram");
		product3.setDiscount(10);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		System.out.println("************************************************");

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Araba");
		System.out.println(category1.getName());

		System.out.println("************************************************");

		ProductManager productMan = new ProductManager();
		productMan.addToCart(product1);
		productMan.addToCart(product2);
		productMan.addToCart(product3);

		System.out.println("Ödev 2 ************************************************");

		Courses courses1 = new Courses(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "Engin Demiroğ");
		Courses courses2 = new Courses(2, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "Engin Demiroğ");
		Courses courses3 = new Courses(3, "Programlamaya Giriş için Temel Kurs", "Engin Demiroğ");

		CourseManager courseMan = new CourseManager();
		courseMan.addToLesson(courses1);
		courseMan.addToLesson(courses2);
		courseMan.addToLesson(courses3);

		System.out.println("************************************************");

		Courses[] courses = { courses1, courses2, courses3 };
		for (Courses course : courses) {
			System.out.println(course.courseId + " -> " + course.courseName + " -> " + course.teacherName);
		}
	}
}
