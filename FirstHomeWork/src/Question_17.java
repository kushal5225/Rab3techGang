import java.util.Scanner;

//Write a program to calculate the leap year
public class Question_17 {

	public static void main(String[] args) {
		
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year: ");
		year=sc.nextInt();
		
		if (year%4==0 && year%100!= 0) {
			
				System.out.print("The give year is a leap year.");
			}
		else if (year%400==0) {
			System.out.print("The give year is a leap year.");
		}
		else {
			System.out.print("The give year is not a leap year.");
		}
	}

}
