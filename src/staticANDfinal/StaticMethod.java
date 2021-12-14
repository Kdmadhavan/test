package staticANDfinal;

public class StaticMethod {
    static int a=10;
    
    void display() {
    	System.out.println("This is an instance method");
    }
    
   static void show() {
    	System.out.println("This is a static method");
    }
   public static void main(String[] args) {
	StaticMethod s=new StaticMethod();
	s.display();
	System.out.println(a);
	show();
}
}
