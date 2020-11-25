
public class MyLinkedList<E> extends MyAbstractList<E> {
	private Node<E> head, tail;
	
	/** Create a default list */
	public MyLinkedList() {
		
	}
	
	/** Create a list from an array of objects */
	public MyLinkedList(E[] objects) {
		super(objects);
	}	
	
	/** Return the head element in the list */
	public E getFirst() {
		if (size == 0) {
			return null;
		} else {
			return head.element;
		}
	}
	
	/** Return the last element in the list */
	public E getLast() {
		if (size == 0) {
			return null;
		} else {
			return tail.element;
		}
	}
	
	/** Add an element to the beginning of the list */
	public void addFirst(E e) {
		
	}
	
	/** Add an element to the end of the list */
	public void addLast(E e) {
		
	}
	
	/**
	 * Add a new element at the specified index in this list
	 * The index of the head element is 0
	 */
	public void add(int index, E e) {
		
	}
	
	/**
	 * Remove the head node and
	 * return the object that is contained in the removed node.
	 */
	public E removeFirst() {
		return null;
	}
	
	/**
	 * Remove the last node and
	 * return the object that is contained in the removed node.
	 */
	public E removeLast() {
		return null;
	}
	
	/**
	 * Remove the element at the specified position in this list
	 * Return the elmeent that was removed from the list
	 */
	public E remove(int index) {
		return null;
	}
	
	/** Override toString() to return elements in the list */
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		
		Node<E> current = head;
		for (int i = 0; i < size; i ++) {
			result.append(current.element);
			current = current.next;
			if (current != null) {
				result.append(", "); // Separate two elements with a comma
			} else {
				result.append("]"); // Insert the closing ] in the string
			}
		}
		
		return result.toString();
	}
	
	/** Clear the list */
	public void clear() {
		head = tail = null;
	}
	
	/** Return true if this list contains the element o */
	public boolean contains(E e) {
		System.out.println("Implementation left as an exercise");
		return true;
	}
	
	/** Return the element from this list at the specified index */
	public E get(int index) {
		System.out.println("Implementation left as an exercise");
		return null;
	}
	
	/**
	 * Return the index of the head matching element in this list
	 * Return -1 if no match
	 */
	public int indexOf(E e) {
		System.out.println("Implementation as an exercise");
		return 0;
	}
	
	/**
	 * Return the index of the last matching element in this list
	 * Return -1 if no match
	 */
	public int lastIndexOf(E e) {
		System.out.println("Implementation left as an exercise");
		return 0;
	}
	
	/**
	 * Replace the element at the specified position in this list
	 * with the specified element
	 */
	public E set(int index, E e) {
		System.out.println("Implementation left as an exercise");
		return null;
	}
	
	private static class Node<E> {
		E element;
		Node<E> next;
		
		public Node(E element) {
			this.element = element;
		}
	}
}
