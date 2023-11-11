package sortDataWithCustomClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMobilePhone {

	public static void main(String[] args) {
		// creating MobilePhone object
		MobilePhone mp1 = new MobilePhone("Samsung", 800, "black");

		MobilePhone mp2 = new MobilePhone("Oppo", 700, "white");

		MobilePhone mp3 = new MobilePhone("Apple", 1200, "space grey");

		MobilePhone mp4 = new MobilePhone("Google Pixel", 900, "pink");

		MobilePhone mp5 = new MobilePhone("Nokia", 750, "blue");

		List<MobilePhone> listOfPhone = new ArrayList<>();
		listOfPhone.add(mp1);
		listOfPhone.add(mp2);
		listOfPhone.add(mp3);
		listOfPhone.add(mp4);
		listOfPhone.add(mp5);
		System.out.println("Before sorting by price" + listOfPhone + "\n");

		// sorting
		/*
		 * Here Collections.sort(listOfPhone) will not work until you implement
		 * Comparable Before we sort data using Collections.sort(referenceOfClass) when
		 * we have variable with type wrapper class like String, Integer, and so on. But
		 * if we have custom made class as variable type, we need to use Comparable or
		 * Comparator to sort the data. So we have a variable that has type of custom
		 * class, we need Comparable or Comparator to sort data stored in it.
		 */
		Collections.sort(listOfPhone);
		System.out.println("After sorting by price" + listOfPhone + "\n");// using comparable
		Collections.sort(listOfPhone, new SortingByColor()); // using comparator
		System.out.println("After sorting by color" + listOfPhone + "\n");

	}

}
