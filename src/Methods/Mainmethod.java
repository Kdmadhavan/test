package Methods;

public class Mainmethod {
public static void main(int a) {
	System.out.println("first main method");
}
public static void main() {
	System.out.println("second main method");
}
public static void main(String[] args) {
	System.out.println("Third main method");
	main(30);
}
}
