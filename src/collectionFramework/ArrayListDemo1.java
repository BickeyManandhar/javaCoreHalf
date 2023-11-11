package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList<>(); // We can insert any type of data here
		arr.add("Bikram");
		arr.add("Anish");
		arr.add("Xui");
		arr.add('A');
		arr.add(12);
		arr.add(12.5);
		System.out.println(arr);
		System.out.println("---------------");
		
		ArrayList<String> st = new ArrayList<String>();	//we can only add String type of data 
		st.add("Bickey");
		st.add("Avash");
		st.add("Bickey");//duplicate element allowed
		st.add("Chandra");
		st.add("Kushal");
		st.add("Rohit");
		st.add("Sabin");
		
		Iterator<String> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		st.remove(st.size()-1);
		
		System.out.println("---------------After removing last element---------------");
		System.out.println("---------------Iterating using Iterator---------------");
		
		Iterator<String> it2 = st.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("---------------Iterating using for-each loop---------------");
		for(String temp:st) {
			System.out.println(temp);
		}
		
		System.out.println("---------------Iterating using for loop---------------");
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
		}
		
		//sort the data elements
		System.out.println("---------------Sorting: ---------------");
		Collections.sort(st); 
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
		}
		
		//searching
		System.out.println("---------------Searching: ---------------");
		System.out.println("It has Bickey? : "+st.contains("Bickey"));

	}

}
