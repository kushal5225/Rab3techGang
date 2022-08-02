import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dogmain {


	public static void main(String[] args) {
		Dog D1=new Dog(4, "leo","yellow");
		Dog D2=new Dog(2, "tom","white");
		Dog D3=new Dog(1, "budddy","black");
		Dog D4=new Dog(4, "leo","yellow");
		
		
	List<Dog> A=new ArrayList<>();
	A.add(D1);
	A.add(D2);
	A.add(D3);
	A.add(D4);
	System.out.println("----------------does a contains d2----------------------------------------");
	System.out.println(A.contains(D2));
	System.out.println("---------------------------------------------------------");
	  //sorting (here elements are sorted by age)
	  Collections.sort(A);
	  System.out.println(D2);
	  
	  System.out.println("------------Sorting on the base of name---------------");
	  
	  Collections.sort(A,new SortBaseOnName());
	  System.out.println(A);
	  
	  System.out.println("------------Sorting on the base of Color---------------");
	  Collections.sort(A, new SortOnColor ());
	  System.out.println(A);
	  
	  System.out.println("---------------------------------------------------------");
	
	  
	  System.out.println(D1.equals(D4));  //contain base
	  
	  System.out.println("---------------------------------------------------------");
	  
	  System.out.println(D1.hashCode());
	  System.out.println(D4.hashCode());
	  
	  
	}

}
