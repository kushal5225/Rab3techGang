package ReverseProject;

import java.util.Scanner;

public class Reverse {
	 String name;
	public static void main(String[] args) {
		 String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER ANY NAME :");
	name =sc.next();
	
	System.out.println("the name is " +name);
	
	System.out.println("the reverse of  " +name+ " is :");
	for(int i=name.length()-1; i>=0 ; i--) {
	System.out.print( name.charAt(i));
	}
}
}