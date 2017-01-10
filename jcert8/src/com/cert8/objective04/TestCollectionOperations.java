package com.cert8.objective04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollectionOperations {

	public static void main(String[] args) {
		Stream <String>stream01 = Stream.of("Mon", "Tue", "Wed", "Thu", "Fri");
		stream01.forEach(System.out::println);
		System.out.println("-------------");
		stream01 = Stream.of(new String[]{"Mon", "Tue", "Wed", "Thu", "Fri"});
		stream01.sorted().forEach(System.out::println);
		
		System.out.println("-------------");
		stream01 = Arrays.asList(new String[]{"Mon", "Tue", "Wed", "Thu", "Fri"}).stream();
		List <String> list = stream01.filter(s -> s.indexOf("e") > 0).collect(Collectors.toList());
		Stream <String>fromList = list.stream().sequential().parallel().sequential();
		System.out.println("fromList.isParallel(): " + fromList.isParallel());
		fromList.forEach(System.out::println);
		System.out.println("-------------");
		
	}

}
