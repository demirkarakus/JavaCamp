package Concrete;

import Abstract.BaseGameManager;
import Entities.Game;

public class SalesGameManager extends BaseGameManager {
	@Override
	public void add(Game game) {	
		if(game.getId() > 0) {
			super.add(game);
		}else {
			System.out.println("Game could not add.");
		}
	}

	@Override
	public void delete(Game game) {	
		if(game.getId() > 0) {
			super.add(game);
		}else {
			System.out.println("Game could not delete.");
		}
	}

	@Override
	public void update(Game game) {	
		if(game.getId() > 0) {
			super.add(game);
		}else {
			System.out.println("Game could not update.");
		}
	}
}
