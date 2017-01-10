/*
 * Curso OCJP7
 * @author jiturbide
 * @date   31/08/2016
 */
package com.enthuware.lambdaoperations;

import java.util.Arrays;
import java.util.List;

public class Question_8_2_1786 {

    public static void main(String[] args) {

        //What will the following code print when compiled and run?
        List<String> values = Arrays.asList("Java EE", "C#", "Python");
        boolean flag = values.stream().allMatch(str -> {
            System.out.println("Testing: " + str);
            return str.equals("Java");
        });
        System.out.println(flag);

    } 

}
