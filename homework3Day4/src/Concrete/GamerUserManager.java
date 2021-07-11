package Concrete;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entities.User;

public class GamerUserManager extends BaseUserManager {

	private UserCheckService userCheckService;
	
	public GamerUserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		
		if(user.getId() > 0) {
			super.add(user);
		}else {
			System.out.println("User could not add.");
		}
		
	}

	@Override
	public void delete(User user) {

		if(user.getId() > 0) {
			super.delete(user);
		}else {
			System.out.println("User could not delete.");
		}
		
	}

	@Override
	public void update(User user) {

		if(user.getId() > 0) {
			super.update(user);
		}else {
			System.out.println("User could not update.");
		}
		
	}
	
}
