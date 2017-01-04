package com.sun.objetivo04;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.cert8.others.Book;
import com.cert8.others.BookDAO;

public class TestLambdaOperations01 {
	public static void main(String[] args) {
		List <Book> books = BookDAO.getAllBooks();
		
		Consumer <Book>cPeeker = e -> System.out.println("cPeeker: " + e);
		Consumer <Book>cPrinter = e -> System.out.println("cPrinter: " + e);
		Predicate <Book> pOldBook = b -> b.getPublishYear() < 1975;
		Predicate <Book> pYearGT0 = b -> b.getPublishYear() > 2000;
				
		//books.stream().peek(cPeeker).findFirst(b -> b.getPublishYear() < 1900).forEach(cPrinter);
		//Optional <Book> oBookFound = books.stream().peek(cPeeker).filter(pOldBook).peek(cPeeker).findFirst();

		System.out.println("-------------------");
		/** /
		boolean bAllMatch = books.stream().peek(cPeeker).filter(pOldBook).peek(cPeeker).allMatch(pYearGT0);
		System.out.println("bAllMatch: " + bAllMatch);
		/**/
		/** /
		System.out.println("-------------------");
		boolean bNoneMatch = books.stream().peek(cPeeker).filter(pOldBook).peek(cPeeker).noneMatch(pYearGT0);
		System.out.println("bNoneMatch: " + bNoneMatch);
		/**/
		Optional <Book> oBookFound = books.parallelStream().peek(cPeeker).filter(pOldBook).filter(pYearGT0).findAny();
		//System.out.println("Result: " + oBookFound.get());
		System.out.println("Result: " + (oBookFound.isPresent()?oBookFound.get():null));
		
		Comparator <Book>compareIds = (b, b2) -> {return (b.getId() > b2.getId())? 1 : -1; };

		//Sort
		System.out.println("SORTED -----------");
		//books.stream().sorted().peek(cPeeker).forEach(cPeeker);
		books.stream().sorted().forEach(cPeeker);
		System.out.println("-----------");
		//books.stream().sorted(compareIds).forEach(cPeeker);
	}
}
