package Loops;

public class WhileLoop {
public static void main(String[] args) {
	int i=1;//initialization of the counter
	while(i<=5) {
		//Execution of statements
		System.out.println("Im printing this statement for "+i+ "th time");
		System.out.println("Im learning loops in java");
		//increment/decrement
		i++;
	}
	System.out.println("The value of i became "+i+ " that is why it broke out of the loop" );
}
}
