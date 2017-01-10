package com.enthuware.lambdaoperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Question_8_3_1914 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\tmp\\input.txt";
		Files.lines(Paths.get(path)).forEach(l->System.out.println(l));
	}

}
