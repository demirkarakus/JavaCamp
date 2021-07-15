package homework1Day5.dataAccess.concretes;

import java.util.List;

import homework1Day5.dataAccess.abstracts.UserDao;
import homework1Day5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("User added : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted : " + user.getFirstName());
		
	}

	@Override
	public boolean getEmail(String email) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean getPassword(String password) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
