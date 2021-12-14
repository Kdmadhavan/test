package staticANDfinal;

public class Student {
//Declaring a static variable id having datatype int and assign it the value 20
	static int id=20;
	public static void main(String[] args) {
		//create an object of the class
		Student s= new Student();//call static variable using object reference variable s and store it by variable x with data type int
		int x=s.id;//print it to the console
		System.out.println(x);
		//call static variable id using the class name
		System.out.println(Student.id);
	}
}
