/*
 * Curso OCJP7
 * @author jiturbide
 * @date   31/12/2016
 */
package com.cert8.objective02;
        
//import java.util.function.ToIntFunction;

public class TestBuiltInFunctions {
    public static void main(String[] args) {
        String s2 = "";
        ToIntFunction <String> toInt = (String s) -> s.length();
    }
}


interface Predicate<T>{
    public boolean test(T arg);
}
interface Consumer<T>{
    public void accept(T arg);
}
interface Supplier<T>{
    public T get();
}
interface Function<T, R> {
    public R apply (T arg);
}
//Primitive Transformation
interface ToDoubleFunction<T>{
    public double appyAsDouble(T arg);
}
interface DoubleFunction<R>{
    public R apply(double value);
}
/**/
interface ToIntFunction<T>{
    public int apply(T t);
}
/**/