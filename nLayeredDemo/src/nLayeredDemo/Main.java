package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo : Spring IoC
		ProductService productService = new ProductManager(new HibernateProductDao());

		Product product = new Product(1, 2, "Apple", 12, 50);
		productService.add(product);
	}

}
