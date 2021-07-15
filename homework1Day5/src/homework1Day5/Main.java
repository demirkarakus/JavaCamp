package homework1Day5;

import homework1Day5.business.abstracts.UserService;
import homework1Day5.business.concretes.MailVerificationManager;
import homework1Day5.business.concretes.UserCheckManager;
import homework1Day5.business.concretes.UserManager;
import homework1Day5.dataAccess.concretes.HibernateUserDao;
import homework1Day5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager(), new MailVerificationManager());
		
		//abc@abc.com addedin users
		User user = new User(1, "Vehbi Erbil", "Karakuş", "abc2@abc.com", "12345678");
		
		System.out.println("Registration ***************************");
		userService.register(user);
		System.out.println();
		System.out.println("Login ***************************");
		userService.login(user);
	}

}
