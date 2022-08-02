package ReverseProject;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println(set);
		System.out.println("------------------------------");
		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(5);
		set1.add(4);
		set1.add(3);
		set1.add(2);
		set1.add(1);
		
		System.out.println(set1);
		System.out.println("------------------------------");
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(51);
		set2.add(42);
		set2.add(93);
		set2.add(64);
		set2.add(85);
		
		System.out.println(set2);
		System.out.println("------------------------------");
		
		
		Set<String> set3 = new HashSet<>();
		set3.add("kushal");
		set3.add("kushala");
		set3.add("kushalz");
		set3.add("kushalf");
		set3.add("kushalb");
		set3.add("kushalj");
		
		System.out.println(set3);
		System.out.println("------------------------------");
		
		Set<String> set4 = new LinkedHashSet<>();
		set4.add("kushali");
		set4.add("kushalg");
		set4.add("kushale");
		set4.add("kushalm");
		set4.add("kushalq");
		
		System.out.println(set4);
		System.out.println("------------------------------");
		
		Set<String> set5 = new TreeSet<>();
		set5.add("kushaloi");
		set5.add("kushalgp");
		set5.add("kushalee");
		set5.add("kushalmv");
		set5.add("kushalqp");
		System.out.println(set5);
		System.out.println("------------------------------");
		

	}

}
