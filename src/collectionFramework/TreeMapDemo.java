package collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//data will be sorted on the basis on key
		
		Map<Integer, String> tm1 = new TreeMap<>();
		tm1.put(10, null); //null value is allowed
		tm1.put(5, "Bishal");
		tm1.put(11, "Camren");
		tm1.put(20, "Sushil");
		tm1.put(8, "Suresh");
		//tm1.put(null, "Bickey"); null key is not allowed
		System.out.println(tm1);

	}

}
