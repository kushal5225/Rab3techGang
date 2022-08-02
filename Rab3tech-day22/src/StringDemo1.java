import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter text");
		String str=scanner.nextLine();
		if(str.equalsIgnoreCase("Kushal")) {
			
			System.out.println("I know you.");
			
		}
		else {
			System.out.println("Sorry, Do I know you?");
	}

	}
	}
