import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a fixed thread pool with maximum three threads
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		// Submit runnable tasks to the executor
		executor.execute(new PrintChar('a', 100));
		executor.execute(new PrintChar('b', 100));
		executor.execute(new PrintNum(100));
		
		// Shut down the executor
		executor.shutdown();
	}
}

//The task for printing a character a specified number of times
class PrintChar implements Runnable {
	private char charToPrint;  // The character to print
	private int times;  // The number of times to repeat
	
	/**
	 * Construct a task with specified character and number of
	 * times to print the character
	 */
	public PrintChar(char c, int t) {
		charToPrint = c;
		times = t;
	}
	
	/**
	 * Override the run() method to tell the system
	 * what task to perform
	 */
	public void run() {
		for (int i = 0; i < times; i ++) {
			System.out.print(charToPrint);
		}
	}
}

//The task class for printing numbers from 1 to n for a given n
class PrintNum implements Runnable {
	private int lastNum;
	
	/** Construct a task for printing 1, 2, ..., n */
	public PrintNum(int n) {
		lastNum = n;
	}
	
	/** Tell the thread how to run */
	public void run() {
		for (int i = 1; i <= lastNum; i ++) {
			System.out.print(" " + i);
		}
	}
}
