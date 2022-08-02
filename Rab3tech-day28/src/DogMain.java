import java.util.ArrayList;
import java.util.List;

public class DogMain {

	public static void main(String[] args) {
		
		Dog d1=new Dog(7,"Leo");
		Dog d2=new Dog(3,"Tom");
		Dog d3=new Dog(2,"Buddy");
		Dog d4=new Dog(7,"Leo"); 
		
		List<Dog> list=new ArrayList<>();
				  list.add(d1);
				  list.add(d2);
				  list.add(d3);
				  list.add(d4);
				  
				  System.out.println(list);
				  
				  System.out.println("------------------------------------------"); 
			System.out.println(d1.hashCode()+" "+d4.hashCode());
			System.out.println("------------------------------------------");
			System.out.println(d2.hashCode());
			System.out.println(d3.hashCode());
			System.out.println("--------------------------------------");
			System.out.println(d1.equals(d4));
	}
}
