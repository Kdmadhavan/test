package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists1 {

	public static void main(String[] args) {
	List<String> p =new ArrayList<String>();	
p.add("Hai");
p.add("How");
p.add("r");
p.add("you");
System.out.println(p);
List<String> p2 =new ArrayList<String>();	
p2.add("Test");
p2.add("1");
p2.add("r2");
p2.add("you3");
System.out.println(p2);
	p.addAll(2,p2);
	System.out.println(p);
	System.out.println(p.indexOf("r"));
	//for (int=0;i<p.size();i++) {
		//System.out.println(p.get(i));
	for(int i=0;i<p.size();i++) {
		System.out.println(p.get(i));
	}
	}
	}


