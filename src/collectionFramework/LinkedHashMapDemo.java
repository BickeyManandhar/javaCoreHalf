package collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> llm1 = new LinkedHashMap<>();
		llm1.put("Bickey", "Nepal");
		llm1.put("Zaved", "India");
		llm1.put("Xung", "China");
		llm1.put("Kim", "Korea");
		llm1.put("Aashis", "Nepal");// Duplicate value is allowed
		llm1.put("Xung", "Vietnam");// Duplicate key is not allowed
									// this will over-ride the value - China
		llm1.put(null, "UK");
		llm1.put("John", null);
		llm1.put(null, null); // we have null key before this, but this will over-ride the value above

		for (Map.Entry<String, String> entry : llm1.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}

}
