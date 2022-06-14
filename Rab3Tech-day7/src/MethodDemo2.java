/**
 * 
 */

/**
 * @author kushalshrestha
 *
 */
public class MethodDemo2 {
	
	 static int magic(int input) {
	    	int result=5000 / input;
	    	return result+1;
	    }
	    

	 static void chill() {
	       
	        System.out.println("kushal");
	      
	    }
	    
	    static void printa(int pp) {
	        
	        System.out.println("-------");
	        System.out.println("-------"+pp+"--------");
	        System.out.println("-------------------------------");
	    }
	public static void main(String[] args) {
		
		int wow=magic(5);  
	    System.out.println(wow); 
	    wow=magic(4);
	    System.out.println(wow); 
	    
	    printa(wow);
	        
	    chill();    
	        System.out.println("----------sum method------");
	   
	}

}
