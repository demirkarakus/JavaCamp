package Entities;

public class Game {
	private int Id;
	private String gameName;
	private String gameCategory;
	private String gamePrice;
	
	public Game(int id, String gameName, String gameCategory, String gamePrice) {
		Id = id;
		this.gameName = gameName;
		this.gameCategory = gameCategory;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameCategory() {
		return gameCategory;
	}

	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}

	public String getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(String gamePrice) {
		this.gamePrice = gamePrice;
	}
	
}
