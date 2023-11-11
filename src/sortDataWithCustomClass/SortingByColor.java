package sortDataWithCustomClass;

import java.util.Comparator;

public class SortingByColor implements Comparator<MobilePhone> {

	// separate class is made to implement Comparator for specific attribute example
	// Color, name, ...
	// compare method in Comparator
	// two parameter
	@Override
	public int compare(MobilePhone o1, MobilePhone o2) {
		int x= (o1.getColor()).compareTo(o2.getColor());
		return x;
	}

}
