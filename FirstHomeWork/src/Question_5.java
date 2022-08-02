//Q5. Write a program to find the area of a circle,  rectangle, and triangle.
public class Question_5 {

	public static void main(String[] args) {
		
	double pie=3.14;
	int r= 10;
	 double Circle;
	 
	 Circle=pie*r*r;
	 System.out.println("the Area of circle is: "+Circle);
	 
	 
	 System.out.println("------------------------------------------------");
	 int length=4;
	 int width=2;
	 int rectangle;
	 
	  rectangle=length*width;
	  System.out.println("the Area of rectangle is: "+rectangle);
	  
		 
      System.out.println("------------------------------------------------");
	  
	   int height=5;
	   int base =4;
	   int triangle;
	    
	   triangle=(height*base)/2;
		  System.out.println("the Area of triangle is: "+triangle);
	}

}
