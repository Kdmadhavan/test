package collections;

import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
	/*vector*/
	Vector<String> animals =new Vector<String>();
	animals.add("zebra");
	animals.add("Lion");
	animals.add("tiger");
	animals.add("Chetta");
	animals.add("Elephant");
	
	System.out.println(animals.lastIndexOf("Elephant"));
System.out.println(animals.contains(animals));
System.out.println(animals.size());
/*Vector2*/
Vector<String>animals1=new Vector<String>();
animals1=(Vector<String>) animals.clone();
System.out.println(animals1);
animals.addAll(animals1);
System.out.println(animals1);
for (String i:animals) {
		System.out.println(i.charAt(2));
}
}
}
