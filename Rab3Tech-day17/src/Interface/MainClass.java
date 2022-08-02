/**
 * 
 */
package Interface;

/**
 * @author kushalshrestha
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
		Dog d= new Animal();
		d.run();
		d.walk();
		
		System.out.println("  -------------------------------------------   ");
		DogB db= new Animal();
		db.sleep();
		db.eat();
	}

}
