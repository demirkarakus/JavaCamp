package Entities;

public class Campain {
	private int Id;
	private String campainName;
	private String campainAmount;
	private int campainLastDate;
	
	public Campain(int id, String campainName, String campainAmount, int campainLastDate) {
		Id = id;
		this.campainName = campainName;
		this.campainAmount = campainAmount;
		this.campainLastDate = campainLastDate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCampainName() {
		return campainName;
	}

	public void setCampainName(String campainName) {
		this.campainName = campainName;
	}

	public String getCampainAmount() {
		return campainAmount;
	}

	public void setCampainAmount(String campainAmount) {
		this.campainAmount = campainAmount;
	}

	public int getCampainLastDate() {
		return campainLastDate;
	}

	public void setCampainLastDate(int campainLastDate) {
		this.campainLastDate = campainLastDate;
	}
	
}
