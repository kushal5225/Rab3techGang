
public class ExceptionDemo4 {

	public static void main(String[] args) {
		int num1=20;
		int num2=0;
		int div=0;
		try {
			div=num1/num2;  //suspicious code
		
		}
		catch(ArithmeticException e) {
			
			System.out.println("first---");
			e.printStackTrace();

		}
		
		catch(Exception e) {
	
			System.out.println("second---");
			e.printStackTrace();
			
		}
		System.out.println("Division=="+div);
		System.out.println("Hello.....");

	}

}
