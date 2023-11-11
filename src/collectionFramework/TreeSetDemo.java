package collectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<>();
		s1.add(23);
		s1.add(12);
		s1.add(1);
		s1.add(5);
		s1.add(0);
		s1.add(28);
		s1.add(45);
		s1.add(20);
		s1.add(65);
		s1.add(6);
		
		//TreeSet internally uses concept of R-B tree 
		//R-B tree is extended version of BST
		//So the data are sorted
		for(Integer tempa: s1) {
			System.out.println(tempa);
		}

	}

}
