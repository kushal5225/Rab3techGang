import java.util.Scanner;

/**
 * 
 */

/**
 * @author kushalshrestha
 *
 */
public class ProfitLossDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Float costprice;
			Float SellingPrice;
			
			
			
		Scanner Sn=new Scanner(System.in);
		
		System.out.println("Please enter costprice  = ");
	    costprice=Sn.nextFloat();
	    
	    System.out.println("Please enter  SellingPrice = ");
	    SellingPrice=Sn.nextFloat();
	    
	   if (SellingPrice>costprice ) {
		   System.out.println("The shopkepper make profits ");
	   }
		   else if (SellingPrice==costprice )
		   {
			   
			   System.out.println("The shopkepper breakeven ");
		   }
		   else {
	   System.out.println("The shopkepper breakeven ");
	    	
	    }
	}}



