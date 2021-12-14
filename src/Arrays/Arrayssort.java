package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayssort {
	
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	//create an int array with user specifies array size
	System.out.println("How many numbers do you want to enter");
	int n=s.nextInt();
	int[] arr=new int[n];
	//Entering the elements of the array
	System.out.println("Enter your numbers");
	for (int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	//sort the integer numbers
	//4,8,5,3,7
	int temp=0;//Temporary variable to store the element
	for(int i=0;i<arr.length;i++){//Holds each array element
         for(int j= i+1;j<arr.length;j++) {//compare with remaining array element
        	 if(arr[i]>arr[j])//compare and swap
        	 {
        		 temp=arr[i];
        		 arr[i]=arr[j];
        		 arr[j]=temp;
        	 }}}
	//Displaying elements of array after sorting
	System.out.println("Elements of array sorted in ascending order");
	for(int i=0;i<arr.length;i++) {
		System.out.print (arr[i]+" ");
	}
     Arrays.sort(arr); 
     
}
}
