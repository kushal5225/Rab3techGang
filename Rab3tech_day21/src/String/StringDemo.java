package String;

public class StringDemo {

	public static void main(String[] args) {
	
			String s1 = "kushal";			
			String s2 = "Mother";
			
			String s3 = new String("New York");
			System.out.println(1+3+s1);
			System.out.println(s1+2+3+4);   
			System.out.println(2+3+7+s1+2+3+7); 
			System.out.println(s1+s2); 
			System.out.println("_____________________");		
			String a=s1.toUpperCase();
			 System.out.println(a); 
			 System.out.println(s1.toUpperCase()); 		
		      		 System.out.println("_____________________");
			
			 System.out.println(s1.length());  
			
			 System.out.println(s3.length()); 
			 System.out.println("_____________________");
			

			 char ch=s1.charAt(3);
			 System.out.println(s1.charAt(1));    
			System.out.println(s1.charAt(2));      
			
			
			System.out.println("_____________________");
			
			String str1 = "Agile and scrum";
			String substr = str1.substring(2, 9);
			 System.out.println("Sub String is===" + substr);
			
			 System.out.println("_____________________");
	}

}
