import java.util.Scanner;

// Write a program to display the largest number from given three numbers.
public class Question_18 {

	public static void main(String[] args) {
		int input1 , input2 , input3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input1: ");
		input1=sc.nextInt();
		System.out.print("Enter the input2: ");
		input2=sc.nextInt();
		System.out.print("Enter the input3: ");
		input3=sc.nextInt();
		int result;
		
		if ((input1>input2) && (input2>input3)) {
			System.out.println("The largest number is: "+input1);
		}
		else if((input2>input3) && (input2>input1)) {
		
		System.out.println("The largest number is: "+input2);
	}
		
		else if ((input3>input1) && (input3>input2)) {
			System.out.println("The largest number is: "+input3);
		}

    }
	}

