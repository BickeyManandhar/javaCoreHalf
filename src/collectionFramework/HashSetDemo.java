package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("Zung");
		s1.add("Aashis");
		s1.add("Bickey");
		s1.add("Zung"); //duplicate element is not allowed.
		s1.add("Yang");
		s1.add("Eric");
		
		//order is not maintained as input
		for(String tempa: s1) {
			System.out.println(tempa);
		}
		System.out.println("---------------");
		Set<Integer> s2 = new HashSet<>();
		s2.add(23);
		s2.add(19);
		s2.add(0);
		s2.add(11);
		s2.add(2);
		s2.add(14);
		
		for(Integer tempaa: s2) {
			System.out.println(tempaa);
		}

	}

	}

