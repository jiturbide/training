package com.enthuware.lambdaoperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question_8_2_1884 {
	public static void main(String[] args) {
		// What will the following code print when compiled and run?

		IntStream is1 = IntStream.range(1, 3);
		IntStream is2 = IntStream.rangeClosed(1, 3);
		IntStream is3 = IntStream.concat(is1, is2);
		//Object val = is3.boxed().collect(Collectors.groupingBy(k -> k)).get(3);
		Stream <Integer> stream = is3.boxed();
		Map <Integer, List<Integer>> map = stream.collect(Collectors.groupingBy(k -> k));
		Object val = map.get(3);
		System.out.println(val);

	}

}
