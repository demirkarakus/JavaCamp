package Abstract;

import Entities.User;

public class BaseUserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println("Added to DB : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted to DB : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated to DB : " + user.getFirstName());
		
	}

}
