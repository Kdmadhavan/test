package exceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	//throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer");
	try {
		int num1 = sc.nextInt();
	int num2 = sc.nextInt();
		System.out.println(num1+"/"+num2+ "="+(num1/num2));
	}
	catch(InputMismatchException i) {
		int num1=sc.nextInt();
		
		System.out.println("get proper input");
	}
	catch(ArithmeticException e) {
		System.out.println("arithmetic exception");
	}
	
	System.out.println("iam executed after exception");
	}

}
