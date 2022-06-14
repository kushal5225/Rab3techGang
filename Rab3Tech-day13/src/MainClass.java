/**
 * 
 */

/**
 * @author kushalshrestha
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d= new Dog();
    d.run();
    d.walk();
    
    System.out.println(" ------------------   ");
    System.out.println(" ----UpCasting-----   ");
    
    Dog dg;
         dg= new BarkDog();
         dg.run();
         dg.walk();
         
            
         System.out.println(" ---creating object of barkdog----   ");
         
         BarkDog db = new BarkDog();
         db.Bark();
         db.run();
         db.walk();
         
         
         System.out.println(" ---DownCasting----   ");
    
         Dog e;
             e= new BarkDog();
              BarkDog dd =(BarkDog)e;
              
              dd.Bark();
              dd.run();
              dd.walk();
              
              
              System.out.println(" The name of dog is "+dd.name);
              System.out.println(" The dog has "+dd.tail+" tail");
              System.out.println(" The dog has "+dd.eye+" eye");
              System.out.println(" The dog has "+dd.leg+" leg");
              
             
    
    
    
    
	}

}
