
import java.util.Scanner;

public class Question_27 {
	static int  num;
	static int num1;
	static int digit;

	static int sum=0;
	static int product=1;
	


	public  void add() {
		while(num>0) {
	         digit =num%10;
	         sum=sum+digit;
	         num=num/10;
		
	        
	}
		 System.out.println("the sum of given numbers: "+sum);
	
	}

	public  void multi() {
		
		while(num1>0) {
		
			product=product*(num1%10);
		num1=num1/10;
		
		}
	
		System.out.println("the product of given numbers: "+product);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the sum of digits:");
		num=sc.nextInt();
		System.out.println("Enter the number to find the product of digits:");
		num1=sc.nextInt();
		
		Question_27 qc= new Question_27();
		
	qc.add();
	 qc.multi();
	
		
		

		}
		
       
	

	
	}


