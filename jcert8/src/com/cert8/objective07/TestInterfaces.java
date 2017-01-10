package com.cert8.objective07;


//Improves to Interfaces
//Static methods
//Default methods
//Fenctional interfaces denfinition
public class TestInterfaces {
    public static void main(String[] args) {
        Imprimible.imprimir();
        new Ticket().displayInfo(null);
        
        new Invoice().displayInfo(null);
        
        Imprimible i = new Invoice();
        i.displayInfo(null);
        
        //ImprimibleAColor.imprimir();

        Imprimible imp;
        //imp.imprimir();
    }
}


interface Imprimible {
    public static void imprimir() {
        System.out.println("Imprimiendo");
    }
    default void displayInfo(String anthem) {
        System.out.println("Imprimiendo 1");
    }
    default void displayInfo2(String anthem) {
        System.out.println("Imprimiendo 2");
    }
//    default void imprimir() {
//        System.out.println("Imprimiendo");
//    }    
}

class Ticket implements Imprimible {
    
}

interface ImprimibleAColor extends Imprimible {
    public static void imprimir() {
        System.out.println("Imprimiendo a color");
    }
    default void displayInfo(String anthem) {
        System.out.println("Coloreable 1");
    }
    default void displayInfo2(String anthem) {
        System.out.println("Coloreable 2");
    }
}

class Invoice implements ImprimibleAColor{
    
}