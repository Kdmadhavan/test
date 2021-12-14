package staticANDfinal;

public class staticVariableinitialisation {
static int x=20;

staticVariableinitialisation(){//constructor
	x++;
}

void display() {
	System.out.println(x);
}

public static void main(String[] args) {
	staticVariableinitialisation s1=new staticVariableinitialisation();
	s1.display();
	staticVariableinitialisation s2=new staticVariableinitialisation();
	s2.display();
	staticVariableinitialisation s3=new staticVariableinitialisation();
	s3.display();
}
}

/*
 * 1
 * 2
 * 3
 * */
 