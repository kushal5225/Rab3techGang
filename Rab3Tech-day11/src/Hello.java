/**
 * 
 */

/**
 * @author kushalshrestha
 *
 */
public class Hello {

	int x = 786;
	public Hello() {
		System.out.println("I am from defult constructure");
	}
	{
		System.out.println("I am from instance block");
		x++;
	}
	static {
		System.out.println("I am from static block");
		
	}
	public void wow() {
		System.out.println("Value of x =" +x);
		
	}

}
