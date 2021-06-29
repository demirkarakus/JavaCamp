package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer ind = new IndividualCustomer();
		ind.customerNumber = "10";
		
		CorporateCustomer corp = new CorporateCustomer();
		corp.customerNumber = "20";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(corp);
		//customerManager.add(ind);
		
		Customer[] customers = {ind, corp};
		customerManager.addMultiple(customers);
	}

}
