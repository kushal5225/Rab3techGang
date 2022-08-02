import java.util.Scanner;

//write a program to accept 3 side of triangle and display which type of triangle
public class Question_19 {
	static int side1 ;
	static int side2;
	static int side3;
	
	
	public void Scalan(){
		if ((side1!=side2 ) && (side2!=side3 ) &&(side3!=side1  )) {
			System.out.println("This is Scalan  triangle.");
		}
	}
	public void Isoceles() {
		 if ((side1==side2 ) && (side1==side2 ) &&(side1!=side2 )) {
				System.out.println("This is Isoceles  triangle.");
			 }
				else if((side2==side1 ) && (side2==side3 ) &&(side2!=side1 )){
					System.out.println("This is Isoceles  triangle.");
				}
				else if((side1==side2 ) && (side1!=side3) &&(side3!=side2 )){
						System.out.println("This is Isoceles  triangle.");
				}
	}
	
	public void Equilateral() {
		
	if ((side1==side2 ) && (side2==side3 ) &&(side3==side1 )){
		System.out.println("This  is Equilateral triangle.");
	}
	}
	
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter side1: ");
		side1=sc.nextInt();
		System.out.print("Enter side2: ");
		side2=sc.nextInt();
		System.out.print("Enter side3: ");
		side3=sc.nextInt();
		
		Question_19 qc=new 	Question_19();
		qc.Scalan();
		qc.Isoceles();
		qc.Equilateral();
		

		
		
		
			
	

	}


}