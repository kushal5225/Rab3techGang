import java.util.Scanner;

public class Multiplaction {
	
	static int num1;
	static int num2;
	int result;
	 
	public void Multi() {
		 result = num1*num2;
		 System.out.println("the product of the given two numbers is: "+result);
	}
	

	public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter num1: ");
	 num1=sc.nextInt();
	 
	 
	 System.out.println("Enter num2: ");
	 num2=sc.nextInt();
	 
Multiplaction mc=new Multiplaction();
mc.Multi();
	

	}

}
