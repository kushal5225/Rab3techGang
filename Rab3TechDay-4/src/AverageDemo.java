import java.util.Scanner;

/**
 * 
 */

/**
 * @author kushalshrestha
 *
 */
public class AverageDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float num1;
		Float num2;
		Float num3;
		Float Result;
		
	Scanner Sn=new Scanner(System.in);
	
	System.out.println("Please enter num1 = ");
    num1=Sn.nextFloat();
    
    System.out.println("Please enter num2 = ");
    num2=Sn.nextFloat();
	
    System.out.println("Please enter num3 = ");
    num3=Sn.nextFloat();


		Result=(num1+num2+num3)/3;
		System.out.println("the average of given numbers is "+Result);
			
		
	}

}
