/**
 * 
 */

/**
 * @author Wei
 *
 */
public class RandomChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		System.out.println((int)(time % 25));
		int num = (int)(time % 25) + 65;
		
		System.out.println((char)num);
	}

}
