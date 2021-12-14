package Methods;

public class callbyvalue {

	int change(int b) {
		++b;//changes will be in the local variable only
		return b;
	}

public static void main(String[] args) {
      callbyvalue c=new callbyvalue();
      int a=20;
      int x=c.change(a);
      System.out.println("The value of a after passing: "+a);
      System.out.println("The value of x after modifying: "+x);

}
}
