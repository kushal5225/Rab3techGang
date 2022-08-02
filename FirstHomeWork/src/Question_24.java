import java.util.Scanner;

//Q24 write a program to the factorial number given numbers.
public class Question_24 {

	public static void main(String[] args) {
		int num;
	 	
		  Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to find its factorial:  ");
	num=sc.nextInt();
	
	int factorial = 1;
	for (int i=1 ; i <= num;i++) {
		factorial=i*factorial;
	 
		
	 
	}

	System.out.println("Total factorial  of given number "+num+"! is: "+factorial );
	}
}


