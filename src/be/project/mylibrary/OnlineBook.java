package be.project.mylibrary;

import java.time.LocalDate;
import java.util.UUID;

public class OnlineBook extends Book {
	private int maxPeople;
	private String content;
	
	public OnlineBook(UUID id, String title, String author, int totalPages, int loanPeriod, double rentalPrice,
			LocalDate borowingDate, String language, Person person, int maxPeople, String content) {
		super(id, title, author, totalPages, loanPeriod, rentalPrice, borowingDate, language, person);
		this.maxPeople = maxPeople;
		this.content = content;
	}
	
	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public void CheckLoenPeriod() {
		
	}

	public void ReadContent() {
		
	}	
}
	