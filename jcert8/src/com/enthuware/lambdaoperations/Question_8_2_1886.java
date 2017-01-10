package com.enthuware.lambdaoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question_8_2_1886 {

	public static void main(String[] args) {
		 List<List<Book>> books = Arrays.asList(Arrays.asList( 
				 new Book("Windmills of the Gods", 7.0), 
				 new Book("Tell me your dreams",9.0) ), 
				 Arrays.asList( 
						 new Book("There is a hippy on the highway", 5.0), 
						 new Book("Easy come easy go", 5.0)) );  
		 double d = books.stream()
		 //INSERT CODE HERE //1   
		 .flatMap(bs->bs.stream())
		 //INSERT CODE HERE //2
		 .mapToDouble(book->book.getPrice())
		 .sum(); 
		 
		 Stream<List<Book>> stream = books.stream();
		 Stream <Book> stream2 = stream.flatMap(e -> e.stream());
		 d = stream2.mapToDouble(b->b.getPrice()).sum();
		 System.out.println(d);

	}

}
