package sortLibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryMainSortByAuthorName {
//sorting on the basis of author_name
	public static void main(String[] args) {
		// initializing values using parameterized constructor
		LibrarySortByAuthorName lib1 = new LibrarySortByAuthorName(678, "Ted", 2000);
		LibrarySortByAuthorName lib2 = new LibrarySortByAuthorName(123, "John", 1998);
		LibrarySortByAuthorName lib3 = new LibrarySortByAuthorName(345, "Chris", 1999);
		LibrarySortByAuthorName lib4 = new LibrarySortByAuthorName(002, "Abharam", 1997);
		

		// adding the reference of Library which is holding its object in an ArrayList
		List<LibrarySortByAuthorName> ls = new ArrayList<>();
		ls.add(lib1);
		ls.add(lib2);
		ls.add(lib3);
		ls.add(lib4);

		// printing list before sorting using for-each loop
		System.out.println("List before sorting by author_name: ");
		for (LibrarySortByAuthorName tempa : ls) {
			System.out.println(tempa);
		}

		Collections.sort(ls); // sorting implementing Comparable in Library class
		
		System.out.println("---------------------------------");
		// printing list after sorting using for-each loop
		System.out.println("List after sorting by author_name: ");
		for (LibrarySortByAuthorName tempa : ls) {
			System.out.println(tempa);
		}
	}

}
