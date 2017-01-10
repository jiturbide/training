package com.cert8.others;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Book implements Comparable<Book> {
	protected int id;
	protected String name;
	protected LocalDate publishDate;
	protected String author;
	protected double price;
	
	private Book() {
	}

	private Book(Book.Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.publishDate = builder.publishDate;
		this.author = builder.author;
		this.price = builder.price;
	}

	public Book(int id, String name, LocalDate publishDate, String author, double price) {
		this.id = id;
		this.name = name;
		this.publishDate = publishDate;
		this.author = author;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublishYear() {
		return this.publishDate.getYear();
	}
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public static class Builder {
		protected int id;
		protected String name;
		protected LocalDate publishDate;
		protected String author;
		protected double price;

		public Builder(){}
		
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder publishDate(LocalDate publishDate) {
			this.publishDate = publishDate;
			return this;
		}
		public Builder author(String author) {
			this.author = author;
			return this;
		}
		public Builder price(double price) {
			this.price = price;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}
	
	public static Book getInstance() {
		return new Book(1000, "GG Marquez", LocalDate.of(1967,6,5), "100 años de Soledad", 100.00);
	}
	
	public Book id(int id) {
		this.id = id;
		return this;
	}
	public Book name(String name) {
		this.name = name;
		return this;
	}
	public Book publishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
		return this;
	}
	public Book author(String author) {
		this.author = author;
		return this;
	}

	@Override
	public String toString() {
		//String strPublishDate = new SimpleDateFormat("yyyy-MM-dd").format(this.getPublishDate());
		return "Book [id=" + id + ", name=" + name + ", publishDate=" + publishDate + ", author=" + author + "]";
	}
	
	public int compareTo(Book book) {
		if(this.id > book.getId()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
