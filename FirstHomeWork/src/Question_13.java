import java.util.Scanner;

// Q13 Write a program to print the number entered by the user only if the number entered is negative.

public class Question_13 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the input: ");
		input=sc.nextInt();
		
		if (input<0) {
			System.out.println("the given input is: "+input);
			
		}
		else {
			System.out.println("Sorry the number in not negative: ");

		}
	}

	}
	
