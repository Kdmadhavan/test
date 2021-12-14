package Loops;

public class DowhileLoop {
public static void main(String[] args) {
	int i=1;//initialization of the counter
      do {
		//Execution of statements
		System.out.println("Im printing this statement for "+i+ "th time");
		System.out.println("Im learning loops in java");
		//increment/decrement
		i++;
	}	while(i<=5);
	System.out.println("The value of i became "+i+ " that is why it broke out of the loop" );
}
}
