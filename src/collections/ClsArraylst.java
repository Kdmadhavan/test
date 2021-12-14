package collections;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ClsArraylst {
	static ArrayList<Integer> a12;
	
	public static void main(String[] args) {
		ArrayList<Integer>all = new ArrayList<Integer>();
		ArrayList<Integer>a12 = new ArrayList<Integer>();
		System.out.println("enter your input count:");
		//Scanner inp = new Scanner(System.in);
	int n=sc.nextInt();
		System.out.println("input the number of data your are about");
	
	for(int i=0;i<n;i++) {
		all.add(sc.nextInt());
	}
	all=UserMaincode.removeMultiplesOfThree(al);
	System.out.println();
	Iterator it=all.iterator();
	while (it.hasNext())
	{
		System.out.println(it.next());
	}
	}
}
