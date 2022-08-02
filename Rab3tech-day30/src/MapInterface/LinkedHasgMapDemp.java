package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasgMapDemp {

	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<>();
		map.put("50", "kushal");
		map.put("150", "kushal");
		map.put("250", "Ram");
		map.put("null", "null");
		map.put("450", "Sita");
		map.put("650", "null");
		System.out.println(map);

	}

}
