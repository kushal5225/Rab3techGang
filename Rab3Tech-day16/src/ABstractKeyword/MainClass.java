/**
 * 
 */
package ABstractKeyword;

/**
 * @author kushalshrestha
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Junior j =new Junior();
            System.out.println("---Given below value will come from super class---");
            System.out.println("My age is " +j.age);
            System.out.println("My name is " +j.name);
            System.out.println("-------------------------------------------------------");
            System.out.println("---Given below value will come from sub class---");
            System.out.println("The year is "+j.year);
            System.out.println("-------------------------------------------------------");
            j.study();
            j.study1();
	}

}
