// Write a program to swap two numbers.
//A) Using temp variable.

public class Question11A {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		int temp;
		
		temp= a;
		a=b;
		b=temp;
		
		System.out.println( "swap a=100 and b=200 ----using temp variable----");
		System.out.println("------------------------------------");

		System.out.println("a= "+a);
		System.out.println("------------------------------------");
		System.out.println("b= "+b);
		
	}

}
