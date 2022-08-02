import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer>  set =new HashSet<>();
set.add(5);
set.add(4);
set.add(5);
set.add(15);
set.add(52);

System.out.println(set);
System.out.println("------------------------------------------");

List<Integer>  list =new ArrayList<>();
list.add(5);
list.add(4);
list.add(3);
list.add(15);
list.add(52);

System.out.println(list);
System.out.println("----------------Search Operation--------------------------");

System.out.println(set.contains("Kushal"));

System.out.println("----------------for Loop--------------------------");

for (Integer temp :set ) {
System.out.println(temp);

}
System.out.println("---------------Iterator--------------------------");

Iterator<Integer> itr= set.iterator();
while(itr.hasNext()) {
	 System.out.println(itr.next());
	 
}
System.out.println("--------------Sorting--------------------------");

Collections.sort(list);
System.out.println(list);

	}

}
