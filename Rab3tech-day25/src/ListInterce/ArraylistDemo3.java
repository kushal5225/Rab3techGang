package ListInterce;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList arr = new ArrayList();
       arr.add("kushal");
       arr.add("Ram");
       arr.add(500);
       arr.add(200);
       arr.add('K');
       arr.add('S');
       
       		System.out.println(arr);
       		System.out.println("----------------------------------------");
       		ArrayList<String> arr1 = new ArrayList<String>();
       		arr1.add("Kushal");
       		arr1.add("Ram");
       		arr1.add("Shyam");
       		arr1.add("Rada");
       		
       		System.out.println(arr1);
       		System.out.println("----------------------------------------");
       		
       		ArrayList<Integer> arr2 = new ArrayList<Integer>();
       		arr2.add(5);
       		arr2.add(10);
       		arr2.add(15);
       		arr2.add(20);
       		
       		
       		System.out.println(arr2);
       		
       		
       		System.out.println("---------for loop-------------------------------");
       		
       		for(int temp: arr2) {
           		System.out.println(temp);
           		}
           		
           		System.out.println("-----Iterator-------");
           		Iterator<String> itr=arr1.iterator();
           		while(itr.hasNext()) {
           			System.out.println(itr.next());
           			
           		}
       		
	}

}
