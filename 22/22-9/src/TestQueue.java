
public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Queue<String> queue = 
				new java.util.LinkedList<String>();
		
		queue.offer("Oklahoma");
		queue.offer("Indiana");
		queue.offer("Georgia");
		queue.offer("Texas");
		
		while (queue.size() > 0)
			System.out.print(queue.remove() + " ");;
	}

}
