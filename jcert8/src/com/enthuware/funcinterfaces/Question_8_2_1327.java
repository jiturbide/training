package com.enthuware.funcinterfaces;

public class Question_8_2_1327 {

	public static void main(String[] args) {

		//Which of the given options if put at //1 will correctly instantiate objects of various classes defined in the following code?
	}
}

class TestClass {
   public class A{
   }
   public static class B {
   }
   public static void main(String args[]){
      class C{
      }
      new C();
      new TestClass().new A();
      //new TestClass.new B();
      //new TestClass().new A();
   }

}
