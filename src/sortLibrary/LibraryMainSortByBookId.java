package sortLibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryMainSortByBookId {
//sorting on the basis of book_id
	public static void main(String[] args) {
		// initializing values using parameterized constructor
		LibrarySortByBookId lib1 = new LibrarySortByBookId(678, "Ted", 2000);
		LibrarySortByBookId lib2 = new LibrarySortByBookId(123, "John", 1998);
		LibrarySortByBookId lib3 = new LibrarySortByBookId(345, "Chris", 1999);
		LibrarySortByBookId lib4 = new LibrarySortByBookId(002, "Abharam", 1997);
		

		// adding the reference of Library which is holding its object in an ArrayList
		List<LibrarySortByBookId> ls = new ArrayList<>();
		ls.add(lib1);
		ls.add(lib2);
		ls.add(lib3);
		ls.add(lib4);

		// printing list before sorting using for-each loop
		System.out.println("List before sorting by book_id: ");
		for (LibrarySortByBookId tempa : ls) {
			System.out.println(tempa);
		}

		Collections.sort(ls); // sorting implementing Comparable in Library class
		
		System.out.println("---------------------------------");
		// printing list after sorting using for-each loop
		System.out.println("List after sorting by book_id: ");
		for (LibrarySortByBookId tempa : ls) {
			System.out.println(tempa);
		}
	}

}
