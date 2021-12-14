package AccessModifiers;

public class sample {
/*
 * limits the visiblity of classes,field,constructors,methods
 * two categories(public,private,protected,default)
 * Access modifiers
 * Non access modifiers
 */
	
	               //public protected default private
//same class          yes      yes      yes      NO
//sub class           yes      yes      yes      no
//same package        yes      yes      yes      no   
//another package     yes      yes*     no       no	
}
class A{
	 int data=30;
	 void msg() {
		System.out.println("Java pgm");
	}
}