/**gender
 * 
 */
package ABstractKeyword;

/**
 * @author kushalshrestha
 *
 */
public class LoveMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Hate h= new Hate();
	     System.out.println("-------------------------------------------------------");
	     System.out.println("------come from super class love------");
	     System.out.println("Age is " +h.age );
	     System.out.println(" Name is "+h.name);
	     System.out.println("---------------------------------------------------------");
	     System.out.println("--------come from sub class hate-------");
	     System.out.println("Year is "+h.year);
	     h.gender();
	     h.Place();
	}

}
