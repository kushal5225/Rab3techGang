
public class Stringdemo3 {

	public static void main(String[] args) {
		
		StringBuilder A=new StringBuilder("91999999239");
		A.append("000"); 
		System.out.println(A);
		System.out.println("--perform delete operation---");
		A.delete(3,5);
		
		System.out.println(A);
		
		System.out.println("--perform reverse operation---");
		System.out.println(A.reverse()); 
	

	}

}
