package collectionFramework;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> s3 = new HashSet<>();
		s3.add("Zung");
		s3.add("Aashis");
		s3.add("Bickey");
		s3.add("Zung"); //duplicate element is not allowed.
		s3.add("Yang");
		s3.add("Eric");
		
		//order is not maintained as input
		for(String tempa: s3) {
			System.out.println(tempa);
		}
		
		System.out.println("---------------");
		
		Set<Integer> s4 = new HashSet<>();
		s4.add(23);
		s4.add(19);
		s4.add(0);
		s4.add(11);
		s4.add(2);
		s4.add(14);
		
		
		System.out.println("-------HashSet Integer Part--------");
		for(Integer tempa: s4) {
			System.out.println(tempa);
		}
		
		System.out.println("---------------");
		Set<String> s1 = new LinkedHashSet<>();
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
		Set<Integer> s2 = new LinkedHashSet<>();
		s2.add(23);
		s2.add(19);
		s2.add(0);
		s2.add(11);
		s2.add(2);
		s2.add(14);
		
		System.out.println("-------LinkedHashSet Integer Part--------");
		
		for(Integer tempaa: s2) {
			System.out.println(tempaa);
		}

	}

	}

