package com.enthuware.lambdaoperations;

class Book {
	private String title;
	private String genre;
	private Double price;

	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	public Book(String title, Double price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	
}