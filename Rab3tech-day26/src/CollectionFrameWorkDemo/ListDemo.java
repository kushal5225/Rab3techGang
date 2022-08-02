package CollectionFrameWorkDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {

		System.out.println("----------Start-----------------");
		
		System.out.println("-----------ArrayList-----------------");
		List<String>  list=new ArrayList<>();
			list.add("kushal");
			list.add("Ram");
			list.add("Shyam");
			list.add("Mohan");
			System.out.println(list);
			list.remove("Shyam");
			
			System.out.println(list);
			
			System.out.println("-----------sort-----------------");
			Collections.sort(list);
		     System.out.println(list);
			
			
			System.out.println("---search operation on list-----");
			System.out.println(list.contains("Ram")); 
			System.out.println(list.contains("Mohan"));
			
			
       		System.out.println("---------for loop-------------------------------");
       		
       		for(String temp: list) {
           		System.out.println(temp);
           		}
           		
           		System.out.println("----------------Iterator-----------------------");
           		Iterator<String> itr=list.iterator();
           		while(itr.hasNext()) {
           			System.out.println(itr.next());
           			
           		}
			
		
			
			System.out.println("-----------------LinkedList--------------------");
			List<String>  list2=new LinkedList<>();
					list2.add("Ram");
					list2.add("Shyam");
					list2.add("leo");
					list2.add("Aman");
					System.out.println(list2);
					list2.remove("Aman");
					System.out.println("-----------sort-----------------");
					Collections.sort(list);
				    System.out.println(list);
					
					
					System.out.println("---search operation on list2----");
					
					System.out.println(list.contains("Ram")); 
					System.out.println(list.contains("Leo"));
					
					
					System.out.println("---------for loop-------------------------------");
		       		
		       		for(String temp: list) {
		           		System.out.println(temp);
		           		}
		           		
		           		System.out.println("---------Iterator---------");
		           		Iterator<String> itr1=list.iterator();
		           		while(itr1.hasNext()) {
		           			System.out.println(itr1.next());
		           			
		           		}
		
			System.out.println("-------------vector-----------");
				List<String> list3=new Vector<>();
				list3.add("rita");
				list3.add("gita");
				list3.add("mina");
				list3.add("sita");
				System.out.println(list3);
				list3.remove("mina");
				System.out.println(list3);
				System.out.println("-----------sort-----------------");
				Collections.sort(list);
				  System.out.println(list);
				
				System.out.println("---search operation on list-----");
				
				System.out.println(list.contains("gita")); 
				System.out.println(list.contains("sita"));
				
				System.out.println("---------for loop-------------------------------");
	       		
	       		for(String temp: list) {
	           		System.out.println(temp);
	           		}
	           		
	           		System.out.println("-----Iterator-------");
	           		Iterator<String> itr3=list.iterator();
	           		while(itr3.hasNext()) {
	           			System.out.println(itr3.next());
	           			
	           		}
				
				System.out.println("---------------Stack-----");
				List<String> list4=new Stack<>();
				list4.add("ram");
				list4.add("Mahesh");
				list4.add("Pratima");
				list4.add("Aman");
				System.out.println(list4);
				list.remove("ram");
				System.out.println(list4);
				System.out.println("-----------sort-----------------");
				Collections.sort(list);
				  System.out.println(list);
				
				
				System.out.println("---search operation on list-----");
				System.out.println(list.contains("Ram")); 
				System.out.println(list.contains("Aman"));
				
				System.out.println("---------for loop-------------------------------");
	       		
	       		for(String temp: list) {
	           		System.out.println(temp);
	           		}
	           		
	           		System.out.println("-----Iterator-------");
	           		Iterator<String> itr4=list.iterator();
	           		while(itr4.hasNext()) {
	           			System.out.println(itr4.next());
	           			
	           		}
				
				System.out.println("------------------------end-------------");
	}

}
