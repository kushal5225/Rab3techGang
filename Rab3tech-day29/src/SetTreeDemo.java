import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTreeDemo {

	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<>();
		
					 set.add(5);
					 set.add(7);
					 set.add(15);
					 set.add(2);
					 set.add(9);
					 System.out.println(set);
					 System.out.println("------------------------------------------");
		
		Set<String> set2=new TreeSet<>();
		 	 set2.add("Kushal");
			 set2.add("Ram");
			 set2.add("Sita");
			 set2.add("Mohan");
			
			 System.out.println(set2);
			 System.out.println("----------------Search Operation--------------------------");
			 
			 System.out.println(set2.contains("Kushal"));
			 
			 System.out.println("----------------for Loop--------------------------");
			
			 for ( String temp :set2 ) {
			 System.out.println(temp);

			 }
			 System.out.println("---------------Iterator--------------------------");
			 
			 Iterator<String> itr= set2.iterator();
			 while(itr.hasNext()) {
				 System.out.println(itr.next());
			 }
			 
	}

}
