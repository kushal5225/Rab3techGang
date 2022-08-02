import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
Set<String>  set1 =new LinkedHashSet<>();
set1.add("kushal");
set1.add("Ram");;
set1.add("Shyam");;
set1.add("Mohan");;
set1.add("Rita");;

System.out.println(set1);
System.out.println("------------------------------------------");

System.out.println("----------------Search Operation--------------------------");

System.out.println(set1.contains("kushal"));

System.out.println("----------------for each Loop--------------------------");

for ( String temp :set1 ) {
System.out.println(temp);

}
System.out.println("---------------Iterator--------------------------");

Iterator<String> itr= set1.iterator();
while(itr.hasNext()) {
	 System.out.println(itr.next());
}
	}

}
