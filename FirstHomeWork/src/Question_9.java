import java.util.Scanner;

//Q9. Write a program that converts pound into kg. The programs prompts the user to enter a number of pounds, convert it to kg and displays the result.

public class Question_9 {

	public static void main(String[] args) {
	float pound;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Pounds: ");
    pound=sc.nextFloat();
    
    float kg;
    kg=(float)(pound*0.45);
     
    System.out.println("the conversion from pounds to kg is: "+kg+" kg. ");
    
    
    
	}

}
