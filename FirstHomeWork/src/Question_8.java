// Q8. Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit .

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		
	float F;
	float C;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Fahrenheit: ");
     F=sc.nextFloat();
     System.out.print("Enter Celsius: ");
     C=sc.nextFloat(); 
     
     float Celsius;
     float Fahrenheit;
     
     Celsius=(float)((F-32)*5/9);
     System.out.println("The conversion from Fagrenheit to Celsius is: "+Celsius);
     
     System.out.println("---------------------------------------------------------------");
     
     Fahrenheit=(float) ((1.8*C)+32);
     System.out.println("The conversion from Celsius to Fagrenheit  is: "+Fahrenheit);
	
	
		

	}

}
