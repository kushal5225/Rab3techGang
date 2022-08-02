package MapInterface;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		HashMap<String,String> map = new HashMap<>();
		map.put("50", "kushal");
		map.put("150", "kushal");
		map.put("250", "Ram");
		map.put("null", "null");
		map.put("450", "Sita");  
		map.put("650", "null");
		System.out.println(map);
		
		System.out.println("--------------------------------------");
		
		String xyz= map.put("150", "Fum");
		System.out.println(map);
		
		System.out.println("--------------------------------------");
		System.out.println(xyz);
		System.out.println("--------------------------------------");
		
		Set<String> keys= map.keySet();
		for(String temp : keys) {
			System.out.println(temp+ " "+map.get(temp));
		}
		System.out.println("-------Print values Data-----");
	     System.out.println(map.values());
	}

}
