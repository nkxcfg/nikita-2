package main;

import java.util.Comparator;

/** Sorting dogs by name ascending  .
 * @author nikita.kazakov
 *
 */
public class SortByNameAsc implements Comparator<Dog>{

	@Override
	public int compare(Dog dog1, Dog dog2) {
		return dog1.getName().compareTo(dog2.getName());
	}
	
}