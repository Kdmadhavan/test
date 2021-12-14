package switch_continoue_break;

public class continuestatement {
public static void main(String[] args) {
	for(int i=10;i>=1;i--) {
		if(i==5)
			continue;//it will skip rest statement and go back in the for loop
		System.out.print(" "+i);
	}
}
}
