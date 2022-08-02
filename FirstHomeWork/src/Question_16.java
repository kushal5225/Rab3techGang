// Q16 Write a program to find the given number is even or odd.
import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		input=sc.nextInt();
		if(input%2==0) {
			System.out.print("The given number "+input+ " is even.");
		}
				
		else {
			System.out.print("The given number "+input+ " is odd.");
		}

	}

}
