//Q22 Write a program to print the table of given number.


import java.util.Scanner;

public class Question_22 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number that you want to get a multiplaction of: ");
		num=sc.nextInt();
		
		int array[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		 int result;
		for(int i=0;i<array.length ; i++ ) {
			result = array[i]*num;
			System.out.println(num+" * "+array[i]+ " = "+result);
		}
	}
}