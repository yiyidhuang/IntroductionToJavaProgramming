
public class WildCardDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack<Integer> intStack = new GenericStack<Integer>();
		intStack.push(1); // 1 is autoboxed into new Integer()
		intStack.push(2);
		intStack.push(-2);
		
		print(intStack);
	}

	/** Prints objects and empties the stack */
	public static void print(GenericStack<?> stack) {
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}
	}
}
