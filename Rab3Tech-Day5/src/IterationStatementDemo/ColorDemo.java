/**
 * 
 */
package IterationStatementDemo;

import java.util.Scanner;

/**
 * @author kushalshrestha
 *
 */
public class ColorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please give the charater From a to z : ");
		ch=sc.next().charAt(0);

		switch(ch) {
		case 'r':
			System.out.println("The color is red");
			break;
			
		case 'b':
			System.out.println("The color is blue");
			break;
			
		case 'o':
			System.out.println("The color is orange");
			break;
			
		case 'p':
			System.out.println("The color is purple");
			break;

			
	
		default:
			System.out.println("Sorry please enter the right charater");

		
		}
	}

}
