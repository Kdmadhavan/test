package Methods;

public class callbyvalueExample {
   int x=20;
   void modify(int x) {
	   x=x+200;
	   System.out.println("The modified value by using method"+x);
   }
   
   public static void main(String[] args) {
	callbyvalueExample cv=new callbyvalueExample();
	System.out.println("The unmodified value: "+cv.x);
	cv.modify(cv.x);
}
}

/*
 * introduction
 * Data types
 * variables
 * methods
 * objects
 * classes
 * operators
 * contructors
 * access modifiers
 * Arrays
 * static and final keywords
 * 
 * 
 * 
 * 
 * 
 * OBJECT ORIENTED PROGRAMMING
 * ENCAPSULATION
 * POLYMORPHISM
 * INHERTANCE
 * ABSTRACTION
 * 
 * collections,Strings.IO
 * */

