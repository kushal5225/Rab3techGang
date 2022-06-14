/**
 * 
 */
package MethodOverRidding;

/**
 * @author kushalshrestha
 *
 */
public class Mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog  d = new BarkDog(); // we did here upcasting.

d.walk();
d.run(); //overiding
Dog dg= new Dog();
dg.run(); // here is orginal one from dog (super class)
	}
}
	
