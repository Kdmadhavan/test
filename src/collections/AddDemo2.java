package collections;

import java.util.Iterator;
import java.util.Map;

public class AddDemo2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>;
		map.put("V", "Violet");
		map.put("I", "Violet");
		map.put("B", "Violet");
		map.put("G", "Violet");
		
		
		
		
		Iterator<Entry String,String>itr2=map.keySet().iterator();
		//keyset
		Iterator<String>itr2=map.keySet().iterator();
		System.out.println("Iterating Entries of Map");
		while (itr2.hasNext())
		{
			Object keyView = itr2.next();
			System.out.println(keyView);
		}
		String value = map.get("V");
		System.out.println(value);
	}

}
