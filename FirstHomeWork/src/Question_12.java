// Q12 Write a program to accept the roll, name, and nationality of the person and display those values in good format.
import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		int roll;
		String name;
		String nationality;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the roll: ");
		roll=sc.nextInt();
		System.out.print("Enter the name: ");
		name=sc.next();
		System.out.print("Enter the nationality: ");
		nationality=sc.next();
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("The roll of a person is : "+roll);
		System.out.println("The name of a person is : "+name);
		System.out.println("The nationality of a person is : "+nationality);
		
		
	}

}
