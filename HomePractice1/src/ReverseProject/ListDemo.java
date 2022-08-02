package ReverseProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
	List<String> k= new ArrayList<>();
	k.add("kushal");
	k.add("ram");
	k.add(1,"Chandrea");
	System.out.println(k);
	System.out.println("----------------search operation------------------------------");
	System.out.println(k.contains("kushal"));
	System.out.println(k.contains("Ram"));
	System.out.println("----------------Sort------------------------------");
	Collections.sort(k);
	System.out.println(k);
	System.out.println("--------------------each for loob--------------------------");
	for(String temp:k ) {
		System.out.println(temp);
	}
	System.out.println("---------------Iterator-------------------------------");
	Iterator<String> z=k.iterator();
	while(z.hasNext()) {
		System.out.println(z.next());
		
	}
	System.out.println("----------------------------------------------");
	
	List<String> a=new LinkedList<>();
	a.add("Rejina");
	a.add("Ganga");
	a.add("Uttar");
	System.out.println(a);
	System.out.println("---------------Iterator for Linkedlist------------------------------");
	Iterator<String> zoo= a.iterator();
	while(zoo.hasNext()) {
		System.out.println(zoo.next());
	}
	
	System.out.println("----------------------------------------------");
	List<String> b=new Vector<>();
	b.add("Rejina");
	b.add("Ganga");
	b.add("Uttar");
	System.out.println(b);
	System.out.println("----------------search operation------------------------------");
	System.out.println(b.contains("Ganga"));
	System.out.println("----------------Sort------------------------------");
	Collections.sort(b);
	System.out.println(b);
	System.out.println("--------------------each for loob--------------------------");
	for( String temp: b) {
		System.out.println(temp);
	}
	System.out.println("---------------Iterator-------------------------------");
	Iterator<String> q=b.iterator();
	while(q.hasNext()) {
		System.out.println(q.next());
		
	}
	System.out.println("----------------------------------------------");
	
	}

}
