import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a hash set
		Set<String> set = new HashSet<String>();
		
		// Add Strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
		
		// Obtain an iterator for the hash set
		Iterator<String> iterator = set.iterator();
		
		// Display the elements in the hash set
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");	
		}
	}

}
