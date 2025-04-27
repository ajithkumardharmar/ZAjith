package durgasoft.Collections;

import java.util.Comparator;

public class ComparatorExample implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		return i2-i1;
	}
	

}
