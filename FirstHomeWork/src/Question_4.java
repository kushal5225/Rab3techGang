import java.util.Scanner;

//Q4. Write a program to calculate Simple Interest input by user?
// Simple Interest = P*T*R/100

public class Question_4 {

	public static void main(String[] args) {
	int Principle;
	float time;
	float rate;;

	 Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Principle amount : ");
		Principle=sc.nextInt();
		System.out.print(" Enter time:  ");
		time=sc.nextFloat();
		System.out.print(" Enter rate: ");
		rate=sc.nextFloat();
		
		float SimpleInterest ;
		SimpleInterest= (Principle*time*rate)/100;
		System.out.println(" The Simple Interest is : "+SimpleInterest);
	 

	}

}
