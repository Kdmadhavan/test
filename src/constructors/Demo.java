package constructors;

public class Demo {
//declare the paramaterized contructor with no arguments
	Demo(){
		System.out.println("Im a zero arugument constructor");
	}
//declare the paramaterized contructor with one argument
	Demo(int a){
		System.out.println("Im a one arugument constructor");
	}
//declare the paramaterized contructor with two arguments
	Demo(int a, int b){
		System.out.println("Im a two arugument constructor");

	}
	public static void main(String[] args) {
		Demo d=new Demo();
		     d=new Demo(20);
		     d=new Demo(20, 40);
	}
}
