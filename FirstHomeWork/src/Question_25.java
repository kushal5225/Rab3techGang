import java.util.Scanner;

// Write a program that prompts the user to enter the number of students and each student's name and score .Finally display the students with the highest score.
public class Question_25 {

	public static void main(String[] args) {
	String name;
	int num ;
	int score = 0 ;
	
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of the students: ");
	num=sc.nextInt();
	System.out.println("Emter the name and score of the students: ");

	int i = 0 ;
  
	while(i<num) {
    	name=sc.next(); score=sc.nextInt();
    	
        i++;
	}
	  int arr[]=new int [score];
	    int max=arr[0];
	for (int j=0 ; j<=arr.length-1; j++) {
		arr[j]=score;
		if (arr[j]>max) 
	System.out.println("highest score "+max);
	break;
	
	
	 
}
	}	
}