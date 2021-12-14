package Arrays;

import java.util.Scanner;

public class Arrayprograms4 {
public static void main(String[] args) {
	//create a scanner object
	Scanner s = new Scanner(System.in);
	//creating an array object
	int num[]=new int[5];
	System.out.println("Enter "+num.length+" integer values");
	for(int i=0;i<num.length;i++) {
		num[i]=s.nextInt();
	}
	//calculating the sum of int values
	int sum=0;
	for(int i=0;i<num.length;i++) {
		sum+=num[i];
	}
	//displayimg the sum of input values
	System.out.println("Sum: "+sum);
}
}
