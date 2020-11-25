import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a hash set
		Set<String> set = new LinkedHashSet<String>();
		
		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
		
		// Display the elements in the hash set
		for (Object element: set)
			System.out.print(element.toString().toLowerCase() + " ");
	}

}
