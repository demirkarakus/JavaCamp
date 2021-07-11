package Abstract;

import Entities.Campain;

public class BaseCampainManager implements CampainService {

	@Override
	public void add(Campain campain) {
		System.out.println("Added to DB : " + campain.getCampainName());
		
	}

	@Override
	public void delete(Campain campain) {
		System.out.println("Deleted to DB : " + campain.getCampainName());
		
	}

	@Override
	public void update(Campain campain) {
		System.out.println("Updated on DB : " + campain.getCampainName());
		
	}

}
