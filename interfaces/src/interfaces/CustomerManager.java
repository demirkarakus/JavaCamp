package interfaces;

public class CustomerManager {

	private Logger[] loggers;
		
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//loosly or tightly coupled
	public void add(Customer customer) {
		System.out.println("Customer added. Name : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted. Name : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
}
