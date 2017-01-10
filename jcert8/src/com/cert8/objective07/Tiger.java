package com.cert8.objective07;

@FunctionalInterface
interface Sprint {
	public void sprint(Animal animal);
	public default void something(){System.out.println("something");}
	public default void something2(){System.out.println("something");}
	public static void something3(){System.out.println("static something3");}
}

public class Tiger implements Sprint {
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast! " + animal.toString());
		this.something();
		this.something2();
		Sprint.something3();
		Tiger.something3();
	}
	
	public static void main(String ... s) {
		new Tiger().sprint(new Animal());
	}
	
	public static void something3(){System.out.println("something3 desde Tiger");}

	public void something(){System.out.println("something desde Tiger");}
}

