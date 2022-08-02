
public class ExceptionDemoFinally2 {

	public static void main(String[] args) {
		int num1=300;
		int num2=30;
		try {
		int result=num1/num2;  
		System.out.println("result of num1/num2="+result);
		
		if(result==10) {
			System.exit(0);// after this all other code will stop because of .exit or it will take exit from system.
			return;
			
		}
		}
		catch(ArithmeticException e) {
			System.out.println("got it");
			
			
		}
		
		catch(Exception e) {
			System.out.println("General");
		}
		
		finally {
			System.out.println("This is finally block");
			}
		
		System.out.println("dummy message");
		System.out.println("----end of main method---");

	}

}
