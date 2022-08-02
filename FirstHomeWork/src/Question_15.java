import java.util.Scanner;

// Q15 Write a program that receives an ASCII code (between 0-128) and display its character.
public class Question_15 {

	public static void main(String[] args) {
		int input;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input: ");
		input=sc.nextInt();
		while (  input<=128 ) {	// TODO Auto-generated method stub



	
	System.out.println("The ASII value  of "+input+ " is:  "+(char)input);
	break;
}

	}

}
