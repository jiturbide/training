package com.cert8.objective03;

import java.util.List;
import java.util.function.Consumer;

import com.cert8.others.Book;
import com.cert8.others.BookDAO;

public class TestStreams {

	public static void main(String[] args) {
		List <Book> lista = BookDAO.getAllBooks();
		
		lista.forEach(b -> System.out.println(b));
		
		System.out.println("------------");
		Consumer consumer = System.out::println;
		Consumer consumer2 = e -> {System.out.println("1. " + e);};
		
		lista.stream().forEach(consumer);
		
		System.out.println("------------");
		lista.parallelStream().forEach(consumer);

		System.out.println("------------ Libros viejos ");
		lista.stream().filter(b -> b.getPublishYear() < 1600).forEach(consumer);
	}

}
