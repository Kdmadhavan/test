package Methods;

import java.util.Scanner;

public class ReturnType {
  //Return type may be a primitive data type or void type
	//int,float,double or any refrernce type
	public int square(int num) {
	
		int result=num*num;
		return result;
	}
	
	
	public static void main(String[] args) {
		//create an object of the class ReturnType
		ReturnType r= new ReturnType();
		//call the method using object reference variable.since the return type of this method
		int squareofnumber=r.square(25);
		System.out.println("The square value is "+squareofnumber);
	}
	
	
}
