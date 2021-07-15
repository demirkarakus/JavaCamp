package homework1Day5.business.concretes;

import java.util.regex.Pattern;

import homework1Day5.business.abstracts.UserCheckService;
import homework1Day5.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	private static final String eMailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	private String uniqueEmail = "abc@abc.com";

	@Override
	public boolean checkEmail(User user) {
		Pattern pattern = Pattern.compile(eMailPattern, Pattern.CASE_INSENSITIVE);

		if (pattern.matcher(user.geteMail()).find() == false) {
			System.out.println("Please check email address!");
			return false;
		} else {
			System.out.println("E-mail success.");
			return true;
		}
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Please check your password! Password must be at least 6 characters.");
			return false;
		} else {
			System.out.println("Password success.");
			return true;
		}
	}

	@Override
	public boolean checkFirstname(User user) {
		if (user.getFirstName().length() < 3) {
			System.out.println("Please check your firstname! Firstname must be at least 3 characters.");
			return false;
		} else {
			System.out.println("Firstname success.");
			return true;
		}
	}

	@Override
	public boolean checkLastname(User user) {
		if (user.getLastName().length() < 3) {
			System.out.println("Please check your lastname! Lastname must be at least 3 characters.");
			return false;
		} else {
			System.out.println("success.");
			return true;
		}
	}

	@Override
	public boolean checkUniqueEmail(User user) {
		if (uniqueEmail == user.geteMail()) {
			System.out.println("Registered email. Please try another email address.");
			return false;
		} else {
			System.out.println("success.");
			return true;
		}
	}

	@Override
	public boolean checkUserInfo(User user) {
		if ((checkEmail(user) && checkFirstname(user) && checkLastname(user) && checkPassword(user) && checkUniqueEmail(user)) == false) {
			return false;
		} else {
			return true;
		}
	}

}
