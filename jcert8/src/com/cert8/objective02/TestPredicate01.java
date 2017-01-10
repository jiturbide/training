/*
 * Curso OCJP7
 * @author jiturbide
 * @date   30/12/2016
 */
package com.cert8.objective02;

import java.util.function.Predicate;

public class TestPredicate01 {
    public static void main(String[] args) {
        Predicate <Object>p = (o)-> {return true;};
        
        System.out.println("p.test(o): " + p.test(null));
    }
}
