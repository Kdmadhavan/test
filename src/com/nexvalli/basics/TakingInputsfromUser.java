package com.nexvalli.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInputsfromUser {
    /*
     * using buffered reader
     * using scanner class
     * using console
     */
	
	public static void main(String[] args) throws IOException {
		//Buffered Reader
		//creating object for buffered reader
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//Reading data using readline method
		System.out.println("Enter your name");
		String name=reader.readLine();
		//printing the read line
		
		//using scanner class(preffered one)
		Scanner s=new Scanner(System.in);
		//using scanner for getting input from user
		System.out.println("Enter your Last name");
		String lastname=s.next();
		
		System.out.println("Enter your age");
		int age=s.nextInt();
		//double cgpa=s.nextDouble();
		System.out.println("Enter Gender");
		String gender=System.console().readLine();
		System.out.println(name);
		System.out.println(lastname);
		System.out.println(age);
		System.out.println(gender);

		
		
		
	}
}
