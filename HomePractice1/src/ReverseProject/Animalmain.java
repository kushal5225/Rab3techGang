package ReverseProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Animalmain {

	public static void main(String[] args) {
		
 AnimalCollection a =new AnimalCollection(5,"Tiger");
 AnimalCollection b =new AnimalCollection(7,"Dog");
 AnimalCollection c =new AnimalCollection(2,"cat");
 AnimalCollection d =new AnimalCollection(3,"rat");
 AnimalCollection e =new AnimalCollection(9,"lion");
 AnimalCollection f =new AnimalCollection(5,"Tiger");
 
 List<AnimalCollection> list = new ArrayList<>();
       list.add(a);
       list.add(b);
       list.add(c);
       list.add(d);
       list.add(e);
       list.add(f);
      
        Collections.sort(list);
        System.out.println(list);
       
        System.out.println("---------------------------------------------------------");
        
        System.out.println(a.hashCode()+" "+c.hashCode() );
        
        System.out.println("---------------------------------------------------------");
        
 System.out.println(a.equals(f));
	}

}
