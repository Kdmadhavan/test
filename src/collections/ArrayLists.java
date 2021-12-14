package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		
		List<Integer> p = new ArrayList<Integer>();
		for (int i=0;i<=8;i++)
		{
						p.add(i);
			//iterator object
				}
		Iterator<Integer> itr = p.iterator();
while (itr.hasNext())
{
	Integer i = itr.next();
	System.out.println(i);
}
	}

}

/*priya
 * ArrayList<Integer> al1 =new ArrayList<Integer>();
		for(int i=0;i<=8;i++) {
			al1.add(i);
			//al1.add(4);
		}
		
		// Get the iterator
	    Iterator<Integer> it = al1.iterator();

	    while(it.hasNext()) {
	    	Integer i = it.next();
	    	
	    	if(i%2 != 0) {
	    		it.remove();
	    	}
	    }
	    System.out.println(al1);
Kokila Priya9:08 PM
[0, 2, 4, 6, 8]*/
