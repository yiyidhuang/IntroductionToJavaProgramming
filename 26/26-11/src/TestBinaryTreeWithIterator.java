
public class TestBinaryTreeWithIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<String> tree = new BinaryTree<String>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		
		java.util.Iterator iterator = tree.inorderIterator();
		while (iterator.hasNext()) {
			System.out.println(((String)(iterator.next())).toUpperCase());
		}
	}

}
