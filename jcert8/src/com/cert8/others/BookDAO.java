package com.cert8.others;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDAO {

	public static void main(String[] args) {
		Book b = Book.getInstance().author("yomero").id(1).name("The art of rest");
		Book b2 = new Book.Builder().author("yomero").id(1).name("The art of rest").build();
		Book.Builder bb3 = new Book.Builder();
		bb3.publishDate(LocalDate.now());
	}

	public static List<Book> getAllBooks(){
		List<Book> books = new ArrayList<>();

		books.add(Book.getInstance().author("GGMarquez").id(12467).name("100 años de Soledad").publishDate(LocalDate.of(1967,1,1)));
		books.add(Book.getInstance().author("Juan Rulfo").id(29860).name("El Llano en Llamas").publishDate(LocalDate.of(1953,Month.JANUARY,1)));
		books.add(Book.getInstance().author("Vargas Llosa").id(1232).name("La Dictadura Perfecta").publishDate(LocalDate.of(1970,1,1)));
		books.add(Book.getInstance().author("Maquiavelo").id(1576).name("El Principe").publishDate(LocalDate.of(1513,Month.JUNE,1)));
		books.add(Book.getInstance().author("Carlos Fuentes").id(9526).name("Aura").publishDate(LocalDate.of(1962,Month.FEBRUARY,1)));
		books.add(Book.getInstance().author("Atila").id(435).name("Atila").publishDate(LocalDate.of(1900,Month.FEBRUARY,1)));
		books.add(Book.getInstance().author("John Kenneth").id(9765).name("Mexico Barbaro").publishDate(LocalDate.of(1912,Month.FEBRUARY,1)));
		books.add(Book.getInstance().author("Marquez").id(7654).name("El Coronel no tiene quien le escriba").publishDate(LocalDate.of(1961,Month.FEBRUARY,1)));
		books.add(Book.getInstance().author("Rod Jhonson").id(17654).name("EE apps with Spring").publishDate(LocalDate.of(2002,Month.FEBRUARY,1)));
		
		return books;
	}

}
