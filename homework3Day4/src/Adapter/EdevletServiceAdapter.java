package Adapter;

import Abstract.UserCheckService;
import Entities.User;

public class EdevletServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealUser(User user) {
		return true;
	}

}
