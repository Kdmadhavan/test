package collections;

import java.util.ArrayList;

public class UserMaincode {

//	public static void main(String[] args)
	public static ArrayList<Integer>removeMultiplesOfThree(ArrayList<Integer>al)
	{

for (int i=1;i<al.size();i++)
		{
	if ((i%3)!=0) {
		al.remove(al.get(i));
		System.out.println("size"+i+al.size());
	}
		//al.add(al.get(i));
	//return al;
		}
return al;
	}

}
