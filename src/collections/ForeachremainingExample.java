package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ForeachremainingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list=new ArrayList<Integer>();
list.add(100);
list.add(-200);
list.add(300);
list.add(400);
list.add(500);
Stream<Integer> str=list.stream();
Spliterator<Integer> spr=str.spliterator();
spr.forEachRemaining((n) ->System.out.println(n));
	}

}
