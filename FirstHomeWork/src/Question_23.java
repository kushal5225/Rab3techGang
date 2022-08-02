import java.util.Scanner;

//Write a program to sum 1 to nth natural number.
public class Question_23 {

	public static void main(String[] args) {
	int num;
 	
		  Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	num=sc.nextInt();
	int sum = 0;
for (int i=0; i<=num;i++) {
	sum=i+sum;
		
	 }
		System.out.println("Total sum of given number is: "+sum);
	 
	}

}
