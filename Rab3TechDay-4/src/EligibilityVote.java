import java.util.Scanner;

/**
 * 
 */

/**
 * @author kushalshrestha
 *
 */
public class EligibilityVote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int age;
		String name;
		
		Scanner Sn=new Scanner(System.in);
		System.out.println("Please enter the name= ");
		name=Sn.next();
	   
	    System.out.println("Please enter the age = ");
        age=Sn.nextInt();
      
         if (age>=18) {
        	   System.out.println("You are eligible to vote ");
         }
         else {
        	 System.out.println("You aren not eligible to vote " );
        	 
         }
       
	}

}
