package be.project.mylibrary;

import java.time.LocalDate;
import java.util.UUID;

public class GraphicNovel extends Book {
	private String cartoonist;
	private String color;
	
	
	public GraphicNovel(UUID id, String title, String author, int totalPages, int loanPeriod, double rentalPrice,
			LocalDate borowingDate, String language, Person person, String cartoonist, String color) {
		super(id, title, author, totalPages, loanPeriod, rentalPrice, borowingDate, language, person);
		this.cartoonist = cartoonist;
		this.color = color;
	}
	
	public String getCartoonist() {
		return cartoonist;
	}
	public void setCartoonist(String cartoonist) {
		this.cartoonist = cartoonist;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


}
