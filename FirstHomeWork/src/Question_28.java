

import java.util.Scanner;
public class Question_28 {

	public static void main(String[] args) {
	 int num  ;
	 int count=0;
	
		 Scanner sc =new Scanner(System.in); 
		 System.out.println("Enter the number");
		 num=sc.nextInt();
	 
	 
	for(int i=1; i<=num; i++) {
		if (num % i ==0 ) {
		count++;
		}
	}
	 
	  if (count == 2) {
		  System.out.println("this is a prime number");
	  }
	  
	  else {
		  System.out.println("This is not a prime number");
	  }
	  System.out.println("-------------------------------------------");
	}

}

