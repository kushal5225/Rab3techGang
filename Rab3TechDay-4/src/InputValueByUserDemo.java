import java.util.Scanner;

/**
 * 
 */

/**
 * @author kushalshrestha
 *
 */
public class InputValueByUserDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float num1;
		Float num2;
		Float Result;
		
	Scanner Sn=new Scanner(System.in);
	System.out.println("Please enter num1 = ");
    num1=Sn.nextFloat();
    
    System.out.println("Please enter num2 = ");
    num2=Sn.nextFloat();
	


		Result=num1*num2;
		System.out.println("the multiplication of numbers is "+Result);
			
		

	}

}
