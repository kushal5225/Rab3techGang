/**
 * 
 */

/**
 * @author kushalshrestha
 *
 */
public class THisDemoMain {
	public static void main(String[] args) {

	ThisDemo t=new ThisDemo();
	System.out.println(t.num1);  
	System.out.println(t.str); 
	System.out.println("---------------------");
	
	
	ThisDemo td=new ThisDemo("Kushal", 32);
	System.out.println(td.num1);  
	System.out.println(td.str);   
	System.out.println("----------------------");
	
	ThisDemo td1=new ThisDemo(23,"Roman");
	System.out.println(td1.str); 
	System.out.println(td1.num1); 
	}

}
