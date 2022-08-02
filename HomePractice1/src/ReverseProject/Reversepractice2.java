package ReverseProject;

import java.util.Scanner;

public class Reversepractice2 {

	public static void main(String[] args) {
		String k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the words you want reverse");
		k=sc.next();
		

	String m="";
	int a=k.length();
	
	for (int i=a-1; i>=0;i--) {
		m=m+k.charAt(i);
		
	}
	System.out.println(m);
	
	}

	

}
