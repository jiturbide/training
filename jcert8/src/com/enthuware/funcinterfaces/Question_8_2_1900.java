package com.enthuware.funcinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Question_8_2_1900 {

	public static void main(String[] args) {
		List<String> letters = Arrays.asList("j", "a", "v","a");

		//1
		letters.forEach(letter->letter.toUpperCase()); letters.forEach(System.out::print);
		//2
//		UnaryOperator<String> uo = str->str.toUpperCase(); 
//		letters.forEach(uo); 
//		letters.forEach(System.out::print);
		//3
		System.out.println("3----");
		UnaryOperator<String> uo = str->str.toUpperCase(); 
		letters.replaceAll(uo); 
		letters.forEach(System.out::print);
		//4
		System.out.println("4----");
		letters.forEach(letter->System.out.print(letter.toUpperCase()));
		//5
		System.out.println("5----");
		System.out.print(letters.stream().collect(Collectors.joining()).toUpperCase());
		//6
		System.out.println("6----");
		//System.out.print(letters.stream().collect(Collectors.joining(letter->letter.toUpperCase())));
	}

}
