package Concrete;

import Abstract.BaseCampainManager;
import Entities.Campain;

public class BestCampainManager extends BaseCampainManager {

	@Override
	public void add(Campain campain) {

		if(campain.getId() > 0) {
			super.add(campain);
		}else {
			System.out.println("Campain could not add.");
		}
		
	}

	@Override
	public void delete(Campain campain) {
		if(campain.getId() > 0) {
			super.delete(campain);
		}else {
			System.out.println("Campain could not delete.");
		}
	}

	@Override
	public void update(Campain campain) {
		if(campain.getId() > 0) {
			super.update(campain);
		}else {
			System.out.println("Campain could not update.");
		}
	}

}
