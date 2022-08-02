/**
 * 
 */
package ReverseProject;

import java.util.Scanner;

/**s
 * @author kushalshrestha
 *
 */
public class PrimeChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		n=sc.nextInt();
	if (n==2) {
		System.out.println( "the number is  prime");
	}
		
		else if ( n%2!=0 && n%3!=0) {
			
		System.out.println( "the number is  prime");
		
		}
		 
		else{
			System.out.println( "the number is not prime");
			
	}
}
}
