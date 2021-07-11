package Abstract;

import Entities.Game;

public class BaseGameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Added to DB : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Deleted to DB : " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Updated on DB : " + game.getGameName());
		
	}

}
