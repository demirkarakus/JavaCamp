package homework1Day5.business.concretes;

import java.util.List;

import homework1Day5.business.abstracts.UserCheckService;
import homework1Day5.business.abstracts.UserService;
import homework1Day5.business.abstracts.VerificationService;
import homework1Day5.dataAccess.abstracts.UserDao;
import homework1Day5.entities.concretes.User;

public class UserManager implements UserService{

	UserDao userDao;
	UserCheckService userCheckService;
	VerificationService  verificationService;
	
	public UserManager(UserDao userDao, UserCheckService userCheckService, VerificationService  verificationService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
	}


	
	@Override
	public void login(User user) {
		if(userDao.getEmail(user.geteMail()) && userDao.getPassword(user.getPassword()) == true) {
			if(verificationService.checkVarificated(user.geteMail()) == true) {
				System.out.println("Loggin success.");
			}else {
				System.out.println("Please check your email verification.");
			}
		}else {
			
			System.out.println("Please check your informations!");
		}
	}

	@Override
	public void register(User user) {
		if(userCheckService.checkUserInfo(user) == true) {
			userDao.add(user);
			verificationService.sendMail(user.geteMail());
			System.out.println(user.getFirstName() + " : added.");
		}else {
			System.out.println("The user could not be added. Try again.");
		}
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}
