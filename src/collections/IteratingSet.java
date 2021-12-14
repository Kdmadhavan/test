package collections;

public class IteratingSet {
public static void main(String[] args) {
	
	Set<String>s=new HashSet<String>();
int size = s.size();
System.out.println

Iterator<String>itr=s.itertor();
System.out.println("Iteration using Iterator");
while(itr.hasNext())
{Object str = itr.netx();
System.out.println(str);
for(String it:s)
{System.out.println(it);
}
System.out.println("Iterating using foreach");
s.forEach(System.out::print);//method reference
}
}
