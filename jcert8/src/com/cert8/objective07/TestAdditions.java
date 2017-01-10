/*
 * Curso OCJP7
 * @author jiturbide
 * @date   31/12/2016
 */
package com.cert8.objective07;

import java.util.Calendar;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestAdditions {
    public static void main(String[] args) {
        Predicate <Boolean> test = b -> { return b; };
        Predicate <Boolean> test2 = test::test;
        
        System.out.println("" + test2.test(Boolean.TRUE));
        
        Predicate <String []> emptyArgs =  (String [] array) -> { return array == null || array.length == 0;} ;
        
        Supplier <String> createString = String::new;
        Supplier <Calendar> createCalendar = Calendar::getInstance;
        
    }
}
