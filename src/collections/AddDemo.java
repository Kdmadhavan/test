package collections;

public class AddDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>Map=new HasMap<>();
		//Checking map is empty or not.
		boolean isEmpty = map.isEmpty();
		System.out.println("Is Map is emply?");
		//Adding entries in the map.Call put() me
		map.put(101, "Red");
		
		
		System.out.println("Entires in map: " +map);
		int size = map.size();
		System.out.println("No.of entries in Map:");
		
		//Create another map
		java.util.Map<Integer,String>map2=new HasMap<>();
		map2.put(115, "Brown");
		map2.put(110,  "red");
		map.putall(map2);
		System.out.println();
	}
}
}
