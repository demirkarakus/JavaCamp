package homework1Day5.business.abstracts;

import homework1Day5.entities.concretes.User;

public interface UserCheckService {
	boolean checkEmail(User user);
	boolean checkPassword(User user);
	boolean checkFirstname(User user);
	boolean checkLastname(User user);
	boolean checkUserInfo(User user);
	boolean checkUniqueEmail(User user);
}
