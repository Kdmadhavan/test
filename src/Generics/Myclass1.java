package Generics;
//here, T is a type parameter that will be replaced by a real (concrete) type when an object of type my class is created
public class Myclass1 <T>{
T obj;
//declare a constructor to initialize T type object.
Myclass1(T obj){
	this.obj = obj;
}
//declare an instance method that will return T type object
T getObject() {
	return obj;
}
public static void main(String[] args) {
	//create an object of integer class.
	Integer i = 70; //this is same as :Integer i = new Interger(20);
//create an object of Myclass and store Integer object into it.
	Myclass1<Integer>obj = new Myclass1<Integer>(i);
	//call getObject() method to get integer object.
	System.out.println("Store value:" +obj.getObject());
//we can also use Myclass to store String type data also as:
	String str = "Sciencetech Easy";
	Myclass1<String>obj3 = new Myclass1<String>(str);
	System.out.println("Stored value: "+obj3.getObject());
	//Integer i2 = new Integer(20);
	//i2.
}
}
	
