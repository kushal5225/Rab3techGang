package ThrowException;

import java.util.Scanner;

public class ThrowException {
	static private String takeInput() throws Exception {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name---");
		String name=scanner.nextLine();

if(name.equals("kushal")) {
	Exception exception=new Exception("ArithmeticException");
	throw exception;//throw is used to throw an exception
       }
return name;
}

public static void main(String[] args) {
	String name=null;
	
	try {
	name=takeInput();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		return;
	
	}
System.out.print("my name is: "+name);
}
}
