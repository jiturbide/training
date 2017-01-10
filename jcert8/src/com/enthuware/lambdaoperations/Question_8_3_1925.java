package com.enthuware.lambdaoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question_8_3_1925 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 11, 30, 30, 25, 68);
		
		Stream<Integer> ps1 = list.parallelStream();
		//IntStream ps2 = list.parallelStream();
		//Stream<Integer> ps3 = Arrays.stream(list.toArray()).parallel();
		IntStream  ps31 = Arrays.stream(new int[]{1,2,3}).parallel();
		Stream<Integer> ps4 = list.stream().parallel();

	}

}
