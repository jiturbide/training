package com.cert8.objective01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        //int z = (int x, int y) -> x + y;
        //(x, y) -> {System.out.println(x+y); };
        
    }
}


interface Envolvible<T extends Collection>{
    public T wrap(Object[] objects);
}

class Envoltorio implements Envolvible<List>{

    @Override
    public List wrap(Object[] objects) {
        //return new ArrayList().toArray(objects);
        return null;
    }
    
} 