package ThrowException;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
	
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name=scanner.nextLine();
			try {
			if(name.equals("Kushal")) {
				Exception exception=new Exception("You are not allowed");
				throw exception; // here it is used to throw the exception.
			}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("---- catch block----------------");
			}
			
			System.out.println("hello...."+name);

	}

}
