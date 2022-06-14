import java.util.Scanner;

/**
 * 
 */

/**
 * @author kushalshrestha
 *
 */
public class SUndayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Input;
Scanner sc=new Scanner(System.in);
System.out.print("Please give the input From 1 to 7 : ");
Input=sc.nextInt();
while(Input>7) {
	System.out.println("Sorry wrong input, input number again: ");
	Input=sc.nextInt();
	
}
switch(Input) {
case 1:
	System.out.println("Today is Sunday");
	break;
	
case 2:
	System.out.println("Today is Monday");
	break;
	
case 3:
	System.out.println("Today is Tuesday");
	break;
	
case 4:
	System.out.println("Today is Wednesday");
	break;

	
case 5:
	System.out.println("Today is Thursday");
	break;
	
case 6:
	System.out.println("Today is Friday");
	break;
	
case 7:
	System.out.println("Today is Saturday");
	break;
default:
	System.out.println("Sorry number");
	

}


	}

}
