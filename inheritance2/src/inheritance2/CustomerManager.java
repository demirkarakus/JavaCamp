package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		// customer add code
		System.out.println("Customer added.");

		// Soyut sınıflar loglanmaz ve bu şekilde kullanılır : add(Logger logger)
		// DatabaseLogger logger = new DatabaseLogger();

		logger.log();
	}
}
