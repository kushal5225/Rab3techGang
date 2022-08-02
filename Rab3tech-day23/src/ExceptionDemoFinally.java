
public class ExceptionDemoFinally {

	public static void main(String[] args) {
		int num1=100;
		int num2=10;
		try {
		int result=num1/num2;  
		System.out.println("result of num1/num2="+result);
		
		if(result==10) {
			return; //program is going to be terminated by default
			//but before termination set of contents in finally block will be executed
			
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
