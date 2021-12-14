package com.nexvalli.basics;

public class Hello_World {
	public static void main(String args[]) 
	 {
	   System.out.println("Hello World");
	 }
	/*
	 * 1. Class Declaration:

The first line is

public class Hello

This statement declares a class named Hello. Here, class is a keyword in Java that is used to define a class.

Hello is a Java identifier that represents the name of class to be defined. Since Java is a true object-oriented programming language, everything must be placed inside a class.

2. Opening Brace:

Every class definition starts with an opening brace ” { ” and ends with a matching closing brace ” { “. It is just like to C++ class construct. Remember that a class definition in C++ ends with a semicolon.

3. Main method (Main line):

The third line is

public static void main(String[] args)

This statement defines the main() method. It is automatically run when the program is executed. It is similar to the main() function in C/C++.

Every Java program must have the main() method. It is the starting point for the interpreter to start the execution process of java program.

A Java program may contain any number of classes but only one of them must contain the main method to begin the execution.

This statement contains a number of keywords such as public, static, and void.

a) public: The keyword public is an access modifier that represents visibility. It means it is accessible to all other classes.

b) static: It is a keyword. If we define a method as static, it is called static method. The main advantage of the static method is that there is no need to create an object to call the static method.

The main method must always be declared as static because JVM executes the static method before the object creation. It means that JVM doesn’t need to create an object to class the main method. Thus, it also saves memory.

c) void: It is a modifier that states that the main method does not return any value.

d) main: It represents the starting point for the execution of the program.

e) String[] args: It contains an array of objects of class type String. It is used for command-line arguments.

If you try out to make the main method upper case, Java compiler will generate compile-time error.

The valid “main” methods that can be used in a Java program are

    public static void main(String[] args)
    public static void main(String args[])
    public 

    static void main(String …a)

At a time, only one of the above “main” method can be used in a class.

4. Output Line:

Inside the main method, the only executable statement is

System.out.println("Hello Java");

The println() method is used to print (display) “Hello World” on the console. It is similar to the print() statement of C or court << construct of C++.

Since Java is a pure object-oriented programming language, every method is a part of an object. The println() method is a part of out object, that is a static data member of System class.

The statement prints the string: “Hello World” to the screen.

5. Semicolon:

A program is composed of a set of instructions that is called statements. A semicolon is needed to indicate the end of a statement. Every Java statement must end with a semicolon.


	 */
}
