package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// key must be unique
		// value can be duplicate
		// ENTRY: combination of key and value
		Map<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "Bickey");
		hm1.put(2, "Zung");
		hm1.put(3, "Aashis");
		hm1.put(4, "Bishal");
		// hm1.put(1, "Bickey"); //duplicate key not allowed
		hm1.put(5, "Bickey"); // duplicate value is allowed
		hm1.put(5, "Bickey");
		hm1.put(null, null);// allowed but will not be printed because below we have another null key with
							// value which will over-ride this
		hm1.put(null, "test");// allowed will be printed as null key
		hm1.put(6, null);// allowed and will be printed
		for (Map.Entry<Integer, String> entry : hm1.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}

	}

}
