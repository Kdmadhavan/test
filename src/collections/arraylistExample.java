package collections;

import java.util.ArrayList;

public class arraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>languages=new ArrayList<String>();
languages.add("java");
languages.add("kotlin");
languages.add("c++");
languages.add("c");
System.out.println(languages);
languages.set(2,"javascript");
System.out.println(languages);
	
/*for(int i=0;i<languages.size();i++)
{
	languages.get(i);
	System.out.println(i);
}*/
//for (datatype item:array/collection
 for (String l:languages){
  System.out.println(l);
 }
}
}