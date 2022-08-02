import java.util.Scanner;

// Q14 Write a program to relate two integers entered by the user using == or > <sign.
public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input1;
int input2;

Scanner sc=new Scanner(System.in);
System.out.print("Enter the input1: ");
input1=sc.nextInt();
System.out.print("Enter the input2: ");
input2=sc.nextInt();
 if (input1>input2) {
	 System.out.println("the input1 is greater the input2: "+input1);
	 
 }
 else if (input1==input2) {
	 System.out.println("the input1 " +input1+ " is equal to input2 "+input2);
 }
 else {
	 System.out.println("the input 2 is greater: "+input2);
 }

	}

}
