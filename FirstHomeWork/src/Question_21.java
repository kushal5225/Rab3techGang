import java.util.Scanner;

// Q21 Program to input the number to (1....7) and translate to its equivalent name of the day of the week.
public class Question_21 {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter num from 1 to 7: ");
		num=sc.nextInt();
	    switch(num) {
	    case 1:
	    	System.out.println("Today is Monday. ");
	    	break;
	    case 2:
	    	System.out.println("Today is Tuesday. ");
	    	break;
	    case 3:
	    	System.out.println("Today is Wednesday. ");
	    	break;
	    case 4:
	    	System.out.println("Today is Thursday. ");
	    	break;
	    case 5:
	    	System.out.println("Today is Friday. ");
	    	break;
	    case 6:
	    	System.out.println("Today is Saturday. ");
	    	break;
	    case 7:
	    	System.out.println("Today is Sunday. ");
	    	break;
	    	default:
	    		System.out.println("Sorry, Please enter only 1-7 . THANK YOU!!!");
	    }
	
	}
	

}
