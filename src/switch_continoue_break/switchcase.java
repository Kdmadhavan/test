package switch_continoue_break;

import java.util.Scanner;

public class switchcase {
/*
 * switch(integer expression(byte,short,int,char long,string)){
 * case value-1:
 *     statements
 *     break;
 * case value-2:
 *     statements
 *     break;
 * case value-n:
 *     statements
 *     break;
 * default:
 *     //default statement
 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//declaring a variable for switc expression
		System.out.println("Enter the character");
		char city=s.next().charAt(0);
		//switch expression with char value
		switch(city) {
		case 'm':
			System.out.println("Mumbai");
		case 'b':
			System.out.println("Bangalore");
			break;
		case 'c':
			System.out.println("Chennai");
		case 'k':
			System.out.println("kolkata");
		default:
			System.out.println("No city was selected");
		}
	}
}
