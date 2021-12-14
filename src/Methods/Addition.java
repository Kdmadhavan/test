package Methods;

public class Addition {
        //Declare two instance variables
	static int a=10;
	static int b=20;
	int c=50;
	int d=40;
	//System.out.println(a+b)//it is  invlaid syntax because inside the class, we cannot write directly the business logic of the application
	//Declaration of instance method
	static void add( ){//no parameter 
		//write the logic of adding two number and print it in the colsole
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(c-d);
	}
	public static void main(String[] args) {
        Addition a=new Addition();//object creation
        a.sub();
       Addition.add();//calling the method 
        //predefined methods
        //user defined methods-instance methods and static methods
       //main,retun type,call by value and call by reference
	}
	/*public --to cLL BY jvm from anywhere
	 * static -- makes it class method so tat it can be called using class name without creatinf the object of the class
	 * * 
	 * void
	 *  main
	 */
	

}
