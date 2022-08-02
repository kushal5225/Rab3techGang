
//Q3. Write a program to find sum and average of two numbers input by user( using scanner class)
import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Num1:  ");
		num1=sc.nextInt();
		System.out.print(" Enter Num2: ");
		num2=sc.nextInt();
		 
		int sum;
		int average;
		 
		// For Sum
		sum= num1+num2;
		System.out.println(" The sum of given numbers is : "+sum);
		// For average
		average= (num1+num2)/2;
		System.out.println(" The average of given numbers is : "+average);
			
	
	}

}
