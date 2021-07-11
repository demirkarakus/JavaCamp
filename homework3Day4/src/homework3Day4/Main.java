package homework3Day4;

import Abstract.BaseCampainManager;
import Abstract.BaseGameManager;
import Abstract.BaseUserManager;
import Adapter.EdevletServiceAdapter;
import Concrete.BestCampainManager;
import Concrete.GamerUserManager;
import Concrete.SalesGameManager;
import Entities.Campain;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {

		BaseCampainManager campainManager1 = new BestCampainManager();
		campainManager1.add(new Campain(0, "Summer Campain", "20", 2021));
		campainManager1.update(new Campain(1, "Summer Campain", "10", 2021));
		campainManager1.delete(new Campain(1, "Summer Campain", "10", 2021));
		
		System.out.println(" \n*********************************************** \n");
		
		BaseGameManager gameManager1 = new SalesGameManager();
		gameManager1.add(new Game(0, "GTA5", "Rockstar Games", "90Euro"));
		gameManager1.update(new Game(2, "GTA5", "Rockstar Games", "120Euro"));
		gameManager1.delete(new Game(2, "GTA5", "Rockstar Games", "120Euro"));

		System.out.println(" \n*********************************************** \n");
		
		BaseUserManager userManager1 = new GamerUserManager(new EdevletServiceAdapter());
		userManager1.add(new User(10, "VEHBİ ERBİL", "KARAKUŞ", "111111", 1986));
	}

}
