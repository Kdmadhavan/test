package Arrays;

public class Arrayprogram3 {

	public static void main(String[] args) {
       //initlializing elements into an array
		int num[]= {18,21,24,15,23,25};
		//Displaying elements of array using index
		System.out.println("The element at third position: "+num[2]);
		//Displaying elements of array using for loop
		System.out.println("Length of the array is: "+num.length);
		for(int i=0;i<num.length;i++) {
			System.out.println("The element at "+i+" position is: "+num[i]);
		}
	}

}
