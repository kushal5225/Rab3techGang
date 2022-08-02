
public class ExceptionDemo3 {

	public static void main(String[] args) {
		int num1=20;
		int num2=0;
		int div=0;
		try {
			div=num1/num2;  //suspicious code
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//getMessage()--> it will provide brief information about exception (/by zero)
			
		
		
		}
		System.out.println("Division=="+div);
		System.out.println("Hello.....");

		   

	}

}
