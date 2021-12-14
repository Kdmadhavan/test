package constructors;

public class Person {
    //declaration of instance variables
	String name;
	int age;
	String address;
	//Delare a default constructor
	Person(){
		//initialization of instance variables
		name="Tamanna";
		age=30;
		address="united status";
	}
	//here we are no creating any contructor.so java compiler will automatically insert a default constructor
	//create a method to print the default values
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);

	}
	//main method
	public static void main(String[] args) {
	//creation of object using new keyword
		Person p=new Person();
		//call display method using refernce variable
		p.display();
	}

}
