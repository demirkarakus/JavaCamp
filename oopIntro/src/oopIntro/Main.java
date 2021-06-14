package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "Lenova";
		product1.unitPrice = 1500;
		product1.details = "16 GB Ram";
		
		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Casper";
		product2.unitPrice = 2500;
		product2.details = "64 GB Ram";
		
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Toshiba";
		product3.unitPrice = 4500;
		product3.details = "128 GB Ram";
		
		Product[] products = {product1, product2, product3};
		
		for(Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println(products.length);

		Category category = new Category(1,"Araba");
		System.out.println(category.name);
		
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

		Courses[] courses = {courses1, courses2, courses3};
		for(Courses course : courses) {
			System.out.println(course.courseId + " -> " + course.courseName + " -> " + course.teacherName);
		}
	}
}
