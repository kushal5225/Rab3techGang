package MapInterface;

import java.util.Hashtable;

public class HashTapbleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Hashtable<String,String> map =new Hashtable<>();
	map.put("50", "kushal");
	map.put("150","kushal");
	map.put("250","Ram");
	map.put("null","null");
	map.put("450", "Sita");
	map.put("650", "null");
	System.out.println(map);

	Hashtable<Integer,String> map1 =new Hashtable<>();
	map1.put(50, "kushal");
	map1.put(150,"kushal");
	map1.put(250,"Ram");
	//map1.put(null,"null");
	map1.put(450, "Sita");
	map1.put(650, "null");
	System.out.println(map1);

	}

} 
