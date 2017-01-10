package com.enthuware.funcinterfaces;

import java.util.Arrays;
import java.util.List;

public class Question_8_2_1863 {
	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book("Gone with the wind", "Fiction"),
				new Book("Bourne Ultimatum", "Thriller"), new Book("The Client", "Thriller"));
		Reader r = b -> {
			System.out.println("Reading book " + b.getTitle());
		};
		books.forEach(x -> r.read(x));
	}
}

//interface Reader{ void read(Book b); default void unread(Book b){ } }
//NO interface Reader{ default void read(Book b){ System.out.println("Default read");}; }
//NO abstract class Reader{ abstract void read(Book b); }
interface Reader{ default void read(Book b){ } void unread(Book b); }

class Book {
	private String title;
	private String genre;

	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
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

}