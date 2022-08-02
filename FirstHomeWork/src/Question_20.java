import java.util.Scanner;

/*Q20 Write a program to create the equivalent of a four-function calculator. 
the program is enter two integer's number and an operator.
It then carries out the specified  arithmetic operator operation: +_*/ 
public class  Question_20 {
    
	static int num1;
	static int num2;
	static int sum;
	static int sub;
	static int multi;
	static int div;
	static char operator;

	public static void add() {
		sum=num1+num2;
		System.out.println("The additon of given two num is: "+sum);
	}
	public static void sub() {
	sub=num1-num2;
	System.out.println("The subtration of given two num is: "+sub);
	
	}
	public static void multi() {
		multi=num1*num2;
		System.out.println("The multiplication of given two num is: "+multi);
	}
    public static void div() {
    	div=num1/num2;
    	System.out.println("The division of given two num is: "+div);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		num1=sc.nextInt();
		System.out.println("Enter num2: ");
		num2=sc.nextInt();
		
		System.out.println("Enter Operator: ");
		operator=sc.next().charAt(operator);
		
		Question_20 qc= new Question_20();
		
		switch(operator) {
		case '+' :
			qc.add();
			break;
			
		case '-' :
			qc.sub();
			break;
			
		case '*' :
			qc.multi();
			break;
			
		case '/' :
			qc.div();
			break;
			
			default:
			System.out.println("'SORRY' Please enter only this Operator +, - , * and /. ");
			
		
		
		}	
		
	}

}
