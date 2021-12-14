package Arrays;

public class arraysprogram {
	
	boolean[] barr=new boolean[3];//An instance varriable 
public arraysprogram() {
	//print the initial value for elements of the instance variable barr
	for(int i=0;i<barr.length;i++) {
		System.out.println("barr["+i+"]:"+barr[i]);
	}
}
public static void main(String[] args) {
	System.out.println("Array initialization of int type");
	int[] intarr=new int[3];//local variable
	for(int i=0;i<intarr.length;i++) {
		System.out.println("intarr["+i+"]:"+intarr[i]);
	}
	System.out.println("\n Array initialization of boolean array");
	new arraysprogram();
}
}
