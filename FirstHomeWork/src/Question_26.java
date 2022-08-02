import java.util.Scanner;


//Q26 Write a program to reverse the given number.

public class Question_26 {

	public static void main(String[] args) {

String num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
num=sc.next();
int count=num.length();
 
for(int i=count-1; i>=0; i--) {
	System.out.print(num.charAt(i));
}

	


}
}