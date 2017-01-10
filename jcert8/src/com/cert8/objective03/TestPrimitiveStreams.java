package com.cert8.objective03;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TestPrimitiveStreams {

	public static void main(String[] args) {
		IntStream is = IntStream.range(1,4);
		//is.forEach(i -> System.out.println(i));
		int sum = is.reduce(0, (a,b) -> a+b);
		System.out.println("sum:" + sum);
		
		System.out.println("--------------------");
		is = IntStream.rangeClosed(1,4);
		//is.forEach(System.out::println);
		OptionalInt sum0 = is.reduce((a, b)->a+b); 
		System.out.println(sum0.orElse(0));
	}

}
