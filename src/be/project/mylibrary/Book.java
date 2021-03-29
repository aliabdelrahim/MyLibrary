package be.project.mylibrary;

import java.util.ArrayList;
import java.util.UUID;
import java.io.*;
import java.time.LocalDate;

public abstract class Book {
	protected UUID id;
	private String title;
	private String author;
	private int totalPages;
	private int loanPeriod;
	private double rentalPrice;
	public LocalDate borrowingDate;
	private String language;
	private Person person;
	

	public Book(UUID id, String title, String author, int totalPages, int loanPeriod, double rentalPrice, LocalDate borrowingDate,
			String language, Person person) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.totalPages = totalPages;
		this.loanPeriod = loanPeriod;
		this.rentalPrice = rentalPrice;
		this.borrowingDate = borrowingDate;
		this.language = language;
		this.person = person;
	}
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getTotalPages() {
		return totalPages;
	}


	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}


	public int getLoanPeriod() {
		return loanPeriod;
	}


	public void setLoanPeriod(int loanPeriod) {
		this.loanPeriod = loanPeriod;
	}


	public double getRentalPrice() {
		return rentalPrice;
	}


	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}


	public LocalDate getBorrowingDate() {
		return borrowingDate;
	}


	public void setBorrowingDate(LocalDate borrowingDate) {
		this.borrowingDate = borrowingDate;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public void ComputeReturnDate() {
		
	}


	public void setBorrower(Person person2) {

		
	}


}
