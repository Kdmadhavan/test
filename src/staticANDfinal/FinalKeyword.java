package staticANDfinal;

public class FinalKeyword {
      /*
       *Final variable---> to declare constant---stops value change
       * Final class---->to prevent inhertance
       * Final Method---->to prevent method from being overriden
       */
	//declaring final instance variable
	final int a=20;
	//declaring an instance method
	final void display() {
		//change the value of the final instance variable
		a=40;//compile time error
		System.out.println(a);
	}
}
class final2 extends FinalKeyword{
	void display() {
		
	}
}