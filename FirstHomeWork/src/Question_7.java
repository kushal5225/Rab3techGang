import java.util.Scanner;

// Q7. Write a program to reads the radius  and length of a cylinder and computes volume.
public class Question_7 {

	public static void main(String[] args) {
		float radius;
		float height;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius: ");
		radius=sc.nextFloat();
		System.out.print("Enter Height: ");
		height=sc.nextFloat();
		
		 
	double pie=3.14;
	double volume;
	 
	volume=pie*radius*radius*height;
	
	System.out.println("the volume of Cyclinder: "+volume);
	

	}

}
