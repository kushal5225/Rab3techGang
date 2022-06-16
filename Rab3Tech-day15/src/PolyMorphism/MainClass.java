/**
 * 
 */
package PolyMorphism;

/**
 * @author kushalshrestha
 *
 */
public class MainClass {

	
	public static void main(String[] args) {
		
		Dog d;
	    d=new Dog();
	    d.run();  
	    
	    
	    System.out.println("-------------------");
	    
	    d=new BrownDog();
	    d.run(); 
	 
	    System.out.println("--------------------");
	    
	    d=new SleepDog();
	    d.run(); 
	    System.out.println("---------------------");
	    
	    d=new RedDog();
	   
	    d.run(); 
	 
	    
	    
}
		

	}


