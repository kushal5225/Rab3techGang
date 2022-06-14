/**
 * 
 */
package IterationStatementDemo;

import java.util.Scanner;

/**
 * @author kushalshrestha
 *
 */
public class ForLoopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1; 
	Scanner sc=new Scanner (System.in); 
		System.out.print("enter the number you want the multiplication table for:");
		num1=sc.nextInt();
		
				
		
	for( int x=1; x<=10; x++ ) {
		System.out.println( num1+ "*"+x+ "="+(num1*x));
	
	}

	}

}
