package collectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		Set<Integer> s1 = new LinkedHashSet<>();
		s1.add(100);
		s1.add(2);
		s1.add(50);
		
		for(Integer tempa: s1) {
			System.out.println(tempa);
		}
	}

}
