package homework1Day5.business.abstracts;

import java.util.List;

import homework1Day5.entities.concretes.User;

public interface UserService {
	void login(User user);
	void register(User user);
	List<User> getAll();
}
